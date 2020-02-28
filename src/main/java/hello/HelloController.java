package hello;

import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String index() throws SecurityException, IOException {
    	// Logger logger = Logger.getLogger("HelloController");  
    	
    	// FileHandler fh;  
    	// This block configure the logger with handler and formatter  
        // fh = new FileHandler("/logs/console.log");  
        // logger.addHandler(fh);
        // SimpleFormatter formatter = new SimpleFormatter();  
        // fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
        // logger.info("Greetings from Spring Boot!");  
        // fh.close();
        //Read environmental variables:
        Map<String, String> env = System.getenv();
        String secret = env.get("mySecret");
        return secret != null ? secret : "Secret not found!";
    }

    @GetMapping(value = "/hello")
	public String hello() {
		return "Hello World";
	}


}
