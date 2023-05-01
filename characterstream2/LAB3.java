/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characterstream2;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pawat
 */
public class LAB3 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println(60.5);
            output.println(175.0);
            output.close();
        }  catch (FileNotFoundException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        try {
            FileReader file = new FileReader("data.txt");
            Scanner scan = new Scanner(file);
            String s = scan.nextLine();
            System.out.println(s);
            int age = scan.nextInt();
            System.out.println(age);
            double weight = scan.nextDouble();
            System.out.println(weight);
            double height = scan.nextDouble();
            System.out.println(height);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

