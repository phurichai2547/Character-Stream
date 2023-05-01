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
public class LAB2 {
     public static void main(String[] args) {
        try {
            FileWriter file  = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello World!");
            output.write("Welcome to java");
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
             FileReader file = new FileReader("data.txt");
             BufferedReader input = new BufferedReader(file);
             String s ;
             while ((s=input.readLine())!=null) {
                 System.out.print(s);
             }
        }  catch (FileNotFoundException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
