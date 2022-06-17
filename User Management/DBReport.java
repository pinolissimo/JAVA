/*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
*/
package UserManagement;

import java.util.HashMap;
import java.util.Map;

import static UserManagement.HmapCreate.hmapCreate;
import static UserManagement.Main.menuManagement;

public class DBReport {
    public static void dbReport(){
        String el1="._";
        String tab=" ";
        HashMap<String,String> reportMap=hmapCreate();
        System.out.println("\n<< Report of UserDB/DBUsers.txt >>\n");
        
        for(Map.Entry<String,String> el: reportMap.entrySet()){
            int lTot=60;
            int len1= el.getKey().toString().length();
            int len2= el.getValue().toString().length();
            int element=lTot-len1-len2;
            String currentK= el.getKey().toString();
            String currentV= el.getValue().toString();

            System.out.println(currentK+tab.repeat(element)+currentV);
            System.out.println(el1.repeat(30));
        }


        System.out.println("Users in the DataBase:"+tab+(reportMap.size()));

        menuManagement();

    }
}