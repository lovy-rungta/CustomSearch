package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Thumbnail{
  @SerializedName("Credit")
  @Expose
  private String Credit;
  @SerializedName("Title")
  @Expose
  private String Title;
  @SerializedName("Migrated")
  @Expose
  private Boolean Migrated;
  @SerializedName("Caption")
  @Expose
  private String Caption;
  @SerializedName("CompID")
  @Expose
  private Integer CompID;
  @SerializedName("URL")
  @Expose
  private String URL;
  @SerializedName("Name")
  @Expose
  private Integer Name;
  public void setCredit(String Credit){
   this.Credit=Credit;
  }
  public String getCredit(){
   return Credit;
  }
  public void setTitle(String Title){
   this.Title=Title;
  }
  public String getTitle(){
   return Title;
  }
  public void setMigrated(Boolean Migrated){
   this.Migrated=Migrated;
  }
  public Boolean getMigrated(){
   return Migrated;
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
  public void setName(Integer Name){
   this.Name=Name;
  }
  public Integer getName(){
   return Name;
  }
}