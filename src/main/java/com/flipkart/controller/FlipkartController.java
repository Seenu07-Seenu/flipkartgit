package com.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.entity.Flipkart;
import com.flipkart.service.FlipkartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/flipkart")
public class FlipkartController {

	@Autowired
	FlipkartService fs;
	
	@PostMapping("/post")
	public String post(@RequestBody List<Flipkart> li) {
		return fs.post(li);
	}
	
	@GetMapping("/getvalue")
	public List<Flipkart> get() {
		return fs.get();
	}
	
	@GetMapping("/getproduct/{a}")
	public Flipkart getp(@PathVariable int  a) {
		return fs.getp(a);
	}
}
