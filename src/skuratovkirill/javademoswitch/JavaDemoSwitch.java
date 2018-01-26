/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skuratovkirill.javademoswitch;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author student
 */
public class JavaDemoSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc
                = new Scanner(System.in);
        String template = "[0-9]{1,5}";
        
        /*while (true) {
            
        }*/
        
        /*do {
            
        } while (true);*/
        
        
        MAIN_LOOP:for (int i = 0; i < 3; i++) {
            
            String responseString = null;
            
            do {
                
                System.out.println("> ");
                responseString = sc.nextLine();
                if (responseString.equals("exit")) {
                    break MAIN_LOOP;
                }
            } while (!responseString.matches(template));
            
            
            /*if (!responseString.matches(template)) {
                
                System.out.println("Enter only numbers from 1 to 5!");
                continue;
            }*/
            
            //int response = sc.nextInt();
            int response = Integer.valueOf(responseString);
            
            int x = response % 10;

            int y = response % 100;
            //System.out.println(x);
            String result;

            if (y >= 11 && y <= 14) {

                result = "ворон";
            } else {
                switch (x) {

                    case 0: {

                        result = "ворон";
                        break;
                    }

                    case 1: {

                        result = "ворона";
                        break;
                    }

                    case 2: {

                        // result = "вороны";
                        // break;
                    }

                    case 3: {

                        // result = "вороны";
                        // break;
                    }

                    case 4: {

                        result = "вороны";
                        break;
                    }

                    case 5: {

                        // result = "ворон";
                        // break;
                    }

                    case 6: {

                        // result = "ворон";
                        // break;
                    }

                    case 7: {

                        // result = "ворон";
                        // break;
                    }

                    case 8: {

                        // result = "ворон";
                        // break;
                    }

                    case 9: {

                        result = "ворон";
                        break;
                    }

                    default: {
                        result = "Error";
                    }
                }

            }
            System.out.println(result);
        }
    }

    // TODO code application logic here
}
