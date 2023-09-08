public class Taxi {
    boolean isPassengerOnBoard;


    public boolean passengerOnBoard() {
        return isPassengerOnBoard;
    }

    public void unloadPassenger(){
        this.isPassengerOnBoard = false;
    }

    public void loadPassenger() {
        this.isPassengerOnBoard = true;
    }

    public String position() {
        return "0,0";
    }
}
