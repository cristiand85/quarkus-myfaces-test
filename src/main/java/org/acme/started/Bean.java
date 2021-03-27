/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.acme.started;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
 
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import javax.validation.Validator;
import lombok.Getter;
import lombok.Setter;
 
/**
 *
 * @author ubuntu
 */
@Named
@ViewScoped
public class Bean implements Serializable{
    
    
    @Setter @Getter
    private Product product= new Product();
     
    
    @Transactional
    public void save(){
        product.persist();
        product = new Product();
    }
    
}
