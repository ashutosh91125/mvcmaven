package springmvc.controller;

//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import jakarta.servlet.http.HttpServletRequest;
import springmvc.model.User;	
import springmvc.service.UserService;

@Controller
@RequestMapping
public class Contact {
    @Autowired private UserService userService;
	 
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Programming Practice Form");
		m.addAttribute("description", "Learning Java MVC");
	}
	
	@GetMapping("/contact")
	public String showForm(Model m) {
		return "contact";
	}
	
	
//	Creating Post service without @modelAttribute
//	@PostMapping("getDetails")
//	public String handleForm(HttpServletRequest request, Model model) {
//		String email =	request.getParameter("email");
//		String name = request.getParameter("name");
//		String password = request.getParameter("password");
//		System.out.println("User Email Id is "+ email);
//		
//		model.addAttribute("email", email );
//		model.addAttribute("password",password);
//		model.addAttribute("name",name);
//		
//		return "success";
//	}
	
	@PostMapping("/getDetails")
	public String handleForm(@ModelAttribute("user") User user, Model m) {
		
		System.out.println(user);
		
		this.userService.createUser(user);
		
//		model.addAttribute("user",user);
		return "success";
	}
	

}
