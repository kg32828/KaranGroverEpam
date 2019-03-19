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
class HC
{

    void SM(float area) {
        float totalCost=1200*area;
        System.out.println("COST IS: "+totalCost);    }

    void ASM(float area) {
        float totalCost=1500*area;
        System.out.println("COST IS: "+totalCost); }

    void HSM(float area) {
        float totalCost=1800*area;
        System.out.println("COST IS: "+totalCost); }

    void FAH(float area) {
        float totalCost=2500*area;
        System.out.println("COST IS: "+totalCost); }
    
}

public class HCost {
    public static void main(String args[])
    {
        HC obj=new HC();
        int choice;
        float area,totalCost;
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("........VARIOUS-MATERIALS......");
            System.out.println("1.STANDARD MATERIAL");
            System.out.println("2.ABOVE STANDARD MATERIAL ");
            System.out.println("3.HIGH STANDARD MATERIAL");
            System.out.println("4.HIGH STANDARD MATERIAL AS WELL AS FULLY AUTOMATED HOME");
            System.out.println("Enter Your Choice : ");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1 : 
                    System.out.println("Enter The Total Area of House(sq-ft): ");
                    area = scan.nextFloat();
                    obj.SM(area);
                  
                    break;
               
                case 2 : 
                    System.out.println("Enter The Total Area of House (sq-ft): ");
                    area = scan.nextFloat();
                    obj.ASM(area);
                    break;
                    
                case 3 : 
                    System.out.println("Enter The Total Area of House (sq-ft):");
                    area = scan.nextFloat();
                    obj.HSM(area);
                    break;
                   
                case 4 : 
                    System.out.println("Enter The Total Area of House (sq-ft):");
                    area = scan.nextFloat();
                    obj.FAH(area);
                    break;
                    
                default : 
                    System.out.print("Wrong Choice!!!");
                    break;
            }
    }
    }
}
