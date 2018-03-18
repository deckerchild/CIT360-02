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
public class Multiply implements HandleMath{
    public void execute(int num1, int num2){
        int sum = num1 * num2;
        System.out.println(sum);
}
}
