/*
 * Author Name: Chittra Kumari
 * IDE : Intellej Idea Ultimate Edition
 * Date : 21-01-2022
 */
package ControlStatements;

public class SwitchStatementDemo {
    public static void main(String[] args){

        int month =3;

        String monthString;

        /*switch(month){
            case 1:monthString="January";
                    break;
            case 2:monthString="Februrary";
                   break;
            case 3:monthString="March";
            break;
            case 4:monthString="April";
            break;
            default : monthString="December";
            break;

        }
        System.out.println(monthString);
        */
        /*char r='A';

        String monthString;

        switch(r){
            case 'A':monthString="January";
                break;
            case 'B':monthString="Februrary";
                break;
            case 'C':monthString="March";
                break;
            case 'D':monthString="April";
                break;
            default : monthString="December";
                break;

        }
        System.out.println(monthString);*/
        int ans=switch(month){
            case 1->1;

            case 2->2;
            default ->0;
        };
        System.out.println(ans);
    }
}
