import java.util.*;

class ABCTravels{
    String name="";
    double ticketcharge;
    int discount;
    double netamt;
    void input()
    {
        Scanner sc =new Scanner(System.in);
        name=sc.nextLine();
        ticketcharge=sc.nextDouble();
    }
    void calc()
    {
        if(ticketcharge>70000)
        {
            System.out.println("Discount is 18%");
            netamt=ticketcharge-ticketcharge*.18;
            System.out.println("net Amount:"+netamt);
            
        }
        else if(ticketcharge>=55001 && ticketcharge<=70000)
        {
            System.out.println("Discount is 16%");
            netamt=ticketcharge-ticketcharge*.16;
            System.out.println("net Amount:"+netamt);
            
        }
        else if(ticketcharge>=35001 && ticketcharge<=55000)
        {
            System.out.println("Discount is 12%");
            netamt=ticketcharge-ticketcharge*.12;
            System.out.println("net Amount:"+netamt);
            
        }
        else if(ticketcharge>=25001 && ticketcharge<=35000){
            System.out.println("Discount is 10%");
            netamt=ticketcharge-ticketcharge*.10;
            System.out.println("net Amount:"+netamt);
            
        }
        else{
            System.out.println("Discount is 2%");
            netamt=ticketcharge-ticketcharge*.02;
            System.out.println("net Amount:"+netamt);
            
        }
    }
}
class A{
    public static void main(String args[])
    {
        ABCTravels t=new ABCTravels();
        t.input();
        t.calc();
    }
}
