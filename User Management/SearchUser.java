/*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
 */
package UserManagement;

import java.util.HashMap;
import java.util.Set;

import static UserManagement.HmapCreate.hmapCreate;
import static UserManagement.Main.menuManagement;

import static UserManagement.UserInput.userInput;

public class SearchUser {

    public static void searchUser(){
        String el1="._";
        String tab=" ";
        int elementsFound=0;


        HashMap<String,String> searchmap=hmapCreate();

        System.out.print("\nPlease,insert user-email or partial information >>:");
        String valueOfInput=userInput();
        valueOfInput=valueOfInput.trim().toLowerCase();

        Set<String> keys = searchmap.keySet();

        System.out.println("\n<< Looking for matches in the DataBase UserDB/DBUsers.txt >>\n");

        for ( String key : keys ) {
            if(key.contains(valueOfInput)){
                elementsFound+=1;
                String message="found matching item:";
                int len1=message.length();
                int len2=key.length();
                int result=60-(len1+len2);
                System.out.println(message+tab.repeat(result)+key);
                System.out.println(el1.repeat(30));


            }

        }
        if(elementsFound!=0){
            System.out.println("\nFound items:"+tab+elementsFound);}
        else{System.out.println("<< No matching items found! >>");}

        menuManagement();

       
    }
}
