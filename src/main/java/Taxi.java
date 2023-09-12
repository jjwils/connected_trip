public class Taxi {
    boolean isPassengerOnBoard;
    String position;

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

    public void move(String r) {
        this.setPosition;
    }
}
