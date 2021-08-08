package com.fitzgerald.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{dojoEntity}")
	public String showDojoEnthusiasm(@PathVariable("dojoEntity") String dojoEntity) {
		System.out.println(dojoEntity);
		if (dojoEntity.equals("dojo")) {
			return "The dojo is awesome!";
		}else if (dojoEntity.equals("San-Jose")) {
			return "SJ dojo is the headquarters";
		}else if (dojoEntity.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}else {
			return "There are secrets in these path variables. Find them!";
		}
}
	
}