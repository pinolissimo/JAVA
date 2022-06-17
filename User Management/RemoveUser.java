/*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
 */
package UserManagement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static UserManagement.HmapCreate.hmapCreate;
import static UserManagement.Main.menuManagement;
import static UserManagement.RegenerateDB.regenerateDB;
import static UserManagement.UserInput.userInput;

public class RemoveUser {


    public static void removeUser(){


        HashMap<String,String> hmap=hmapCreate();

        System.out.print("\nPlease,insert user-email (if you don't know it , use [2] Search) >>:");
        String value=userInput();

        Set<String> keys = hmap.keySet();
        System.out.println("\n<< Looking for matches in the DataBase UserDB/DBUsers.txt >>\n");

        int elementsFound=0;
        String userToRemove="";
        String confirm="no";// default value protect Item

        for ( String key : keys ) {
            if(!value.equals("")&&key.equals(value)){
                userToRemove=key;
                elementsFound+=1;
                System.out.println(key);}
        }
        String message="found matching item:";
        if(elementsFound!=0){
            System.out.println("\n"+message+" "+elementsFound+"\n");
            System.out.print("<< Are you sure to remove it? enter 'yes'>>:\t");
            confirm=userInput();
            if (confirm.equalsIgnoreCase("yes")){

                hmap.remove(userToRemove);
                System.out.println("\n<<"+ userToRemove+" is been removed! >>\n");

                String stringkv="";
                for(Map.Entry el: hmap.entrySet()){
                    stringkv+=el.getKey()+" "+el.getValue()+" ";

                }

                regenerateDB(stringkv);

                menuManagement();
            }
            else{
                System.out.println("<< Not confirmed, user-remove aborted! >>");
            }
            menuManagement();

        }
        else{System.out.println("<< No matching items found! >>");
            menuManagement();
        }
    }
}
