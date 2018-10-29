package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Url{
  @SerializedName("template")
  @Expose
  private String template;
  @SerializedName("type")
  @Expose
  private String type;
  public void setTemplate(String template){
   this.template=template;
  }
  public String getTemplate(){
   return template;
  }
  public void setType(String type){
   this.type=type;
  }
  public String getType(){
   return type;
  }
}