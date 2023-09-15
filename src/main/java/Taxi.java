public class Taxi {
    boolean isPassengerOnBoard;
    String position = "0,0";
    private int xPosition = 0;
    private int yPosition = 0;

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
        xPosition++;
        this.position = xPosition+",0";
        if(command == "D") {
            yPosition++;
            this.position = "0,"+yPosition;
        }else if(command == "U") {
            yPosition--;
            this.position = "0,"+yPosition;
        }
    }

    public int getGridMeter() {
        return 1;
    }

    public int xPosition() {
        return xPosition;
    }

    public int yPosition() {
        return yPosition;
    }
}
