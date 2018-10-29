package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Date{
  @SerializedName("sdateformat")
  @Expose
  private String sdateformat;
  @SerializedName("sdate")
  @Expose
  private Long sdate;
  @SerializedName("edateformat")
  @Expose
  private String edateformat;
  @SerializedName("edate")
  @Expose
  private Long edate;
  public void setSdateformat(String sdateformat){
   this.sdateformat=sdateformat;
  }
  public String getSdateformat(){
   return sdateformat;
  }
  public void setSdate(Long sdate){
   this.sdate=sdate;
  }
  public Long getSdate(){
   return sdate;
  }
  public void setEdateformat(String edateformat){
   this.edateformat=edateformat;
  }
  public String getEdateformat(){
   return edateformat;
  }
  public void setEdate(Long edate){
   this.edate=edate;
  }
  public Long getEdate(){
   return edate;
  }
}