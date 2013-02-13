/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.blas.baseapp.service;

import java.util.List;
import org.blas.baseapp.domain.Post;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author w00x
 */
@Service
public class PostServiceImp implements PostService {
    @Autowired
    private SessionFactory sessionFactory;
    
    @Transactional
    public List<Post> getListPost() {
        return sessionFactory.getCurrentSession().createQuery("from Post").list();
    }
    
}
