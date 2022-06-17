/*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
*/
package UserManagement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class  HmapCreate {

    public static HashMap<String, String> hmapCreate() {

        HashMap<String, String> hmap = new HashMap<>();

        FileReader reader = null;
        int data = 0;
        String key = "";
        String value = "";
        String[] result ;

            try {
                reader = new FileReader("UserDB\\DBUsers.txt");


                while (data != -1) {
                    data = reader.read();
                    //System.out.println((char) data);
                    if(data!=-1)value += ((char)data);
                  
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        result=value.split("[\\r\\n]+",0);

        try {
                reader.close();


           /* System.out.println("valore di data:" + data);
          System.out.println("valore unico stringa:\n"+value);

            System.out.println("valore di result:\n"+ Arrays.toString(result));*/
             //   System.out.println("\nreader closed!");


            } catch (IOException e) {
                e.printStackTrace();
            }

             // to fill hmap with k,v
            // ciclo for array result

          for(int i=0;i<result.length-1;i+=2){

           // puts the elements of result[] in the HashMap
               hmap.put(result[i].toLowerCase(),result[i+1].toLowerCase());

          // System.out.println(result[i]+"\t\t"+result[i+1]);

             }

            // this code reads the Hashmap elements k,v
       /* //System.out.println("\n");
             for(Map.Entry el: hmap.entrySet()){
                 System.out.println("Chiave:"+el.getKey()+"\tValore:"+el.getValue());
             }*/

              return hmap;


    }
    }



