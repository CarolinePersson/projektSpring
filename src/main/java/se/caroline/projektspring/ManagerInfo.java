package se.caroline.projektspring;

public class ManagerInfo {
    private String name;
    private String position;

    public ManagerInfo(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}
