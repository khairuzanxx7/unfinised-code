public class FlightBooking
   {
   private String name;
   private String icNum;
   private boolean isMember;
   private String destination;
   double price = 0;
   double discount = 0;
   
   FlightBooking()
      {
      
      name = null;
      icNum = null;
      isMember = true;
      destination = null;
      
      }
 
   //normal
   public FlightBooking(String na, String ic, boolean member, String dest)
      {
      
      name = na;
      icNum = ic;
      isMember = member;
      destination = dest;
               
      }
      
  //accessor/retriever
   String getName()
      {
      return name;
      }
   String getIcNum()
      {
      return icNum;
      }
   boolean getIsMember()
      {
      return isMember;
      }
   String getDestination()
      {
      return destination;
      }
   
   void setData (String na, String ic, boolean member, String dest)
      {
      name = na;
      icNum = ic;
      isMember = member;
      destination = dest;
      }
   	 
   //mutator
   void setName ( String na )
      {
      name = na;
      }
   
   void setIcNum ( String ic )
      {
      icNum = ic;
      }
   
   void setIsMember ( boolean member )
      {
      isMember = member;
      }
   
   void setDestination ( String dest )
      {
      destination = dest;
      }
     
      // mutator tu kalau nok buat skali, kena buat void setData (dalam ni letok parameter with data type)
        
   double calcprice()
      {
      double p =0.0;
        //double price=0.0;
      if(destination.equalsIgnoreCase("perth"))
         p=2500.00;
      else if (destination.equalsIgnoreCase("seoul"))
         p=1600.00;
        
      return p;
        
      }

   double discount()  
      {
      double d ;
      
      if (isMember == true)
         d = 20.0 / 100;
      else 
         d = 0.00 / 100;
   
      return d;
      }

   
   double calcFare(double p, double d)
      {
      double fare;
      double afterdiscount;
      afterdiscount = p * d;
      fare = p - afterdiscount;
      
      return fare;
      
      }        
      
      //printer
   public String toString()
      {
      return name + " \n " + icNum + " \n " + destination
         + " \n " + price;
      }
 
   }