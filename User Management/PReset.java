package UserManagement;

import java.util.HashMap;

import static UserManagement.HmapCreate.hmapCreate;
import static UserManagement.NewUser.*;


public class PReset {
    static String email,password,check;
    static int validation;
    public static void pReset(){
        HashMap<String,String> hmap=hmapCreate();
        System.out.print("\nPlease,insert email of user >>:");
        email=inputMail();
        validation=emailValidation(email);
        if (validation==1){
            password=inputpassword();
            check="ok";
        }
        else{check="error";}





        System.out.println("pReset()");
    }
}
