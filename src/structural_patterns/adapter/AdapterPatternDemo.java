package structural_patterns.adapter;

public class AdapterPatternDemo {
    
}



/* 
The adapter pattern allows objects with incompatible interfaces to collaborate with one another. In this example,
we import a module that does neat things with JSON data, and want to do those neat things, but we have all our data
in XML, and all our code in XML. To solve this in a convoluted OOP way, we can bake a wrapper around the incoming model,
called an adapter, which inserts a conversion step before calling any of the cool things the incoming model does.
*/