package creational_patterns.builder;

public class HouseBuilder {
    private House house;

    public HouseBuilder() {
        house = new House();
    }

    public HouseBuilder addWalls(String walls) {
        house.setWalls(walls);
        return this;
    }

    public HouseBuilder addRoof(String roof) {
        house.setRoof(roof);
        return this;
    }

    public HouseBuilder addDoors(String doors) {
        house.setDoors(doors);
        return this;
    }

    public HouseBuilder addWindows(String windows) {
        house.setWindows(windows);
        return this;
    }

    public House build() {
        return house;
    }
}