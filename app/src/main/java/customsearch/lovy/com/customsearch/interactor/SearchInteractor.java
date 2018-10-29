package customsearch.lovy.com.customsearch.interactor;

import android.content.Context;
import android.util.Log;

import java.io.IOException;

import customsearch.lovy.com.customsearch.contract.SearchContract;
import customsearch.lovy.com.customsearch.model.GoogleResponse;
import customsearch.lovy.com.customsearch.sync.ApiClient;
import customsearch.lovy.com.customsearch.sync.Service;
import customsearch.lovy.com.customsearch.sync.network.AppExecutors;
import customsearch.lovy.com.customsearch.sync.network.Resource;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Lovy on 29-10-2018.
 */

public class SearchInteractor implements SearchContract.UseCase {

    public static final String TAG = SearchInteractor.class.getSimpleName();
    private final Service mService;
    private final AppExecutors mExecutors;

    public SearchInteractor() {
        mService = ApiClient.getClient().create(Service.class);
        mExecutors = new AppExecutors();
    }

    @Override
    public void fetchGoogleResults(final String key,final String cx,final String text,final Completion completion) {
        mExecutors.networkIO().execute(new Runnable() {
            @Override
            public void run() {
                mService.fetchGoogleSearchResults(key,cx,text).enqueue(new Callback<GoogleResponse>() {
                    @Override
                    public void onResponse(Call<GoogleResponse> call, final Response<GoogleResponse> response) {
                        if (response.isSuccessful()) {
                            final GoogleResponse body = response.body();
                            mExecutors.mainThread().execute(new Runnable() {
                                @Override
                                public void run() {
                                    if (completion != null) {
                                        completion.didReceiveResponse(Resource.success(body));
                                    }
                                }
                            });
                        } else {
                            try {
                                Log.e(TAG, "fetchGoogleResults: errorBody: \n" );
                            } catch ( NullPointerException e) {
                                Log.e(TAG, "fetchGoogleResults: errorBody: \n" + e.getMessage());
                            }
                            mExecutors.mainThread().execute(new Runnable() {
                                @Override
                                public void run() {
                                        GoogleResponse response = null;
                                        completion.didReceiveResponse(Resource.error("Failed to fetch results",
                                                response));
                                }
                            });
                        }
                    }

                    @Override
                    public void onFailure(Call<GoogleResponse> call, Throwable t) {
                        Log.e(TAG, "fetchGoogleResults: onFailure: \n", t);
                            GoogleResponse response = null;
                            completion.didReceiveResponse(Resource.error("Failed to fetch results",
                                    response));
                    }
                });
            }
        });
    }
}
