package br.com.fiap.wefeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OngController {

	@RequestMapping("/ong")
	public String ong() {
		return "ong";
	}
	
}
