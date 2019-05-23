package br.com.david.alexandre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sistema")
public class SistemaController {
	@RequestMapping(value = "/boasvindas/telaCep/telaCidade/telaPdv", method = RequestMethod.GET)

	public ModelAndView boasVindas(
			@RequestParam(value = "nome", required = false, defaultValue = "David Alexandre Fernandes") String nome) {

		ModelAndView modelAndView = new ModelAndView("boasVindas");
		modelAndView.addObject("mensagem", "Olá " + nome);

		return modelAndView;
	}

	public ModelAndView telaCep(

			@RequestParam(value = "cep", required = false, defaultValue = "Não Preenchido") String cep) {

		ModelAndView modelAndView = new ModelAndView("telaCep");
		modelAndView.addObject("infocep", "CEP: " + cep);

		return modelAndView;
	}

	public ModelAndView telaCidade(
			@RequestParam(value = "cidade", required = false, defaultValue = "Não Preenchido") String cidade) {

		ModelAndView modelAndView = new ModelAndView("telaCidade");
		modelAndView.addObject("infocidade", "Cidade: " + cidade);

		return modelAndView;
	}

	public ModelAndView telaPdv(
			@RequestParam(value = "pdv", required = false, defaultValue = "Não Preenchido") String pdv) {

		ModelAndView modelAndView = new ModelAndView("telaPdv");
		modelAndView.addObject("infopdv", "PDV: " + pdv);

		return modelAndView;
	}

}
