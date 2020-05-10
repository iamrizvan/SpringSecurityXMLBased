package org.studyeasy.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.studyeasy.spring.DAO.AppDAOImpl;
import org.studyeasy.spring.config.AppConfig;
import org.studyeasy.spring.model.User;

@Controller
public class AppController {

	@RequestMapping("/users")
	public ModelAndView users()
	{
		ModelAndView mv= new ModelAndView("users");
		List<User> users = new ArrayList<User>();
		
		// XML based configuration
	    // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/org/studyeasy/spring/DAO/Spring-AppDAOConfig.xml");
		
		//Annotation based configuration
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AppDAOImpl DAO = context.getBean("DAOBean",AppDAOImpl.class);
		users = DAO.users();
		mv.addObject("users", users);
		context.close();
		return mv;
	}
	
	@RequestMapping("/addUser")
	public String addUser(Model model,@Valid User user, BindingResult result)
	{
		if(result.hasErrors())
		{
			model.addAttribute("user",user);
			return "addUser";
		}
		else {
			if(user.getName() != null && user.getEmail() != null)
			{
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
				AppDAOImpl DAO = context.getBean("DAOBean",AppDAOImpl.class);
				DAO.addUser(user);
				System.out.println(user);
				context.close();
				return "forward:/";
			}
			else
			{
				System.out.println("loading form.");
				return "addUser";
			}
		}
		
	}
	

	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView("login");
				return mv;
	}
	
	@RequestMapping("/user")
	public ModelAndView user()
	{
		ModelAndView mv = new ModelAndView("user");
				return mv;
	}
	
	@RequestMapping("/admin")
	public ModelAndView admin()
	{
		ModelAndView mv = new ModelAndView("admin");
				return mv;
	}
	
}
