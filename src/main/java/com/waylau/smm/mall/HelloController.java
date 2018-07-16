package com.waylau.smm.mall;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello 控制器.
 * 
 * @since 1.0.0 2018年3月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
	    return "Hello World! Welcome to visit waylau.com!";
	}

}
