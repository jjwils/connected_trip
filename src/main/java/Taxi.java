public class Taxi {
    boolean isPassengerOnBoard;
    String position = "0,0";
    private int xPosition = 0;
    private int yPosition = 0;

    public boolean passengerOnBoard() {
        return isPassengerOnBoard;
    }

    public void unloadPassenger() {
        this.isPassengerOnBoard = false;
    }

    public void loadPassenger() {
        this.isPassengerOnBoard = true;
    }

    public String position() {
        return position;
    }

    public void move(String command) {
        if (command == Commands.R) {
            xPosition++;
        } else if (command == Commands.D) {
            yPosition++;
        } else if (command == Commands.U) {
            yPosition--;
        } else if (command == Commands.L) {
            xPosition--;

        }
        this.position = xPosition + "," + yPosition;
    }


    public int xPosition() {
        return xPosition;
    }

    public int yPosition() {
        return yPosition;
    }
}
