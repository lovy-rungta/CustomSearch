package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Site{
  @SerializedName("siteId")
  @Expose
  private Integer siteId;
  public void setSiteId(Integer siteId){
   this.siteId=siteId;
  }
  public Integer getSiteId(){
   return siteId;
  }
}