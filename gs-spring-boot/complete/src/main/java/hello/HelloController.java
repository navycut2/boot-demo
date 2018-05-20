package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
	@Value("${helloapp.greeting}")
    private String greeting;
	
	
	@Value("${helloapp.secret}")
    private String secret;
	
    @RequestMapping("/")
    public String index() {
        return greeting;
    }
    
   @RequestMapping("/testProps")
   public String testProps(){
	
	   
	   return secret;
   }
   
}
