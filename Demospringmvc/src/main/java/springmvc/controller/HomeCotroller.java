package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeCotroller {

	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home (Model model) {
		
		System.out.println("This is hello url");
		
		model.addAttribute("name","Samir Ghatage");
		model.addAttribute("id", 123);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Pratik");
		friends.add("Roshani");
		friends.add("Rohini");
		
		model.addAttribute("f", friends);
		
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		
		System.out.println("This is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		System.out.println("This is help controller");
		
		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		// setting the data
		modelAndView.addObject("name", "Sauraj Patil");
		modelAndView.addObject("rollnumber",123 );
		LocalDateTime dateTime= LocalDateTime.now();
		modelAndView.addObject("time", dateTime);
		
		//marks
		
		List<String>list= new ArrayList<String>();
		  list.add("Sanika");
		  list.add("Sanjay");
		  list.add("Ganesh");
		  list.add("Sagarika");
		  list.add("Ramesh");
		  
		  modelAndView.addObject("person", list);
		  		
		
		//setting the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
