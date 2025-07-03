/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package password;



import java.util.Scanner;

public class Password {
    public static boolean containsSpecialCharacter(String password) {
        for (char c : password.toCharArray()) {
            if(!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
       return false;
       
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        
        if (containsSpecialCharacter(password)) {
            System.out.println("Password Accepted!");
        }else {
            System.out.println("Password must contain at least one special character.");
        }
    }

    
        }
 
    

