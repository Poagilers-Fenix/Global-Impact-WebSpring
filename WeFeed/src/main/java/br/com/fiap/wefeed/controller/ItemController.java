package br.com.fiap.wefeed.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.wefeed.model.Item;
import br.com.fiap.wefeed.model.Ong;
import br.com.fiap.wefeed.repository.ItemRepository;
import br.com.fiap.wefeed.repository.OngRepository;

@Controller
@RequestMapping("/item")
public class ItemController {

	
	@Autowired
	private ItemRepository repository;
	
	@Autowired
	private OngRepository Ongrepository;
	
	
	@GetMapping
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("cadastroItem");
		List<Item> item = repository.findAll();
		modelAndView.addObject("item", item);
		return modelAndView;
	}
	
	@RequestMapping("new")
	public String create(Item item) {
		return "cadastroItem";
	}
	
	@GetMapping("buscarNome")
	public ModelAndView buscarNome(
			@RequestParam(required = false) String nome,
			@PageableDefault Pageable pageable
			) {
		
		ModelAndView modelAndView = new ModelAndView("novaDoacao");
		
		List<Item> itens = repository.findByNomeLike("%"+ nome +"%");
		modelAndView.addObject("itens", itens);

		List<Ong> ongs = Ongrepository.findAll();
		modelAndView.addObject("ongs", ongs);
		
		return modelAndView;
	}
	
	@PostMapping
	public String save(@Valid Item item, BindingResult result, RedirectAttributes redirect) {
		if(result.hasErrors()) return "cadastroItem";
		repository.save(item);
		redirect.addFlashAttribute("message", "Item cadastrado com sucesso!");
		return "redirect:/novaDoacao";
	}

}

