/*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
 */
package UserManagement;

import static UserManagement.DBReport.dbReport;
import static UserManagement.NewUser.newUser;
import static UserManagement.RemoveUser.removeUser;
import static UserManagement.SearchUser.searchUser;

public class UserChoiceInMenu {
    public static void  userChoiceInMenu(int choice){

        switch (choice){
            case(1):{newUser();break;}   //ok
            case(2):{searchUser();break;}   //ok
            case(3):{removeUser();break;}
            case(4):{dbReport();break;}  //ok
            case(5):{System.exit(0);break;}   //ok

        }
    }
  }