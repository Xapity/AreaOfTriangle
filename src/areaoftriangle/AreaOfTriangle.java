/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaoftriangle;

import java.util.*;

/**
 *
 * @author camac2045
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set up scanner
        Scanner sn = new Scanner(System.in);
        //menu instructions
        System.out.println("We're gonna calculate some traingle areas!"
                + "\nTo use Heron's Law enter 1 (if you have all the side lengths) or,"
                + "\nto use trig enter 2(if you have two sides and the angle opposite the last side)!");
        //pick decision
        int dec = sn.nextInt();
        //heron's law set up
        if (dec == 1) {
            System.out.println("We're gonna be using Heron's Law awesome choice!"
                    + "\nPlease enter the three side lengths:");
            double a = sn.nextDouble();
            double b = sn.nextDouble();
            double c = sn.nextDouble();

            double s = (a + b + c) / 2;

            double area = (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
            //print answer
            System.out.println("The area of the triangle is: " + area + "units");
            //trig set up
        } else {
            System.out.println("We're gonna be using Trig awesome choice!"
                    + "\nPlease enter the two side lengths and then the angle(in dgrees):");
            double a = sn.nextDouble();
            double b = sn.nextDouble();
            double C1 =sn.nextDouble();
            double C = Math.toRadians(C1);
            
            double area = (a * (b * Math.sin(C))) / 2;
            // print answer
            System.out.println("The area of the triangle is: " + area + "units");
        }
    }

}
