
import java.util.Scanner;


public class bookstore {
    static Scanner myScanner=new Scanner(System.in);
    static String[] books={"java","c","python"};
   static final double studentDiscount=0.3;
   static final double teacherDiscount=0.4;
   static final double alineDiscount=0.0;
    public static void main(String[] args)
    {
        prln("....Welcome to our bookstore.....");
        prln("Which programming book do you want: ??");
        prln("");
        prln("python? java? or c");
       String userchoice=myScanner.nextLine();
      if(books[0].toLowerCase().equals(userchoice.toLowerCase()))
      {
         prln("You have selected "+books[0]);
         price(books[0]);
      }
     else  if(books[1].toLowerCase().equals(userchoice.toLowerCase()))
      {
           prln("You have selected "+books[1]); 
            price(books[1]);
      }
     else  if(books[2].toLowerCase().equals(userchoice.toLowerCase()))
      {
           prln("You have selected "+books[2]); 
            price(books[2]);
      }
     else 
      {
          prln("Sorry your choice is not right");
      }
      
    }
    
    static void price(String bookname)
    {
        prln("are your student?,teacher?,aline?:");
        String ans=myScanner.nextLine();
        double rate=200;
        if(ans.toLowerCase().equals("teacher"))
        {
            rate=rate-(rate*teacherDiscount);
            showprice(rate);
        }
        else if(ans.toLowerCase().equals("student"))
        {
             rate=rate-(rate*studentDiscount);
             showprice(rate);
        }
        else if(ans.toLowerCase().equals("aline"))
        {
             rate=rate-(rate*alineDiscount);
             showprice(rate);
        }
        else
        {
          prln("Sorry we can not serve you right now");  
        }
    }
    static void showprice(double taka)
    {
        prln("Your total ammount: "+ taka);
    }
    
    static void prln(Object anyobject)
    {
        System.out.println(anyobject);
    }
    static void pr(Object anyobject)
    {
        System.out.print(anyobject);
    }
}
