/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.pkg360;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author mount
 */

//objects are combined into single JSON object. This prepares the objects to be sent to a web server.
public class exampleJSON {
    public static void main(String[] args){
        {
      JSONObject obj = new JSONObject();

      obj.put("name", "foo");
      obj.put("num", new Integer(100));
      obj.put("balance", new Double(1000.21));
      obj.put("is_vip", new Boolean(true));

      System.out.print(obj);
        }
        
 //object here is decoded from JSON object to separate objects. This simulates recieving a different object from a web resource and breaking it out into workable objects
        {  
    String s="{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";  
    Object obj=JSONValue.parse(s);  
    JSONObject jsonObject = (JSONObject) obj;  
  
    String name = (String) jsonObject.get("name");  
    double salary = (Double) jsonObject.get("salary");  
    long age = (Long) jsonObject.get("age");  
    System.out.println("\n"+name+" "+salary+" "+age);  
        }  
   }
    
   
}
