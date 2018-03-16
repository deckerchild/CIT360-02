/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.pkg360;

/**
 *
 * @author mount
 */
public class Model {
    private int x;
    
    public Model(){
        x = 0;
    }
    
    public Model(int x){
        this.x = x;
    }
    
    public void incX(){
        x++;
    }
    
    public int getX(){
        return x;
    }
}
