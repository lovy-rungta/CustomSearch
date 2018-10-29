package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class GoogleResponse{
  @SerializedName("kind")
  @Expose
  private String kind;
  @SerializedName("context")
  @Expose
  private Context context;
  @SerializedName("queries")
  @Expose
  private Queries queries;
  @SerializedName("searchInformation")
  @Expose
  private SearchInformation searchInformation;
  @SerializedName("items")
  @Expose
  private ArrayList<Items> items;
  @SerializedName("url")
  @Expose
  private Url url;
  public void setKind(String kind){
   this.kind=kind;
  }
  public String getKind(){
   return kind;
  }
  public void setContext(Context context){
   this.context=context;
  }
  public Context getContext(){
   return context;
  }
  public void setQueries(Queries queries){
   this.queries=queries;
  }
  public Queries getQueries(){
   return queries;
  }
  public void setSearchInformation(SearchInformation searchInformation){
   this.searchInformation=searchInformation;
  }
  public SearchInformation getSearchInformation(){
   return searchInformation;
  }
  public void setItems(ArrayList<Items> items){
   this.items=items;
  }
  public ArrayList<Items> getItems(){
   return items;
  }
  public void setUrl(Url url){
   this.url=url;
  }
  public Url getUrl(){
   return url;
  }
}