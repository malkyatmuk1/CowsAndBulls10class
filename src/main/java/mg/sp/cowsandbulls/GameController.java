package mg.sp.cowsandbulls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {
	
	
	@GetMapping("/")
	public String hello() {
		return "Welcome";
	}
}
