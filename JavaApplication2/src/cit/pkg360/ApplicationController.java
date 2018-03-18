/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.pkg360;

import java.util.HashMap;

/**
 *
 * @author mount
 */
public class ApplicationController {
    public static HashMap<String,HandleMath> hashMapOfCommands = new HashMap<String,HandleMath>();
    
    
    public void ApplicationController(){
        
    }
    
    
    public static void handleCommand(String command, int num1, int num2){
        
        hashMapOfCommands.put("+", new Add());
        hashMapOfCommands.put("*", new Multiply());
        hashMapOfCommands.put("/", new Divide());
        hashMapOfCommands.put("-", new Subtract());
        
        
        HandleMath handler = hashMapOfCommands.get(command);
        
        handler.execute(num1, num2);
    }
}
