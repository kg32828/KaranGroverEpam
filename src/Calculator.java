/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karan Grover
 */
import java.util.Scanner;
class C
{

    void add(float a, float b) 
    {
        float res = a + b;
        System.out.println("Result = " + res);
    }

    void mlpy(float a, float b)
    {
        float res = a * b;
        System.out.println("Result = " + res);    
    }

    void divide(float a,float b) 
    {
        float res = a / b;
        
        System.out.println("Result = " + res);    
    }

}
public class Calculator
{
    public static void main(String args[])
    {
        C obj=new C();
        float a, b, res;
        int choice;
        Scanner scan = new Scanner(System.in);
		
        while(true)
        {
            System.out.println("........MAIN MENU......\n");
            System.out.println("1. Addition\n");
            System.out.println("2. Multiplication\n");
            System.out.println("3. Division\n");
            System.out.println("Enter Your Choice : ");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1 : 
                    System.out.println("Enter Two Number : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    obj.add(a,b);
                    break;
               
                case 2 : System.out.println("Enter Two Number : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    obj.mlpy(a,b);
                    break;
                    
                case 3 : System.out.println("Enter Two Number : ");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    obj.divide(a,b);
                    break;
                    
                default : 
                    System.out.println("Wrong Choice!!!");
                    break;
            }
    }
    }
}