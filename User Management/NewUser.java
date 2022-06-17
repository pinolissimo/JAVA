/*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
 */
package UserManagement;

import static UserManagement.AppendNewUser.appendNewUser;
import static UserManagement.Main.menuManagement;
import static UserManagement.UserInput.userInput;

public class NewUser {
    static String email,password,check;
    static int validation;
    public static void newUser(){

        // waiting for "ok" from email validation and password
        dataNewUser();
        while (!check.equals("ok")){
            email="";
            password="";
            check="";
            validation=0;
            dataNewUser();}
       // check.iquals("ok")

        appendNewUser(email,password);
        System.out.println("\n<< A New User has been Created! >>\n");
        menuManagement();
    }

    public static void dataNewUser(){

        System.out.println("\n<< New User Creation >>");
        email=inputMail();
        validation=emailValidation(email);
        if (validation==1){
            password=inputpassword();
            check="ok";
        }
        else{check="error";}
    }

    public static String inputMail(){
        System.out.print("Please, insert a valid e-mail address >>:");
        email=userInput();
        return email;
    }
    public static String inputpassword(){
        System.out.print("Please, insert a Password (min 4 char max 8 char) >>:");
        password=userInput();
        return password;
    }

    public static int emailValidation(String email){

        // email is valid only if contains  @ and  .
        // return 1 if email it´s ok or -1 if it´s wrong
        if(email.contains("@") && email.contains(".")) {return 1;}
        else{System.out.println("\nthis email address is probably wrong!");
            int i = -1;
            return i;}


    }
}
