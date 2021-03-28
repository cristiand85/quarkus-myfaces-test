/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.acme.started;

import io.quarkus.runtime.StartupEvent;
 
import javax.enterprise.context.ApplicationScoped;
 
import javax.enterprise.event.Observes;


 

/**
 *
 * @author ubuntu
 */
@ApplicationScoped
public class Application {
    
    
    
    protected void init(@Observes StartupEvent event){
        System.out.println("org.acme.started.Application.init()*******init");
        
    
    }
}
