package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@Value("${lucky_word}") String luckyWord;
	
	@RequestMapping ("/getProperty")
	public String getPropertyFromCloudConfigServer ( ) {
		
		return "Value from Property server " + luckyWord;
		
		
	}
}
