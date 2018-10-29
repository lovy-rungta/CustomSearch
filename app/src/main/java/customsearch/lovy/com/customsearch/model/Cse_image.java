package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Cse_image{
  @SerializedName("src")
  @Expose
  private String src;
  public void setSrc(String src){
   this.src=src;
  }
  public String getSrc(){
   return src;
  }
}