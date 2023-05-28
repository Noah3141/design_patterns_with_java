package creational_patterns.builder;

public class BuilderPatternDemo {
    public void run() {
        House defaultHouse = new House();
        defaultHouse.describe();


        HouseBuilder builder = new HouseBuilder();
        House house = builder
                .addWalls("Brick")
                .addRoof("Tiled")
                .addDoors("Wooden")
                .addWindows("Glass")
                .build();
        house.describe();
    }
}


/*
    The Builder pattern solves the problem of creating complex objects step by step and provides a flexible and readable way
    to construct them. It addresses scenarios where objects have many optional or interchangeable attributes, making the direct 
    instantiation of the object using a constructor or setter methods cumbersome and error-prone. By separating the construction 
    logic into a dedicated builder class, the Builder pattern allows the construction process to be guided incrementally, providing 
    clear methods to set individual properties or configurations. This approach enables the creation of objects with different variations, 
    promotes code reusability, and enhances code readability by abstracting the construction details from the client code. 
*/