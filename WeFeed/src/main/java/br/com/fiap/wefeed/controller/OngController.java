package br.com.fiap.wefeed.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.wefeed.model.Endereco;
import br.com.fiap.wefeed.model.Ong;
import br.com.fiap.wefeed.repository.OngRepository;

@Controller
@RequestMapping("/ong")
public class OngController {

	@Autowired
	private OngRepository repository;
	
	
	@GetMapping
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("ong");
		List<Ong> ongs = repository.findAll();
		modelAndView.addObject("ongs", ongs);
		return modelAndView;
	}
	
	
	
	@RequestMapping("new")
	public String create(Ong ong) {
		return "cadastroOng";
	}
	
	@PostMapping("new")
	public String save(@Valid Ong ong,BindingResult result, @Valid Endereco endereco, BindingResult result2, RedirectAttributes redirect) {
		if(result.hasErrors()) return "cadastroOng";
		
		ong.setEndereco(endereco);
		repository.save(ong);
		redirect.addFlashAttribute("message", "Ong cadastrada com sucesso!");
		return "redirect:/ong/new";
	}
	
	
	@GetMapping("escolher")
	public ModelAndView escolher() {
		ModelAndView modelAndView = new ModelAndView("escolherOng");
		List<Ong> ongs = repository.findAll();
		modelAndView.addObject("ongs", ongs);
		return modelAndView;
	}
	
	@GetMapping("{id}")
	public ModelAndView especifica(@PathVariable Long id, Authentication auth) {
		ModelAndView modelAndView = new ModelAndView("ongEspecifica");
		Optional<Ong> optional = repository.findById(id);
		modelAndView.addObject("ong", optional.get());
		return modelAndView;
	}
	
	@GetMapping("buscarNome")
	public ModelAndView buscarNome(
			@RequestParam(required = false) String nome,
			@PageableDefault Pageable pageable
			) {
		
		ModelAndView modelAndView = new ModelAndView("ong");
		
		List<Ong> ongs = repository.findByNomeLike("%"+ nome +"%");
		modelAndView.addObject("ongs", ongs);
		return modelAndView;
	}
	
	
	
}
