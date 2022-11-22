<h1>Lab 7 -- Inheritance</h1>

<h2>MVP</h2>

1. Please create a new project, with multiple classes.
   Using one of the themes above, start thinking about what properties could be defined on an abstract parent class, and that which should be created on the child sub-class
   Note: Use UML to plan your concept. Please check with a trainer for approval before you proceed with the coding phase
   This task focuses on this first step of visualising your logical system of classes as much as how to code this in Java!

**// Okay -- created Baking example.**

2. Create an abstract class
   Your example doesn't have to be real-world, but it should have at least some internal logic to it.

**// Okay -- created an Abstract class for "BakedGoods" (i.e. parent class)**

3. Extend the abstract class with at least 2 sub-classes
   The relationship should make sense (see examples given above).

**// Okay -- created 3 subclasses ("Cakes", "Cookies", "Cupcakes")**

4. Create a collection which accepts objects of either of those 2 types
   This can be an ArrayList, a Set, a HashMap. Whatever makes sense in your concept.

**// Problem: Can't figure ArrayLists out.**

<h2>Extension</h2>
5. Implement at least 1 method overload
   Demonstrate how you can have more than one implementation of the same method in a class.

**// Problem: Implemented method overload in ovenTemp but couldn't figure out where in the code it should go. Failed in @Test:**

    public String getOvenTemp(){
    return String.format("Bake me at %s!", this.ovenTemp);
    }
---------------

    public String getOvenTemp(String message){
        return String.format("I'm a no-bake cake!");
    }

6. Define an abstract method in the super-class and implement it in each of the sub-classes
   String getName()

**// Okay -- Abstracted my `getName` method. Not the best method to abstract (not ever overriden in any sub-classes), but worked out in terms of trying out the material learned in the lesson.**

7. Create an interface and implement it on at least 1 class
Also, use the interface you create as the type of a variable somewhere in your project. New up an object from a class that implements the interface.

**// Okay -- Created an `iIcing` interface, which I implemented successfully in "Cupcake" subclass.**


    
    

