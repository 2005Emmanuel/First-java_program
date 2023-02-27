/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning_Projects;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Welcome_project {
    public static void main(String[] args){ //main method
        Scanner scanner = new Scanner(System.in); //created a new object of class Scanner
        System.out.println("Enter your name : \n");
        String User_name = scanner.nextLine();
        if(User_name.equals("john")){ //Using an if statement to check if the User input is john
            System.out.println(User_name + " what are you doing here ");

        }
        else{
            System.out.println("welcome " + User_name + " to Emmanuel's First java project");
        }

        
    }
    
}

