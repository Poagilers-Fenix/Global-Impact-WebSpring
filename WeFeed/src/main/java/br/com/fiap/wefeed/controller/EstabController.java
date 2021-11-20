package br.com.fiap.wefeed.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.wefeed.model.Endereco;
import br.com.fiap.wefeed.model.Estabelecimento;
import br.com.fiap.wefeed.model.Ong;
import br.com.fiap.wefeed.repository.EstabRepository;
import br.com.fiap.wefeed.service.AuthenticationService;

@Controller
@RequestMapping("/estabelecimento")
public class EstabController {

	@Autowired
	private EstabRepository EstabRepository;
	
	
	@GetMapping
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("cadastroEstab");
		List<Estabelecimento> estabelecimento = EstabRepository.findAll();
		modelAndView.addObject("estabelecimento", estabelecimento);
		return modelAndView;
	}
	
	@RequestMapping("new")
	public String create(Estabelecimento estabelecimento) {
		System.out.println("entrou no new");
		return "cadastroEstab";
	}
	
	@PostMapping("new")
	public String save(@Valid Estabelecimento estab, BindingResult result, @Valid Endereco endereco, BindingResult result2, RedirectAttributes redirect) {
		if(result.hasErrors()) return "cadastroEstab";
		estab.setPassword(AuthenticationService.getPasswordEncoder().encode(estab.getPassword()));
		estab.setEndereco(endereco);
		EstabRepository.save(estab);
		redirect.addFlashAttribute("message", "Estabelecimento cadastrado com sucesso!");
		return "redirect:/estabelecimento/new";
	}
	
	
}
