package com.buswe.module.core.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author Raysmond<i@raysmond.com>
 */
@Controller
public class LoginController {
    @RequestMapping("signin")
    public String signin(Principal principal, RedirectAttributes ra) {
        return principal == null ? "signin" : "redirect:/";
    }
    
}