package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class Pagemap{
  @SerializedName("Site")
  @Expose
  private List<Site> Site;
  @SerializedName("VideoStory")
  @Expose
  private List<VideoStory> VideoStory;
  @SerializedName("cse_thumbnail")
  @Expose
  private List<Cse_thumbnail> cse_thumbnail;
  @SerializedName("metatags")
  @Expose
  private List<Metatags> metatags;
  @SerializedName("cse_image")
  @Expose
  private List<Cse_image> cse_image;
  @SerializedName("PageAttr")
  @Expose
  private List<PageAttr> PageAttr;
  @SerializedName("Thumbnail")
  @Expose
  private List<Thumbnail> Thumbnail;
  @SerializedName("Story")
  @Expose
  private List<Story> Story;
  @SerializedName("Date")
  @Expose
  private List<Date> Date;
  @SerializedName("Restrictions")
  @Expose
  private List<Restrictions> Restrictions;
  public void setSite(List<Site> Site){
   this.Site=Site;
  }
  public List<Site> getSite(){
   return Site;
  }
  public void setVideoStory(List<VideoStory> VideoStory){
   this.VideoStory=VideoStory;
  }
  public List<VideoStory> getVideoStory(){
   return VideoStory;
  }
  public void setCse_thumbnail(List<Cse_thumbnail> cse_thumbnail){
   this.cse_thumbnail=cse_thumbnail;
  }
  public List<Cse_thumbnail> getCse_thumbnail(){
   return cse_thumbnail;
  }
  public void setMetatags(List<Metatags> metatags){
   this.metatags=metatags;
  }
  public List<Metatags> getMetatags(){
   return metatags;
  }
  public void setCse_image(List<Cse_image> cse_image){
   this.cse_image=cse_image;
  }
  public List<Cse_image> getCse_image(){
   return cse_image;
  }
  public void setPageAttr(List<PageAttr> PageAttr){
   this.PageAttr=PageAttr;
  }
  public List<PageAttr> getPageAttr(){
   return PageAttr;
  }
  public void setThumbnail(List<Thumbnail> Thumbnail){
   this.Thumbnail=Thumbnail;
  }
  public List<Thumbnail> getThumbnail(){
   return Thumbnail;
  }
  public void setStory(List<Story> Story){
   this.Story=Story;
  }
  public List<Story> getStory(){
   return Story;
  }
  public void setDate(List<Date> Date){
   this.Date=Date;
  }
  public List<Date> getDate(){
   return Date;
  }
  public void setRestrictions(List<Restrictions> Restrictions){
   this.Restrictions=Restrictions;
  }
  public List<Restrictions> getRestrictions(){
   return Restrictions;
  }
}