package customsearch.lovy.com.customsearch.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.TextView;

import java.util.ArrayList;

import customsearch.lovy.com.customsearch.R;
import customsearch.lovy.com.customsearch.model.Items;

/**
 * Created by Lovy on 29-10-2018.
 */

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {
    private ArrayList<Items> itemList;
    private Context context;

    public RvAdapter(Context context, ArrayList<Items> userArrayList) {
        this.context = context;
        this.itemList = userArrayList;
    }

    @Override
    public RvAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        final ViewHolder myViewHolder = new ViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RvAdapter.ViewHolder viewHolder, int position) {

        viewHolder.title.setText(itemList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title;

        public ViewHolder(View view) {
            super(view);
            title = (TextView)view.findViewById(R.id.title);
//            userEmail = (TextView)view.findViewById(R.id.userEmail);
//            userWeb = (TextView)view.findViewById(R.id.userWebPage);
//            userCity = (TextView)view.findViewById(R.id.userCity);

        }
    }

}
