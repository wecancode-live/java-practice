#Favor composition over inheritance a.k.a HAS-A better than IS-A?

**IS-A is an Inheritance relationship**
![](IS-A-InheritanceRelationship.jpg)

**HAS-A is a Relationship of Composition**
1. Dog has a relationship with Owner
2. Owner has a relationship with Taxi
3. Taxi has a relationship with Passenger

![](HAS-A-RelationshipOfComposition.jpg)

Inheritance we can use to avoid code duplicates.

### With Composition
* We can add any number of condiments(different objects) easily at runtime.
* Implementing new condiments by adding a new class.
* No code duplication
* Avoid class explosion

We can see this principle used in decorator pattern


