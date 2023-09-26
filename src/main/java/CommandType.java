public enum CommandType {
    RIGHT("R"), DOWN("D"), UP("U"), LEFT("L");
    private String value;

    static String left() {
        return LEFT.getValue();
    }

    static String up() {
        return UP.getValue();
    }

    static String down() {
        return DOWN.getValue();
    }

    static String right() {
        return RIGHT.getValue();
    }

    public String getValue() {
        return value;
    }

    CommandType(String value) {
        this.value = value;
    }
}