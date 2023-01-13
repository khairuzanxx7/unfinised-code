public class RoomActivity extends Activity { //variable
    private String RoomType;
    private int numberOfParticipant;

    RoomActivity(String activityName, char organizer, double budget, String date, String RoomType, int numberOfParticipant) { //normal consturctor
        super(activityName, organizer, budget, date);
        this.RoomType = RoomType;
        this.numberOfParticipant = numberOfParticipant;
    }

    String getRoomType() { //accesor
    return RoomType;
    }
    int getNumberOfParticipant() {
    return numberOfParticipant;
    }

    public double roomCharge(int numberOfParticipants,char organizer) { //calculate
        double total = 0;
        if (organizer == 'P'){
        total = 25.00 * numberOfParticipants;
        }
        else if (organizer == 'U'){
        total = 10.00 * numberOfParticipants;
        }
        else{    //G
        total = 1500.0;
        }
        return total;

    }

    public void DisplayRA(){
        System.out.println("Room Type : " + this.RoomType);
        System.out.println("Number of participants : " + this.numberOfParticipant);
    }
    
}
