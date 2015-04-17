/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author RaymondStanley
 */
@Stateless
@Path("/data")
public class Sim {
    
   public static boolean valid(String id){
        return (id == "1" ? true : false);
    }
    
    public static String getNombre(String id){
        return "Raymond";
    }
    
    @GET
    public String getInfo(@QueryParam("id") String id){
        
        return (valid(id) ? Sim.getNombre(id): "Error 402");
    }
    
}
