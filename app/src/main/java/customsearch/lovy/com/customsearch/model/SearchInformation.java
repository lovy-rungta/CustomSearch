package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class SearchInformation{
  @SerializedName("searchTime")
  @Expose
  private Double searchTime;
  @SerializedName("totalResults")
  @Expose
  private Integer totalResults;
  @SerializedName("formattedTotalResults")
  @Expose
  private String formattedTotalResults;
  @SerializedName("formattedSearchTime")
  @Expose
  private Double formattedSearchTime;
  public void setSearchTime(Double searchTime){
   this.searchTime=searchTime;
  }
  public Double getSearchTime(){
   return searchTime;
  }
  public void setTotalResults(Integer totalResults){
   this.totalResults=totalResults;
  }
  public Integer getTotalResults(){
   return totalResults;
  }
  public void setFormattedTotalResults(String formattedTotalResults){
   this.formattedTotalResults=formattedTotalResults;
  }
  public String getFormattedTotalResults(){
   return formattedTotalResults;
  }
  public void setFormattedSearchTime(Double formattedSearchTime){
   this.formattedSearchTime=formattedSearchTime;
  }
  public Double getFormattedSearchTime(){
   return formattedSearchTime;
  }
}