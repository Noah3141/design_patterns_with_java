import creational_patterns.builder.BuilderPatternDemo;
import creational_patterns.singleton.SingletonPatternDemo;
import creational_patterns.factory.FactoryPatternDemo;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        // BuilderPatternDemo builderPatternDemo = new BuilderPatternDemo();
        // builderPatternDemo.run();
        
        // SingletonPatternDemo.run();

        FactoryPatternDemo factoryPatternDemo = new FactoryPatternDemo();
        factoryPatternDemo.run();

    }
}




// App
// ├── Creational_Patterns
// │   ├── Builder
// │   │   ├── BuilderPatternDemo.java
// │   │   ├── House.java
// │   │   └── HouseBuilder.java
// │   └── Singleton
// │       ├── SingletonPatternDemo.java
// │       └── Singleton.java
// ├── Structural_Patterns
// │   ├── Adapter
// │   │   ├── AdapterPatternDemo.java
// │   │   ├── Adaptee.java
// │   │   └── Target.java
// │   └── Decorator
// │       ├── DecoratorPatternDemo.java
// │       ├── Component.java
// │       ├── ConcreteComponent.java
// │       └── Decorator.java
// └── Behavioral_Patterns
//     ├── Observer
//     │   ├── ObserverPatternDemo.java
//     │   ├── Subject.java
//     │   ├── ConcreteSubject.java
//     │   └── Observer.java
//     └── Strategy
//         ├── StrategyPatternDemo.java
//         ├── Context.java
//         ├── ConcreteStrategyA.java
//         └── ConcreteStrategyB.java
