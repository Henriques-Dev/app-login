package com.henriques.app_login.controller;

import com.henriques.app_login.model.Usuario;
import com.henriques.app_login.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository ur;

    @GetMapping("/login")
    public String login() {
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
