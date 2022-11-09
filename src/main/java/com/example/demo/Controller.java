package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class Controller {

	// One syntax to implement a
	// GET method
	@GetMapping("/")
	public String home()
	{
		String str
			= "<html><body><font color=\"blue\">"
			+ "<h1>Hello world.!</h1>"
			+ "</font></body>Test</html>";
		return str;
	}

	// Another syntax to implement a
	// GET method
	@RequestMapping("/test")
	public String info()
	{
		String str2
			= "<html><body><font color=\"red\">"
			+ "<h2>TEST Route Tested"+"</h2></font></body></html>";
		return str2;
	}
}
