package br.com.fiap.wefeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroEstabelecimentoController {

	@RequestMapping("cadastro")
	public String cadastro() {
		return "cadastro";
	}
	
	
}
