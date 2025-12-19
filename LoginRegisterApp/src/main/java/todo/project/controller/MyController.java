package todo.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import todo.project.entity.UserEntity;
import todo.project.services.UserService;

@Controller
public class MyController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/register")
	public String OpenRegisterPage(Model model) {
		
		model.addAttribute("user", new UserEntity()); 
		return "register";
	
	}
	
	@GetMapping("/loginPage")
	public String OpenLoginPage(Model model) {
		model.addAttribute("user", new UserEntity());
		return "login";
	}
	
	@PostMapping("/registerForm")
	public String RegisterUser(@ModelAttribute("user") UserEntity user, Model model) {
		
		boolean status = userservice.registerUser(user);
		if(status) {
			model.addAttribute("success", "User registerd successfully");
		}else {
			model.addAttribute("errorMessage","user not registered");
		}
		return "register";
	}
	
	@PostMapping("/loginForm")
	public String LoggedUser(@ModelAttribute("user") UserEntity user, Model model) {
		UserEntity validUser =  userservice.loginUser(user.getEmail(), user.getPassword());
		if(validUser!=null) {
			model.addAttribute("username", validUser.getName());
			return "profile";
		}else {
			model.addAttribute("errorMessage","User not registered or invalid credentials!");
			return "login";
		}
		
	}
	@GetMapping("/logout")
	public String LogoutUser(HttpServletRequest request) {
		 HttpSession session = request.getSession(false);
		 if(session!=null) {
			 session.invalidate();
			 
		 }
		 return "login";
	}
}
