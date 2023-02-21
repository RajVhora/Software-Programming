import java.util.*;
class Person{
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    Person(String firstName,String lastName,int identification){
        this.firstName=firstName;
        this.lastName=lastName;
        this.idNumber=identification;
    }
    public void printPerson()
    {
        System.out.println("Name: "+lastName+", "+firstName+"\nID: "+idNumber);
    }
}


import java.util.*;
class Student extends Person{
    private int[] testScores;
    public String firstname;
    public String lastname;
    public int idNumber;
    Student(String f,String l,int id,int[] t){super(f,l,id);this.testScores=t;}
    public char calculate(){
         int a=testScores.length;
         int sum=0;
        for(int d=0;d<a;d++){
            sum=sum+testScores[d];
        }
        int avg=(sum/a)*100;
        if(avg>=90 && avg<=100 ){return 'O';}
        else if(avg>=80){return 'E';}
        else if(avg>=70){return 'A';}
        else if(avg>=55){return 'P';}
        else if(avg>=40){return 'D';}
        else {return 'T';}
    }
}


import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the Details of Student:");
        String firstName=scan.next();
        String lastName=scan.next();
        int id=scan.nextInt();
        int numScores=scan.nextInt();
        int[] testScores=new int[numScores];
        for(int i=0;i<numScores;i++){
            testScores[i]=scan.nextInt();
        }
        scan.close();
        Student s=new Student(firstName,lastName,id,testScores);
        s.printPerson();
        System.out.println("Grade: "+s.calculate());
    }
}