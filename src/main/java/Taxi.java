public class Taxi {
    boolean isPassengerOnBoard;

    boolean hasDestination;
    private String destinationName;

    public boolean passengerOnBoard() {
        return isPassengerOnBoard;
    }

    public void unloadPassenger(){
        this.isPassengerOnBoard = false;
    }

    public void loadPassenger() {
        this.isPassengerOnBoard = true;
    }

    public boolean hasDestination() {
        return hasDestination;
    }

    public void setDestinationName(String destinationName){
        this.destinationName = destinationName;
        this.hasDestination = true;
    }
}
