package springmvc.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("This is home URL");
		
		
		List<String> details = new ArrayList<String>();
		details.add("Ashutosh");
		details.add("Mishra");
		details.add("Kamalpur");
		
		 model = model.addAttribute("detail", details);
		
		return "index";
	}
	
	@RequestMapping("about")
	public ModelAndView about() {
		ModelAndView modelAndView = new ModelAndView();
		
		List<String> city = new ArrayList<String>();
		
		city.add("KAMALPUR");
		city.add("CHANDAULI");
		city.add("VARANASI");
		city.add("Noida");
		
		modelAndView.addObject("cities", city);
		
		modelAndView.setViewName("about");
		
		return modelAndView;
	}

}
