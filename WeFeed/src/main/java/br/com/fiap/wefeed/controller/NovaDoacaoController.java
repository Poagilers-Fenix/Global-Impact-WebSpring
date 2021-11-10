package br.com.fiap.wefeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NovaDoacaoController {
	
	@RequestMapping("/novaDoacao")
	public String novaDoacao() {
		return "novaDoacao";
	}

}
