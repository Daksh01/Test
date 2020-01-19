import java.util.*;
class library{
    int acno;
    String title="";
    String author="";
    void input()
    {
        Scanner sc =new Scanner(System.in);
        acno=sc.nextInt();
        sc.nextLine();
        title=sc.nextLine();
        author=sc.nextLine();
    }
    void display()
    {
        System.out.printf("Accession Number: \t\tTitle: \t\t Author: \n");
        System.out.printf("\t\t%d\t\t\t\t%s \t\t\t%s",acno,title,author);
    }
}
class A{
    public static void main(String[] args)
    {
        library l1=new library();
        l1.input();
        l1.display();
        
    }
}
