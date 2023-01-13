import java.util.*;
import java.util.Scanner;

public class Activity { //variable
    private String activityName; //My New Me, Big Data
    private char organizer; //G-Government, P-Private, U-University
    private double budget;  //33600.00
    private String date;    //dd/mm/yyyy

    Activity(String activityName, char organizer, double budget, String date){ //normal constructor
        this.activityName = activityName;
        this.organizer = organizer;
        this.budget = budget;
        this.date = date;
    }

    String getActivityName(){ //accesor
    return activityName;
    }
    char getOrganizer(){
    return organizer;
    }
    double getBudget(){
    return budget;
    }
    String getDate(){
    return date;
    }

    public void Display(){ //printer
        System.out.println("Activity name : " + this.activityName);
        System.out.println("Organizer : " + this.organizer);
        System.out.println("Budget : " + this.budget);
        System.out.println("Date : " + this.date);
    }

    public static void main(String[] args){  //run block & printer

        char check;
        RoomActivity[] activity = new RoomActivity[1];
        try (Scanner sc = new Scanner(System.in)) {

            for (int i = 0; i < activity.length; i++){

                System.out.print("Please enter Activity name: ");
                String activityName = sc.nextLine();
                System.out.print("Please enter Organizer Type (Goverment/Private/University) : ");
                char organizer = sc.next().charAt(0);
                System.out.print("Please enter budget (00000): ");
                double budget = sc.nextDouble();
                sc.nextLine();
                System.out.print("Please enter date (dd/mm/yyyy): ");
                String date = sc.nextLine();
                System.out.print("Please enter room type (A=Auditorium/M=Meeting Room): ");
                String roomType = sc.nextLine();
                System.out.print("Please enter num of participant : ");
                int numParticipant = sc.nextInt();

                RoomActivity a = new RoomActivity(activityName,organizer,budget,date,roomType,numParticipant);
                activity[i] = a;
            }

            System.out.println();
            System.out.println("Display All Booking");

            for (int i = 0; i < activity.length; i++){
                System.out.println();
                activity[i].Display();
                activity[i].DisplayRA();
                System.out.println();
            }

            System.out.println("Display All Private Booking");

            for (int i = 0; i < activity.length; i++){
                if (activity[i].getOrganizer() == 'P' || activity[i].getOrganizer() == 'p'){
                    System.out.println();
                    activity[i].Display();
                    activity[i].DisplayRA();
                    System.out.print("total Charge is : "+activity[i].roomCharge(activity[i].getNumberOfParticipant(),activity[i].getOrganizer()));
                    System.out.println();
                }
            }

            System.out.println();
            System.out.println("Display All Lab Booking with 35 Participants ");

            for (int i = 0; i < activity.length; i++){
                int total = 0;
                
                if (activity[i].getRoomType().matches("L")){
                    if (activity[i].getNumberOfParticipant() > 30){
                        System.out.println();
                        activity[i].Display();
                        activity[i].DisplayRA();
                        System.out.print("total Charge is : "+activity[i].roomCharge(activity[i].getNumberOfParticipant(),activity[i].getOrganizer()));
                        System.out.println();
                        total += 1;
                    }
                }
                System.out.print("Total number of booking is : " + total);
            }
           }
        }
    }
