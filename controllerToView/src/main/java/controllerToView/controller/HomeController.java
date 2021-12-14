package controllerToView.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		
		System.out.println("this is home url");
		
		model.addAttribute("name","Pratik");
		model.addAttribute("id", 21);
		return "index";
		
	}
	
	@RequestMapping("/about")
	public String about() {
		
		System.out.println("this is about controller");
		
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("name", "sagar");
		mav.addObject("rollNumber", 123);
		mav.setViewName("help");
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(22);
		list.add(33);
		list.add(44);
		
		
		mav.addObject("marks", list);
		
		return mav;
	}

}
