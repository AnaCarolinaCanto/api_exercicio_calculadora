package org.serratec.backend.projeto01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculadora {
	
	@RequestMapping("/adicao")
	public int adicao (@RequestParam int a, int b) {
		return a + b; 
	}
	@RequestMapping("/subtracao")
	public int subtracao (@RequestParam int a, int b) {
		return a - b;
	}
	@RequestMapping("/multiplicacao")
	public int multiplicacao (@RequestParam int a, int b) {
		return a * b; 
	}
	@RequestMapping("/divisao")
	public double divisao (@RequestParam double a, int b) {
		return a / b; 
	}
	// http://localhost:8080/adicao?a=1&b=2
	// http://localhost:8080/subtracao?a=1&b=2
	// http://localhost:8080/multiplicacao?a=1&b=2
	// http://localhost:8080/divisao?a=1&b=2
		
}
