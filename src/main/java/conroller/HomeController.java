package conroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//We try to reach to main page
@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "index.html";
		
	}
	
}
