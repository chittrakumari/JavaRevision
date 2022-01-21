/*
 * Author Name: Chittra Kumari
 * IDE : Intellej Idea Ultimate Edition
 * Date : 21-01-2022
 */
package MethodInvocation;
class Calculator{
    //1.Create a method to add two numbers together and return result
    double addTwoNumbers(double firstNumber,double secondNumber){
        return  firstNumber+secondNumber;
    }
    //2. Create a method to subtract smaller double number from the larger double number and return result
    double subtractTwoNumbers(double smallerNumber,double largerNumber){
        return largerNumber-smallerNumber;
    }
    //3. Create a method to multiply  two double numbers together and return result
    double multiplyTwoNumbers(double firstNumber,double secondNumber){
        return firstNumber*secondNumber;
    }
    //4. Create a method to divide larger double number from  smaller double number and return result
    double divideTwoNumbers(double largerNumber,double smallerNumber){
        return largerNumber/smallerNumber;
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println("addition "+obj.addTwoNumbers(4.8,6.2));
        System.out.println("subtraction "+obj.subtractTwoNumbers(45.6,85.3));
        System.out.println("multiplication "+obj.multiplyTwoNumbers(4.6,7.4));
        System.out.println("division "+obj.divideTwoNumbers(36.7,6.2));
    }
}
