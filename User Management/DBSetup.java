/*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
*/
package UserManagement;
import java.io.*;

public class DBSetup {
    static String dirName = "UserDB\\";
    static String fileDB = dirName + "DBUsers.txt";
    public static void dirCreate() {


        File dir = new File(dirName);
        System.out.print("\nSoftware Setup:");
        if (dir.exists()) {
            System.out.print(".");
        } else {
            System.out.print(".");
            dir.mkdir();
        }
    }

    public static void fileCreate() {
        File file = new File(fileDB);

        System.out.print(".");
        if (file.exists()) {
            System.out.print(".");
        } else {
            System.out.print(".");
            try {
                file.createNewFile();
                System.out.print(".");

                    FileWriter writer = new FileWriter(fileDB);
                    writer.write("userdemo1@demomail.com" +
                                     "\nuserdemo1password" +
                                     "\nuserdemo2@demomail.com" +
                                     "\nuserdemo2password" +
                                     "\nuserdemo3@demomail.com" +
                                     "\nuserdemo3password");
                    writer.close();

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("\nit's no possible to create the file!" + e.getMessage());
            }
        }


    }

    public static void BKPCreate() {
           String fileBKP = "\\UserDB\\DBUsers.backup.txt";
    }

}
