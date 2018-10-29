package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Request{
  @SerializedName("inputEncoding")
  @Expose
  private String inputEncoding;
  @SerializedName("totalResults")
  @Expose
  private Integer totalResults;
  @SerializedName("startIndex")
  @Expose
  private Integer startIndex;
  @SerializedName("outputEncoding")
  @Expose
  private String outputEncoding;
  @SerializedName("searchTerms")
  @Expose
  private String searchTerms;
  @SerializedName("cx")
  @Expose
  private String cx;
  @SerializedName("count")
  @Expose
  private Integer count;
  @SerializedName("safe")
  @Expose
  private String safe;
  @SerializedName("title")
  @Expose
  private String title;
  public void setInputEncoding(String inputEncoding){
   this.inputEncoding=inputEncoding;
  }
  public String getInputEncoding(){
   return inputEncoding;
  }
  public void setTotalResults(Integer totalResults){
   this.totalResults=totalResults;
  }
  public Integer getTotalResults(){
   return totalResults;
  }
  public void setStartIndex(Integer startIndex){
   this.startIndex=startIndex;
  }
  public Integer getStartIndex(){
   return startIndex;
  }
  public void setOutputEncoding(String outputEncoding){
   this.outputEncoding=outputEncoding;
  }
  public String getOutputEncoding(){
   return outputEncoding;
  }
  public void setSearchTerms(String searchTerms){
   this.searchTerms=searchTerms;
  }
  public String getSearchTerms(){
   return searchTerms;
  }
  public void setCx(String cx){
   this.cx=cx;
  }
  public String getCx(){
   return cx;
  }
  public void setCount(Integer count){
   this.count=count;
  }
  public Integer getCount(){
   return count;
  }
  public void setSafe(String safe){
   this.safe=safe;
  }
  public String getSafe(){
   return safe;
  }
  public void setTitle(String title){
   this.title=title;
  }
  public String getTitle(){
   return title;
  }
}