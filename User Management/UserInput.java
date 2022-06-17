/*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
 */
package UserManagement;

import java.util.Scanner;

public class UserInput {
   public static Scanner keyboard = new Scanner(System.in);
   public static String userInput(){
       String value= keyboard.nextLine();
       value=value.trim();
       return value;}
}
