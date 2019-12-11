package io.javabrain.springbootstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
		// TODO Auto-generated method stub
		@RequestMapping("/hello")
		public String SayHi(){
		return "Hiiiiii";
		
	}

}
