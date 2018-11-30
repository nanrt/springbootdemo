package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <dl>
 * <dt>Hello</dt>
 * <dd>Description:</dd>
 * <dd>CreateDate: 2018-11-30 10:55</dd>
 * </dl>
 *
 * @author nanrt
 */
@RestController
@RequestMapping("/hello")
public class Hello {
	@GetMapping("/test")
	public String hell() {
		return "hello SpringBoot word!";
	}
}
