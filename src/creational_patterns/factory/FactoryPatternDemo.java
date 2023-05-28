package creational_patterns.factory;

public class FactoryPatternDemo {
    public void run() {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create Circle object using the factory
        Shape circle = shapeFactory.createShape("Circle");
        circle.draw();

        // Create Rectangle object using the factory
        Shape rectangle = shapeFactory.createShape("Rectangle");
        rectangle.draw();

        // Create Square object using the factory
        Shape square = shapeFactory.createShape("Square");
        square.draw();
    }
}

/*
Chat-GPT:

In this example, the Factory pattern is used to create different shapes (Circle, Rectangle, and Square) using a ShapeFactory. 
The ShapeFactory class has a method createShape that takes a shapeType parameter and returns the corresponding shape object based on the input.

The Shape interface defines the common draw method that each shape implements. The concrete shape classes (Circle, Rectangle, and Square) 
implement the Shape interface and provide their own implementation of the draw method.

The Factory pattern provides a solution for creating objects without specifying their concrete classes directly. 
By introducing a factory class that encapsulates the object creation logic, clients can use the factory to create objects 
based on certain criteria or parameters. This promotes loose coupling, enhances code maintainability, and allows for easy 
extension and addition of new object types in the future. The Factory pattern simplifies object creation by providing a centralized and 
flexible mechanism for creating objects, improving overall code organization and design.

*/