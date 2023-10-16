package Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping(value="/docker")
	public String get() {
		return "Task Docker VanthuruchU";
		
	}

}
