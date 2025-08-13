package com.company;
import java.util.Scanner;
public class cwh_ch4_PS {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // PROBLEM 1

        System.out.print("enter your age : ");
        int a;
        a=sc.nextInt();
        if(a==11){
            System.out.println(" I am 11!");
        }
        else{
            System.out.println(" I am not 11!");
        }


        // PROBLEM 2

        System.out.print(" enter maths marks : ");
        int m;
        m=sc.nextInt();
        System.out.print(" enter your physics marks : ");
        int p;
        p=sc.nextInt();
        System.out.print(" enter your chemistry marks : ");
        int c;
        c=sc.nextInt();
        float per=((p+c+m)/3.0f);
        System.out.println(per);
        if(p>33&&c>33&&m>33&&per>40){
            System.out.println(" you are pass ");
        }
        else{
            System.out.println(" you are fail ");
        }


        // PROBLEM 3;


        float income;// inome in lacks
        float tax=0;
        System.out.print(" Enter your income in lacks per annum : ");
        income=sc.nextFloat();
        if(income<=2.5f){
            tax=tax+0;
            System.out.println(" No tax");
        }
        else if(income<=5.0f){
        tax=tax+((income-2.5f)*5)/100;

            }
            else if( income<=10.0f){
                tax=tax+((5.00f-2.5f)*5)/100;
                  tax=tax+((income-5.0f)*20)/100;

                }
                else {
                    tax=tax+((5.0f-2.5f)*5)/100;
                    tax=tax+((10.0f-5.0f)*20)/100;
                    tax=tax+((income-10.0f)*30)/100;

                }
        System.out.print(" Income Tax Paybel:");
        System.out.println(tax);


        // PROBLEM 4

        int day ;
        System.out.print(" Enter day Number :  ");
        day=sc.nextInt();
        switch (day){ // enhanced switch method
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
            }

             // PROBLEM 5

        int year ;
        System.out.print(" Enter year : ");
        year = sc.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println(" This year is Leap Year ! ");
        }
else{
            System.out.println(" This year is not Leap year ");
        }



// PROBLEM 6

        System.out.print(" Enter domain of website : ");
        String website=sc.nextLine();
         switch (website){
             case ".com":
                 System.out.println(" This is commercial website");
                 break;
             case ".org":
                 System.out.println(" This is organization website ");
                 break;
             case ".in":
                 System.out.println("This is indian website ");
                 break;
         }


    }
}
