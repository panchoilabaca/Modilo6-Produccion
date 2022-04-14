package cl.icap.fullstackjava2022.modulo6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {
	@RequestMapping("/")
	public String getHome() {
		return("index");
	}
	@RequestMapping("/movimiento_page")
	public String getMovimiento() {
		return("movimiento");
}
}
