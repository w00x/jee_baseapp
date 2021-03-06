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
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author w00x
 */
@Controller
public class PostController {
    
    @Autowired
    private PostService postService;
    
    @RequestMapping("/index.htm")
    public String listarPosts(Map<String, Object> map) {
        List<Post> posts = postService.getListPost();
        map.put("posts", posts);
        return "post/list";
    }
}
