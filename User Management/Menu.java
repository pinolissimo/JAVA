/*
Open Boot camp 2022
Giuseppe Allocca
Personal Project: User Management Software
Language: Java   v.17
Framework: Intellij Idea Community Version
 */
package UserManagement;
public class Menu {
    public static void menu(){
        String tab="\t",tab2=tab.repeat(2),tab3=tab.repeat(3),tab4=tab.repeat(4);
        System.out.println("\n"+tab4+tab3+"<<< USER MANAGEMENT SOFTWARE >>>\n");
        System.out.println(tab4+"[1]New"+tab3+"[2]Search\n");
        System.out.println(tab4+"[3]Remove"+tab2+"[4]Report"+tab3+"[5]Exit\n");
        System.out.println(tab4+"Please, insert a number from 1 to 5 and press [Enter]");
        System.out.print("\n"+tab4+">>:");}
       }
