package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Restrictions{
  @SerializedName("Status")
  @Expose
  private String Status;
  public void setStatus(String Status){
   this.Status=Status;
  }
  public String getStatus(){
   return Status;
  }
}