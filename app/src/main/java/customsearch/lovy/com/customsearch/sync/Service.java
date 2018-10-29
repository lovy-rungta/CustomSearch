package customsearch.lovy.com.customsearch.sync;

import java.util.concurrent.CopyOnWriteArrayList;

import customsearch.lovy.com.customsearch.model.GoogleResponse;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by Lovy on 29-10-2018.
 */

public interface Service {

    @GET("/customsearch/v1")
    Call<GoogleResponse> fetchGoogleSearchResults(@Query("key") String key, @Query("cx") String cx, @Query("q") String query);
}
