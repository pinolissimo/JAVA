/*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
 */
package UserManagement;

import java.io.FileWriter;
import java.io.IOException;

public class RegenerateDB {

        public static void regenerateDB(String stringkv){


            String fileDB ="UserDB\\DBUsers.txt";

            FileWriter writer = null;
            try {
                writer = new FileWriter(fileDB,false);//append false overwrite the db-file
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("sono nel primo catch IOException");
            }
            try {
                String[] result ;
                result=stringkv.split(" ",0);
                for (int i=0;i< result.length-1;i+=2){

                    writer.write(result[i]+"\n");
                    writer.write(result[i+1]+"\n");  }

            } catch (IOException e) {
                e.printStackTrace();
            }
            catch (ArrayIndexOutOfBoundsException e){
                try {
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }