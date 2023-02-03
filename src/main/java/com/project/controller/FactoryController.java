package com.project.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FactoryController {

	@GetMapping("factory")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("factory");
		return view;
	}
}
