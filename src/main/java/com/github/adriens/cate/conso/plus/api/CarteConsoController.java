/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adriens.cate.conso.plus.api;

import com.github.adriens.cate.conso.plus.sdk.CarteConsoCrawler;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author salad74
 */

@RestController
public class CarteConsoController {

    final static Logger logger = LoggerFactory.getLogger(CarteConsoController.class);

    public CarteConsoController(){
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);        
    
    }
    
    @RequestMapping("/")
    public String welcome(){
        String out;
        out = "Main endpoint is : /{login}/{password}";
        return out;
    }

    
    @RequestMapping(value = "/{login}/{password}",
            produces = { "application/json", "application/xml" })
    public CarteConsoCrawler getDetails(
            @PathVariable("login") String login,
            @PathVariable("password") String password
    ) throws IOException {
        return new CarteConsoCrawler(login, password);
    }
    
    @RequestMapping("/{login}/{password}/detail")
    public String getSoldeDescription(
            @PathVariable("login") String login,
            @PathVariable("password") String password
    ) throws IOException {
        
        return new CarteConsoCrawler(login, password).getSoldeDescription();
    }
    
    @RequestMapping("/{login}/{password}/solde")
    public int getSolde(
            @PathVariable("login") String login,
            @PathVariable("password") String password
    ) throws IOException {
                return new CarteConsoCrawler(login, password).getSolde();
    }
}
