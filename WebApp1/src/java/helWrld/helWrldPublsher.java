/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helWrld;

import javax.xml.ws.Endpoint;
import helWrld.helWrldimpl;

//Endpoint publisher
public class helWrldPublsher {
    
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9009/hello", new helWrldimpl());
    }
}
