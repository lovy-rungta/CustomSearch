package customsearch.lovy.com.customsearch.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class Queries{
  @SerializedName("request")
  @Expose
  private List<Request> request;
  @SerializedName("nextPage")
  @Expose
  private List<NextPage> nextPage;
  public void setRequest(List<Request> request){
   this.request=request;
  }
  public List<Request> getRequest(){
   return request;
  }
  public void setNextPage(List<NextPage> nextPage){
   this.nextPage=nextPage;
  }
  public List<NextPage> getNextPage(){
   return nextPage;
  }
}