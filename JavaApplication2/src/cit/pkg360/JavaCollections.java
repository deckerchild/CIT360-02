/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.pkg360;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author mount
 */
public class JavaCollections {
    public static void main(String a[]){
         
        //shows how to iterate through a collection (iterator class)
        
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("C++");
        myList.add("Perl");
        Iterator<String> itr = myList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        //Shows enumeration collection funcionality
        
        {
        Vector<String> lang = new Vector<String>();
        Enumeration<String> en = null;
        lang.add("JAVA");
        lang.add("JSP");
        lang.add("SERVLET");
        lang.add("EJB");
        lang.add("PHP");
        lang.add("PERL");
        en = lang.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
    
}
}
