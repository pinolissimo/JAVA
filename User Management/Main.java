/*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
 */

 /*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
*/
package UserManagement;

import static UserManagement.DBSetup.*;
import static UserManagement.Menu.menu;
import static UserManagement.UserChoiceInMenu.userChoiceInMenu;
import static UserManagement.UserInput.userInput;

public class Main {

    private static int valueNum = 0;
    private static final String  tab = "\t";

    public static void main(String[] args) {

        setupSoftware();

        menuManagement();
    }

     // SET-UP SOFTWARE
    public static void setupSoftware() {
        dirCreate();
        fileCreate();
        System.out.println("OK!\n"); }
    //
    public static void menuManagement() {
        menu();

        String inputValue = (userInput());

        int choice=filterInputFromUser(inputValue);

         userChoiceInMenu(choice);

    }

    public static int filterInputFromUser(String inputValue) {

        if(!inputValue.equals("1")&&
           !inputValue.equals("2")&&
           !inputValue.equals("3")&&
           !inputValue.equals("4")&&
           !inputValue.equals("5"))
        {
            System.out.println("\n");
            System.out.println(tab.repeat(6)+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println(tab.repeat(6)+"!You have entered an invalid number! !");
            System.out.println(tab.repeat(6)+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\n");

            menuManagement();

        }
        else{ valueNum = Integer.parseInt(inputValue);}

        return valueNum;
         }
} 