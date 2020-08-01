/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
import java.util.*;

/**
 *
 * @author Vignesha Masanan
 */
class studen
{
    int m1;
    int m2;
    int m3;
    String name;
    String dept;
    void getvalue()
    {
        System.out.println("enter namedept m1 m2 m3");
        Scanner obj=new Scanner(System.in);
        name=obj.next();
        dept=obj.next();
        m1=obj.nextInt();
        m2=obj.nextInt();
        m3=obj.nextInt();
    }
    void cal()
    {
        double s;
        s=(m1+m2+m3)/3;
        if(s>80)
            System.out.println("grade:first");
        else if(s>70 && s<79)
            System.out.println("grade:second");
        else if(s>50 && s<69)
            System.out.println("grade:third");
        else
            System.out.println("fail");
    }
    void display()
    {
        System.out.println("NAME"+name);
        System.out.println("DEPT"+dept);
        System.out.println("M1"+m1);
        System.out.println("M2"+m2);
        System.out.println("M3"+m3);
    }
}
public class student {
    public static void main(String[] args){
        studen obb[]=new studen[10];
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("enter student details:");
            obb[i]=new studen();
            obb[i].getvalue();
            obb[i].cal();
            obb[i].display();
        }
    }
    
}
