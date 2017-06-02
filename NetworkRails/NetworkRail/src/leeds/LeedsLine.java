/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leeds;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *
 * @author Edwin
 */
public class LeedsLine{

    public static void main(String args []) throws Throwable{
        System.out.println("Which Train Station is near your home please?");
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));        
        String name  = bufferedReader.readLine();
        
        System.err.println("The train station near my home is "+ name + " and it is 10km from where I live");
        
    }

}
