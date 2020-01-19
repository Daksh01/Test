import java.util.*;
class taxCalc{
    int age;
    String gender="";
    double income;
    void input()
    {
        Scanner sc =new Scanner(System.in);
        age=sc.nextInt();
        sc.nextLine();
        gender=sc.nextLine();
        income=sc.nextDouble();
    }
    void calc()
    {
        if(gender.equals("female") || age>65)
        {
            System.out.print("Wrong Category");    
        }
        else if(income<=160000){
            System.out.print("Nil");
        }
        else if(income>160000 && income<=500000)
        {
            double tax=(income-160000)*.1;
            
            System.out.print(tax);
        }
        else if(income>500000 && income<=800000)
        {
            double tax=((income-500000)*.2)+34000;
        
                    System.out.print(tax);
        }
        else{
            double tax=((income-500000)*.3)+94000;
        
                    System.out.print(tax);
            
        }
        
    }
}
class A{
    public static void main(String args[])
    {
        taxCalc t=new taxCalc();
        t.input();
        t.calc();
    }
}
