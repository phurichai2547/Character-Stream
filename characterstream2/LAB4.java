/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characterstream2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pawat
 */
public class LAB4 {
    public static void main(String[] args)  {
        try {
        InputStreamReader key = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(key);
        System.out.println("Enter your name: ");
        String name = input.readLine();
        System.out.println("Hello " + name);
        System.out.println("Enter your weight: ");
        String w = input.readLine();
        System.out.println("Enter your height: ");
        String h = input.readLine();
        System.out.println(Double.parseDouble(h)*Double.parseDouble(h));
    } catch (IOException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
  
