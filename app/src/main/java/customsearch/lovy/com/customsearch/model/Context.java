package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Context{
  @SerializedName("title")
  @Expose
  private String title;
  public void setTitle(String title){
   this.title=title;
  }
  public String getTitle(){
   return title;
  }
}