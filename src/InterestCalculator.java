/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karan Grover
 */
import java.util .*;
class IC
{
    public void SI(double pr, double t, double rate) 
    {
         double sim=(pr*t*rate)/100;
         System.out.println("Simple Interest="+sim);
    }

    public void CI(double pr, double t, double rate) 
    {
    double com=pr*Math.pow(1.0+rate/100.0,t)-pr;
    System.out. println("Compound Interest="+com);
    }
}
public class InterestCalculator
{
    public static void main (String argu[ ])
{
    IC obj=new IC();
    double pr,rate,t;
    Scanner sc=new Scanner (System. in);
    System.out.println("Enter the amount:");
    pr=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    t=sc.nextDouble();
    System. out. println("Enter the Rate of interest:");
    rate=sc.nextDouble();
    obj.SI(pr,t,rate);
    obj.CI(pr,t,rate);
}
}