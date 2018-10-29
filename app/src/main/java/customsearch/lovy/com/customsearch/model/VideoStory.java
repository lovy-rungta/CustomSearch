package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class VideoStory{
  @SerializedName("Title")
  @Expose
  private String Title;
  @SerializedName("Caption")
  @Expose
  private String Caption;
  @SerializedName("CompID")
  @Expose
  private Integer CompID;
  @SerializedName("URL")
  @Expose
  private String URL;
  public void setTitle(String Title){
   this.Title=Title;
  }
  public String getTitle(){
   return Title;
  }
  public void setCaption(String Caption){
   this.Caption=Caption;
  }
  public String getCaption(){
   return Caption;
  }
  public void setCompID(Integer CompID){
   this.CompID=CompID;
  }
  public Integer getCompID(){
   return CompID;
  }
  public void setURL(String URL){
   this.URL=URL;
  }
  public String getURL(){
   return URL;
  }
}