/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.pkg360;

import java.util.Scanner;

/**
 *
 * @author mount
 */
public class Applicaiton {
    public static void main(String[] args) {
        ApplicationController deligate = new ApplicationController();
        String add = "add";
        String sub = "sub";
        String mul = "mul";
        String div = "div";
        int num1 = -5;
        int num2 = 5;
        String command;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        num1 = Integer.parseInt(in.nextLine());
        System.out.println("Enter a command(+, *, /, -)");
        command = in.nextLine();
        System.out.println("Enter another number: ");
        num2 = Integer.parseInt(in.nextLine());
        
        System.out.print(num1+" " + command + " " + num2 + " - ");
        deligate.handleCommand(command,num1,num2);
    }
}
