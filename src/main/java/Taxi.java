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
        move(Commands.valueOf(command));
    }

    public void move(Commands command) {
        switch (command) {
            case R -> xPosition++;
            case D -> yPosition++;
            case U -> yPosition--;
            case L -> xPosition--;
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
