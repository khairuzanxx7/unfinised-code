import java.util.scanner;
public class BookMain{

public static void main(String args[]){

Scanner scanner = new Scanner (System.in);
String ISBN;
String tittle;
String day, month, year;
int quantity, typeBook, memorySize, numPage;
int countD, countP = 0; //digital/physical
boolean hardcover;

Book arrBook[] = new Book[100];
Date dt = new Date(day, month, year);

System.out.println("Please choose the book type");
System.out.println("1.For Digital Book and 2.For Physical Book");
System.out.println(" ");
System.out.println("your respond:  ");
typeBook = scanner.nextInt();

for (int i = 0; i < arrBook.length; i++){

if(typeBook == 1){
System.out.println("IBSN: ");
ISBN = scanner.nextline();
System.out.println("Book Tittle: ");
tittle = scanner.nextline();
System.out.println("Quantity: ");
quantity = scanner.nextline();
System.out.println("Memory Size: ");
memorySize = scanner.nextline();

System.out.println("Day: ");
day = scanner.nextline();
System.out.println("Month: ");
month = scanner.nextline();
System.out.println("Year: ");
year = scanner.nextline();

arrBook[i] = new DigitalBook(ISBN, tittle, quantity, memorySize, dt);
System.out.print(arrBook[i].toString);
}

else if(typeBook == 2){
System.out.println("IBSN: ");
ISBN = scanner.nextline();
System.out.println("Book Tittle: ");
tittle = scanner.nextline();
System.out.println("Quantity: ");
quantity = scanner.nextline();
System.out.println("Number of page: ");
numPage = scanner.nextline();
System.out.print("Hard cover or not (true /false)");
hardcover = scanner.nextBoolean();

arrBook[i] = new PhysicalBook(ISBN, tittle, quantity, numPage, dt);
System.out.print(arrBook[i].toString);
}

if(dt.getDay().equals("22") && dt.getMonth().equals("7")){
}

for(int r = 0; r < arrBook.length; r++){

if(arrBook[r] instanceof DigitalBook){
countA++;
else if()
countB++;
}

if (countD>countP)
System.out.println("digital book");
else
System.out.println("physical book");
}
}



