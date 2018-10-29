package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Items{
  @SerializedName("snippet")
  @Expose
  private String snippet;
  @SerializedName("htmlFormattedUrl")
  @Expose
  private String htmlFormattedUrl;
  @SerializedName("htmlTitle")
  @Expose
  private String htmlTitle;
  @SerializedName("kind")
  @Expose
  private String kind;
  @SerializedName("pagemap")
  @Expose
  private Pagemap pagemap;
  @SerializedName("displayLink")
  @Expose
  private String displayLink;
  @SerializedName("link")
  @Expose
  private String link;
  @SerializedName("htmlSnippet")
  @Expose
  private String htmlSnippet;
  @SerializedName("title")
  @Expose
  private String title;
  @SerializedName("formattedUrl")
  @Expose
  private String formattedUrl;
  @SerializedName("cacheId")
  @Expose
  private String cacheId;
  public void setSnippet(String snippet){
   this.snippet=snippet;
  }
  public String getSnippet(){
   return snippet;
  }
  public void setHtmlFormattedUrl(String htmlFormattedUrl){
   this.htmlFormattedUrl=htmlFormattedUrl;
  }
  public String getHtmlFormattedUrl(){
   return htmlFormattedUrl;
  }
  public void setHtmlTitle(String htmlTitle){
   this.htmlTitle=htmlTitle;
  }
  public String getHtmlTitle(){
   return htmlTitle;
  }
  public void setKind(String kind){
   this.kind=kind;
  }
  public String getKind(){
   return kind;
  }
  public void setPagemap(Pagemap pagemap){
   this.pagemap=pagemap;
  }
  public Pagemap getPagemap(){
   return pagemap;
  }
  public void setDisplayLink(String displayLink){
   this.displayLink=displayLink;
  }
  public String getDisplayLink(){
   return displayLink;
  }
  public void setLink(String link){
   this.link=link;
  }
  public String getLink(){
   return link;
  }
  public void setHtmlSnippet(String htmlSnippet){
   this.htmlSnippet=htmlSnippet;
  }
  public String getHtmlSnippet(){
   return htmlSnippet;
  }
  public void setTitle(String title){
   this.title=title;
  }
  public String getTitle(){
   return title;
  }
  public void setFormattedUrl(String formattedUrl){
   this.formattedUrl=formattedUrl;
  }
  public String getFormattedUrl(){
   return formattedUrl;
  }
  public void setCacheId(String cacheId){
   this.cacheId=cacheId;
  }
  public String getCacheId(){
   return cacheId;
  }
}