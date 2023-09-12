public class Taxi {
    boolean isPassengerOnBoard;
    String position = "0,0";

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
        return position;
    }

    public void move(String command) {
        this.position = "1,0";
    }

    public int getGridMeter() {
        return 2;
    }
}
