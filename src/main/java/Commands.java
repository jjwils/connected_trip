public enum Commands {
    R("R"), D("D"), U("U"), L("L");
    private final String value;

    Commands(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}