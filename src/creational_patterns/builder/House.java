package creational_patterns.builder;

public class House {
    private String walls = "Clay";
    private String roof = "Thatch";
    private String doors = "None";
    private String windows = "Holes";

    


    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void describe() {
        System.out.println("House walls: " + this.walls);
        System.out.println("House roof: " + this.roof);
        System.out.println("House doors: " + this.doors);
        System.out.println("House windows: " + this.windows);
    }

    // Other methods and getters for the House
}