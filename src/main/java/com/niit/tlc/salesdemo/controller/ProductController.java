package com.niit.tlc.salesdemo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ProductController {
		@RequestMapping("/sell")
		public String sellProduct(ModelMap model) {
			model.addAttribute("name","Mobile");
			model.addAttribute("sellDate",new Date());
			model.addAttribute("quant","2");
			model.addAttribute("total", 4*1000);
			return "sellproduct";
		}
		
		@RequestMapping("/buy")
		public String buyProduct(ModelMap model) {
			model.addAttribute("name","Mobile");
			model.addAttribute("sellDate",new Date());
			model.addAttribute("quant","2");
			model.addAttribute("total", 4*1000);
			
			return "buyproduct";
		}
		
	}

