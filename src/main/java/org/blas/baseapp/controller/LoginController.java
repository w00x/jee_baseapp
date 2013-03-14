/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blas.baseapp.controller;

import java.util.List;
import java.util.Map;
import org.blas.baseapp.domain.Post;
import org.blas.baseapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author w00x
 */
@Controller
public class LoginController {
    
    @Autowired
    private PostService postService;
    
    @RequestMapping(value="/login.htm", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "noLayout:session/login";
    }

    @RequestMapping(value="/loginfailed.htm", method = RequestMethod.GET)
    public String loginerror(ModelMap model) {
        model.addAttribute("error", "true");
        return "noLayout:session/login";
    }

    @RequestMapping(value="/logout.htm", method = RequestMethod.GET)
    public String logout(ModelMap model) {
        return "noLayout:session/login";
    }
}
