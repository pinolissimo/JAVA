/*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
 */
package UserManagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendNewUser {

    public static void appendNewUser(String email,String password){
        String fileDB ="UserDB\\DBUsers.txt";

        FileWriter writer = null;
        try {
            writer = new FileWriter(fileDB,true);
            writer.write("\n"+email);
            writer.write("\n"+password);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
