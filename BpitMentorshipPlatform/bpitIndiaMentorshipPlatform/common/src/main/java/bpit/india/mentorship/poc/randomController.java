package bpit.india.mentorship.poc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class randomController {

	@RequestMapping(value="/")
	public String hey()
	{
		return "index";
	}
	
	
}
