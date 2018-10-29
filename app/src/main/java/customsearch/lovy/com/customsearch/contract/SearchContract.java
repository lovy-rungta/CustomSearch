package customsearch.lovy.com.customsearch.contract;

import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import customsearch.lovy.com.customsearch.model.GoogleResponse;
import customsearch.lovy.com.customsearch.model.Items;
import customsearch.lovy.com.customsearch.sync.network.Resource;

/**
 * Created by Lovy on 29-10-2018.
 */

public interface SearchContract {

    interface View  {
        void setRV(ArrayList<Items> items);
        void setVisibilityProgressBar(int visibility);
        void showFetchingResultsError(String message);
    }

    interface Presenter {
        void setView(SearchContract.View view);
        void loadGoogleResults(String key,String cx,String text);
    }

    interface  UseCase {
        void fetchGoogleResults(final String key,final String cx,final String text,final Completion completion);

        interface Completion {
            void didReceiveResponse(Resource<GoogleResponse> resource);
        }
    }
}
