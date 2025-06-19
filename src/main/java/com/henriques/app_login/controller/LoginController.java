package com.henriques.app_login.controller;

import com.henriques.app_login.model.Usuario;
import com.henriques.app_login.repository.UsuarioRepository;
import com.henriques.app_login.service.CookieService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.UnsupportedEncodingException;


@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository ur;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String dashboard(Model model, HttpServletRequest request) throws UnsupportedEncodingException {
        model.addAttribute("nome", CookieService.getCookie(request, "nomeUsuario"));
        return "index";
    }

    @PostMapping("/logar")
    public String loginUsuario(Usuario usuario, Model model, HttpServletResponse response) throws UnsupportedEncodingException {
        Usuario usuarioLogado = this.ur.login(usuario.getEmail(), usuario.getSenha());
        if (usuarioLogado != null) {
            CookieService.setCookie(response, "usuarioId", String.valueOf(usuarioLogado.getId()), 10000);
            CookieService.setCookie(response, "nomeUsuario", String.valueOf(usuarioLogado.getNome()), 10000);
            return "redirect:/";
        }
        model.addAttribute("erro", "Usuário ou senha inválidos");
        return "login";
    }

    @GetMapping("/sair")
    public String sair(HttpServletResponse response) throws UnsupportedEncodingException {
        CookieService.setCookie(response, "usuarioId", "", 0);
        CookieService.setCookie(response, "nomeUsuario", "", 0);
        return "login";
    }

    @GetMapping("/cadastroUsuario")
    public String cadastro() {
        return "cadastro";
    }

    @RequestMapping(value = "/cadastroUsuario", method = RequestMethod.POST)
    public String cadastroUsuario(@Valid Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            return "cadastro";
        }
        ur.save(usuario);
        return "redirect:/login";
    }
}
