package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Cse_thumbnail{
  @SerializedName("src")
  @Expose
  private String src;
  @SerializedName("width")
  @Expose
  private Integer width;
  @SerializedName("height")
  @Expose
  private Integer height;
  public void setSrc(String src){
   this.src=src;
  }
  public String getSrc(){
   return src;
  }
  public void setWidth(Integer width){
   this.width=width;
  }
  public Integer getWidth(){
   return width;
  }
  public void setHeight(Integer height){
   this.height=height;
  }
  public Integer getHeight(){
   return height;
  }
}