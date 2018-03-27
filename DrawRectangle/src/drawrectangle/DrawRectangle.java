/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawrectangle;

import java.util.Scanner;

/**
 *
 * @author nd5157v
 */
public class DrawRectangle {

   
    public static int width, height;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter width"); //width input
        width = keyboard.nextInt(); //only accepts int
        System.out.println("Enter height"); //height input
        height = keyboard.nextInt();
        draw_rectangle(width, height); 
        System.out.println("width = " + width + " & height = " + height); // This will print out the user inputs 
    }

    public static void draw_rectangle(int w, int h) {
        // I used unicode as this is something that is accepted in java and converted the ascii value to unicode 
        // draws the first row 
        for (int i = 0; i < w; i++) {
            if (i == 0) {
                System.out.print("\u250c"); //top left
            } else if (i == w - 1) {
                System.out.print("\u2510"); //top right
            }
            else {
                System.out.print("\u2500"); //horizontal edges 
            }
        }
        System.out.println(); // prints a new line
        //draws the middle rows with spaces in between 
        for (int i = 0; i < h - 2; i++) { 
            System.out.print("\u2502"); //vertical edge 
            for (int j = 0; j < w - 2; j++) {
                System.out.print("\u2001"); //spaces
            }
            System.out.println("\u2502"); //vertical edge 
        }
        //draws the last row
        for (int i = 0; i < w; i++) {
            if (i == 0) {
                System.out.print("\u2514"); //bottom left
            } else if (i == w - 1) {
                System.out.print("\u2518"); //bottom right
            } else {
                System.out.print("\u2500"); //horizontal edges
            }
        }
        System.out.println();
        
    }
    
}
