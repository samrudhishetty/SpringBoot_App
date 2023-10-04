package in.mindcraft.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home") //mapping to html page
	public String fn() {
//		System.out.println("fn is called");
		return "home";
		
	}

	
	
}
