/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author RaymondStanley
 */
@Stateless
@Path("/data")
public class Sim {
    
    @GET
    public String getInfo(String id){
    
        return null;
    }
    
}
