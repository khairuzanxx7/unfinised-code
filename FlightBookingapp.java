import java.util.Scanner;
public class FlightBookingapp
   {
   public static void main (String args[])
      {
      String na = null;
      long ic=0;
      boolean member=true;
      String dest=null;
      double p =0.0;
      double d=0.0;
      int i=0;
       
      String nam = null;
      String icN = null;
      boolean members = true;
      String desti = null;
      String numIc = null;
       
       
      Scanner input = new Scanner(System.in);
      
      System.out.println("----Hey welcome to our System. Please fill the information below.----");
      System.out.println();
       
       //array
      FlightBooking arrPassenger [] = new FlightBooking[2];
       
      for (int h = 0; h < arrPassenger.length ; h++ )
         {
         
        //normal
        //arrPassenger[a] = new FlightBooking (letak parameter data type x perlu) so dok perlu la declare atas tu
        
         System.out.println();
         System.out.print("Enter your name : ");
         nam= input.nextLine();
       
         System.out.print("Enter your ic number : ");
         icN = input.nextLine();
       
         System.out.print("Are you a member |true for yes| and |false for no |? : ");
         members = input.nextBoolean();
       
         System.out.print("Enter tour destination to go : ");
         desti = input.next().substring(0,5);
       
         System.out.println();
         System.out.println("---DETAILS---");
         System.out.println("Name : "+nam);
         System.out.println("Ic Number : "+icN);
         System.out.println("Member : "+members);
         System.out.println("Destination : "+desti);
       
       		
         FlightBooking calc= new FlightBooking(nam,icN,members,desti);
         p = calc.calcprice();
         d = calc.discount();
         System.out.println(" RM"+p);
         System.out.println(d);
         calc.calcFare(p,d);
         System.out.print("Total price need to be pay is RM "+calc.calcFare(p,d));
      
         System.out.println();
         input.nextLine();
       
         numIc = icN.substring(6,8); 
         
         
      System.out.println();
      
      if (numIc.equals("05"))
         {
         System.out.println("Youre from Negeri Sembilan!");
         System.out.println(nam);
         System.out.println(icN);
         System.out.println (numIc);
         }
       
         }
      
      System.out.println();
       //mutator
      FlightBooking a;
      a = new FlightBooking (nam,icN,members,desti);
      a.setName("MARIAM SOFEA");
      a.setIcNum("00030511555");
      a.setIsMember(true);
      a.setDestination("SEOUL");
       
      System.out.println();
      System.out.println("---DETAILS---");
      System.out.println(a.toString());
   
      
      }
  
   }