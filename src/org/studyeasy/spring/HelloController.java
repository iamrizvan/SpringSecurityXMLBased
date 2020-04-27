package org.studyeasy.spring;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(@ModelAttribute("info") @Valid Information userInfo, BindingResult result) {
		ModelAndView model = new ModelAndView("hello");
		model.addObject("firstName", userInfo.getFirstName());
		model.addObject("lastName", userInfo.getLastName());
		model.addObject("gender", userInfo.getGender());
		model.addObject("country", userInfo.getCountry()); 
		model.addObject("visitedCountry", userInfo.getVisitedCountry());
		model.addObject("message", userInfo.getMessage());
		if (result.hasErrors()) {
			System.out.println("There is some error");
			Map<String, String> gender = new HashMap<String, String>();
			gender.put("Male", "Male");
			gender.put("Female", "Female");
			return new ModelAndView("index", "info", userInfo).addObject("gender", gender);

		} else {
			return model;
		}
	}

	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("index", "info", new Information());
		
		Map<String, String> gender = new HashMap<String, String>();
		gender.put("Male", "Male");
		gender.put("Female", "Female");
		
		model.addObject("gender", gender);
		return model;
	}
}
