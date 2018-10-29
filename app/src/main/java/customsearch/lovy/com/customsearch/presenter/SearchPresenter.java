package customsearch.lovy.com.customsearch.presenter;

import android.content.Context;
import android.view.View;

import customsearch.lovy.com.customsearch.contract.SearchContract;
import customsearch.lovy.com.customsearch.interactor.SearchInteractor;
import customsearch.lovy.com.customsearch.model.GoogleResponse;
import customsearch.lovy.com.customsearch.model.Items;
import customsearch.lovy.com.customsearch.sync.network.Resource;

/**
 * Created by Lovy on 29-10-2018.
 */

public class SearchPresenter implements SearchContract.Presenter {

    private SearchContract.View view;
    private SearchContract.UseCase mInteractor;

    public SearchPresenter() {
        mInteractor = new SearchInteractor();
    }

    @Override
    public void setView(SearchContract.View view) {
        this.view = view;
    }

    @Override
    public void loadGoogleResults(String key, String cx, String text) {
        view.setVisibilityProgressBar(View.VISIBLE);
        mInteractor.fetchGoogleResults(key, cx, text, new SearchContract.UseCase.Completion() {
            @Override
            public void didReceiveResponse(Resource<GoogleResponse> resource) {
                view.setVisibilityProgressBar(View.INVISIBLE);
                switch (resource.status) {
                    case SUCCESS:
                        view.setRV(resource.data.getItems());
                        break;
                    case LOADING:
                        view.setVisibilityProgressBar(View.VISIBLE);
                        break;
                    case ERROR:
                        view.showFetchingResultsError("Failed to fetch results");
                        break;
                    default:
                        break;

                }
            }
        });
    }
}
