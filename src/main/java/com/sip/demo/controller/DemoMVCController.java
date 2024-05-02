package com.sip.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoMVCController { 
    
    @GetMapping("/msg")
	// @ResponseBody
	public String displayMessage() {
		return "message/message";
	}

    @GetMapping("/etudiants")
	// @ResponseBody
	public String listProviders() {
		return "etudiant/etudiants";
	}
}