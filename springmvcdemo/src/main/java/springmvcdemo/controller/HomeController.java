package springmvcdemo.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name", "Pratik Chougule");
		model.addAttribute("id",1423);
		List<String> friends=new ArrayList<String>();
		friends.add("Pratik");
		friends.add("Sagar");
		friends.add("Joy");
		friends.add("Samar");
		friends.add("Sanjiv");
		
		model.addAttribute("f",friends);
		
		System.out.println("this is home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() 
	{
		
		
		System.out.println("this is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		
		
		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		// setting the data 
		modelAndView.addObject("name", "Pratik");
		modelAndView.addObject("rollnumber", 120);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//Marks 
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(12);
		list.add(23);
		list.add(55);
		list.add(369);
		list.add(857);
		list.add(909090);
		
		modelAndView.addObject("marks", list);
		
		
		// setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
		
		
	}

}
