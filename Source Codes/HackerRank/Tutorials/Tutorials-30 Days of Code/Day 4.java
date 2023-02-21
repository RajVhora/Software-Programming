import java.util.*;
import java.io.*;
public class Person{
    private int age=0;
    public Person(int initialage)
    {
        if (initialage<0){System.out.println("Sorry the age you entered is invalid.Setting the age to zero.");}
        else {age=initialage;}
    }
    public void amIold(){
        if(age<10){System.out.println("You are young.");}
        else if(age<=19){System.out.println("You are a teenager.");}
        else {System.out.println("You are old.");}
    }
    public void yearPasses(){
        age++;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int t =sc.nextInt();
        for (int i=0;i<t;i++){
            System.out.println("Enter the age of person:");
            int age=sc.nextInt();
            Person P=new Person(age);
            P.amIold();
            for (int j=0;j<3;j++){P.yearPasses();}
            System.out.println("After three years...");
            P.amIold();
        }
        sc.close();
        }
    
    }
    