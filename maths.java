/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

/**
 *
 * @author Vignesha Masanan
 */
import java.util.*;
class arithmatic
{
    int a;
    int b;
    void addition(int a,int b)
    {
        System.out.println("addition is"+(a+b));
    }
    void subtraction(int a,int b)
    {
        System.out.println("subtraction is"+(a-b));
    }
    void multiplication(int a,int b)
    {
        System.out.println("multiplication is"+(a*b));
    }
    void division(int a,int b)
    {
        System.out.println("division is"+(a/b));
    }
}
public class maths {
    public static void main(String[] args){
        arithmatic obj=new arithmatic();
        System.out.println("enter the number");
        Scanner objt=new Scanner(System.in);
        obj.a=objt.nextInt();
        obj.b=objt.nextInt();
        obj.addition(obj.a,obj.b);
        obj.subtraction(obj.a,obj.b);
        obj.multiplication(obj.a,obj.b);
        obj.division(obj.a,obj.b);
    }
    
}
