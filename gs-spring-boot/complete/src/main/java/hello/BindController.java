package hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BindController {

	
	private AppProperties app;
	
	@Autowired
    public void setApp(AppProperties app) {
        this.app = app;
    }
	
	@RequestMapping("/bind")
	   public String testProps(){
		
		String appProperties = app.toString();
        
		   return appProperties;
	   }
}
