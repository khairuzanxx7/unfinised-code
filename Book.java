public class Book{
 
private String ISBN; 
private String tittle; 
private int quantity; 
   
public Book(){
ISBN = null; 
tittle = null;  
quantity = 0; 
} 
   
Book(String ISBN, String tittle, int quantity){ 
this.ISBN = ISBN; 
this.tittle = tittle; 
this.quantity = quantity;
} 
      
String getISBN(){ 
return ISBN; 
} 
String getTittle(){ 
return tittle; 
}  
int getQuantity(){ 
return quantity; 
}
   
void setData(String I, String t, int q){ 
ISBN = I; 
tittle = t;
quantity = q; 
} 
     
public String toString(){     
return "ISBN : " +ISBN+ "\n" +
"Tittle: " +tittle+ "\n" +
"Quantity: " +quantity; 
} 
}