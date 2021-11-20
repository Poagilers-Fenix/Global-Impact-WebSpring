package br.com.fiap.wefeed.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.wefeed.model.Doacao;
import br.com.fiap.wefeed.model.DoacaoAlimento;
import br.com.fiap.wefeed.model.Estabelecimento;
import br.com.fiap.wefeed.model.Item;
import br.com.fiap.wefeed.model.Ong;
import br.com.fiap.wefeed.repository.ItemRepository;
import br.com.fiap.wefeed.repository.NovaDoacaoRepository;
import br.com.fiap.wefeed.repository.OngRepository;

@Controller
@RequestMapping("/novaDoacao")
public class NovaDoacaoController {
	
	@Autowired
	private NovaDoacaoRepository NovaDoacaorepository;
	
	@Autowired
	private ItemRepository Itemrepository;
	
	@Autowired
	private OngRepository Ongrepository;
	
	public List<Item> itens; 
	
	
	
	@GetMapping
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("novaDoacao");
		List<Item> itens = Itemrepository.findAll();
		modelAndView.addObject("itens", itens);
		List<Ong> ongs = Ongrepository.findAll();
		modelAndView.addObject("ongs", ongs);
		return modelAndView;
	
	}
	
	@PostMapping
	public String save(@Valid Ong ong, @Valid Item item, @Valid Doacao doacao, @Valid DoacaoAlimento doacaoAlimento, @Valid Estabelecimento estabeleciemento,
			BindingResult result, RedirectAttributes redirect) {
		System.out.println("ENTROU NA DOACAO");
		if(result.hasErrors()) return "/novaDoacao";
		doacao.setEstab(estabeleciemento);
		doacao.setOng(ong);
		doacaoAlimento.setDoacao(doacao);
		doacaoAlimento.setItem(item);
		
		NovaDoacaorepository.save(doacaoAlimento);
		redirect.addFlashAttribute("message", "Doação realizada com sucesso!");
		return "redirect:novaDoacao";
	}
	
	@PostMapping("adicionar")
	public String lista() {
		return "redirect:novaDoacao";
	}
}
