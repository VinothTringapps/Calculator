package org.example;



//Implement a simple calculator that performs basic arithmetic operations
//        (addition, subtraction, multiplication, and division).
//        This project will help you understand OOP concepts such as encapsulation, inheritance, and
//        polymorphism.


import java.util.logging.*;
import java.util.*;
 abstract class Cal{

     private int a;
     private int b;

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    abstract int setCal(int a,int b);



}
class Addition extends cal{

    public int setCal(int a, int b) {
       return a+b;
    }
}
class Subraction extends cal{

    public int setCal(int a, int b) {
        return a-b;
    }
}
class Multiplication extends cal{

    public int setCal(int a, int b) {
        return a*b;
    }
}

class Division extends cal{
     public int setCal(int a,int b){
         return a/b;
     }
}
public abstract class Calculator extends cal{
    public static void main(String[] args){
        Logger l=Logger.getLogger("Calculator");
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        int ch;
        cal c=null;
        do{
            l.info("1.Addition \n 2.Subraction \n 3.Multiplication \n4.Division");
            l.info("Enter the Choice :");
            ch= sc.nextInt();
            l.info("Enter the First Number :");
            a=sc.nextInt();
            l.info("Enter the Second Number :");
            b=sc.nextInt();

            switch (ch){
                case 1 ->
                    c= new Addition();

                case 2->
                    c= new Subraction();

                case 3->
                    c= new Multiplication();
                case 4->
                    c= new Division();

                default ->
                    l.info("Wrong choice !");


            }

                c.setA(a);
                c.setB(b);
                int s1=c.getA();
                int s2=c.getB();
                String s="the Value is "+c.setCal(s1,s2);
                l.info(s);

        }while (ch!=5);

    }
}