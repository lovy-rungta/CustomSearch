package customsearch.lovy.com.customsearch.main;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import customsearch.lovy.com.customsearch.R;
import customsearch.lovy.com.customsearch.contract.SearchContract;
import customsearch.lovy.com.customsearch.model.Items;
import customsearch.lovy.com.customsearch.presenter.SearchPresenter;

public class MainActivity extends AppCompatActivity implements SearchContract.View, SearchView.OnQueryTextListener{

    SearchPresenter presenter;
    RvAdapter adapter;
    List<Items> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        presenter = new SearchPresenter();
        presenter.setView(this);
    }

    @Override
    public void setRV(ArrayList<Items> items) {
        adapter = new RvAdapter(this,items);
        this.items = items;
        RecyclerView rv = findViewById(R.id.rv_list);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(mLayoutManager);
        rv.setAdapter(adapter);
    }

    @Override
    public void setVisibilityProgressBar(int visibility) {
        findViewById(R.id.progressBar).setVisibility(visibility);
    }

    @Override
    public void showFetchingResultsError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(this);
        ImageView closeButton = (ImageView)searchView.findViewById(R.id.search_close_btn);

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.search_src_text);
                et.setText("");
                items.clear();
                adapter.notifyDataSetChanged();
                searchView.onActionViewCollapsed();
            }
        });
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        String key = "AIzaSyBKfLZPYz27hNs3sHeoO83DiXbpHkMnU5M";
        String cx = "007165872560502793023:3ziurcjw8ek";
        if(checkIfInternetConnected()){
            presenter.loadGoogleResults(key, cx, query);
        }else{
            showFetchingResultsError("No internet connection");
        }
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }

    public  boolean checkIfInternetConnected(){
        final ConnectivityManager connMgr = (ConnectivityManager)
                this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo=connMgr.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
