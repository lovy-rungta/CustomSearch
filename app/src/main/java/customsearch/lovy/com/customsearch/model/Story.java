package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Story{
  @SerializedName("Description")
  @Expose
  private String Description;
  @SerializedName("Keywords")
  @Expose
  private String Keywords;
  @SerializedName("PubDate")
  @Expose
  private String PubDate;
  @SerializedName("Headline")
  @Expose
  private String Headline;
  @SerializedName("Migrated")
  @Expose
  private Boolean Migrated;
  @SerializedName("ModDate")
  @Expose
  private String ModDate;
  @SerializedName("type")
  @Expose
  private String type;
  public void setDescription(String Description){
   this.Description=Description;
  }
  public String getDescription(){
   return Description;
  }
  public void setKeywords(String Keywords){
   this.Keywords=Keywords;
  }
  public String getKeywords(){
   return Keywords;
  }
  public void setPubDate(String PubDate){
   this.PubDate=PubDate;
  }
  public String getPubDate(){
   return PubDate;
  }
  public void setHeadline(String Headline){
   this.Headline=Headline;
  }
  public String getHeadline(){
   return Headline;
  }
  public void setMigrated(Boolean Migrated){
   this.Migrated=Migrated;
  }
  public Boolean getMigrated(){
   return Migrated;
  }
  public void setModDate(String ModDate){
   this.ModDate=ModDate;
  }
  public String getModDate(){
   return ModDate;
  }
  public void setType(String type){
   this.type=type;
  }
  public String getType(){
   return type;
  }
}