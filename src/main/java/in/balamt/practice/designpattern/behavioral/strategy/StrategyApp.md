#Strategy Pattern

The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.

_Instead of inheriting behavior like the IS-A relationship, the HAS-A composes the behavior._

## Advantages of the Strategy Pattern
1. A family of algorithms can be defined as a class hierarchy and can be used interchangeably to alter application behavior
   without changing the architecture.
2. By encapsulating the algorithm separately, new algorithms complying with the same interface can be easily introduced.
3. The application can switch strategies at run-time.
4. Strategy enables the clients to choose the required algorithm, without a "switch" statement or a series of "if-else" 
statements.
5. Data structures used for implementing the algorithm are completely encapsulated in Strategy Classes. Therefore, 
the implementation of an algorithm can be changed without affecting the Context class.


## Disadvantages of the Strategy Pattern:
1. The application must be aware of all the strategies to select the right one for the right solution.
2. Context and the strategy classes normally communicate through the interface specified by the abstract strategy 
 base class must expose interface for all the required behaviours, which some concrete strategy classes might not implement.
3. In most cases, the application configures the Context with the required strategy object. Therefore, the application
 needs to create and maintain two objects in place of one.


----------------------------------------------------
####Questions & Answers

Q. When working with inheritance, which kind of relationship do you have with classes?
A. Classes share an IS-A relationship.


Q. What does abstract mean in inheritance when working with subclasses?
A. Subclasses must override all abstract methods of its abstract superclass.

Q. What is an interface, and how is it used in design patters?
A. Design patterns use interfaces to define methods an object must have to be considered a particular type.

Q. When working with design principles, which of the following defines "Encapsulate What Varies"?
A. Once you separate the parts that are changing, you can then modify those parts without affecting the rest 
of the code.

![Strategy Pattern](StrategyPatternCaseDiag.jpg)