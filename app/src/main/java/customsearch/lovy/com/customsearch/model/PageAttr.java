package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class PageAttr{
  @SerializedName("Category")
  @Expose
  private String Category;
  public void setCategory(String Category){
   this.Category=Category;
  }
  public String getCategory(){
   return Category;
  }
}