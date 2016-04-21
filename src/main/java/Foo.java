import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.RequestScoped;

@ManagedBean
@SessionScoped
public class Foo{

	private String message;

	public Foo(){
	}

	public void setMessage1(){
		this.message="one";
	}

	public void setMessage2(){
		this.message="two";
	}

	public String getMessage(){
		return message;
	}	

}
