public class Taxi {
    public static final String R = "R";
    public static final String D = "D";
    public static final String U = "U";
    public static final String L = "L";
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
        if (command == R) {
            xPosition++;
        } else if (command == D) {
            yPosition++;
        } else if (command == U) {
            yPosition--;
        } else if (command == L) {
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
