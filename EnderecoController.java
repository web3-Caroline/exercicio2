package edu.ifpr.exercicio2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class EnderecoController {
    
    @GetMapping("/requisicao")
    public String hello(HttpServletRequest request){
        String metodo = request.getMethod();
        String uri = request.getRequestURI();
        String protocolo = request.getProtocol();

        String resposta = "Método: " + metodo + "URI: " + uri + "Protocolo: " + protocolo;

        return resposta;

    }

    @GetMapping("/cabecalhos")
    @ResponseBody
    public String cabecalhos(HttpServletRequest request) {
        String host = request.getHeader("Host");
        String UserAgent = request.getHeader("User-Agent");
        String accept = request.getHeader("Accept-Encoding");
        String language = request.getHeader("Accept-Language");

        String cabecalhos = "Host: " + host + "User-Agent: " + UserAgent + "\nAccept-Encoding: " + accept + "\nAccept-Language: " + language;
        return cabecalhos;
    }
}
