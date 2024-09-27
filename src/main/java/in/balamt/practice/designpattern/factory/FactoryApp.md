#Factory design pattern

**Program to an Interface, Not an Implementation.**

```
Clients remain unaware of the specific types of objects they use, as long as the objects adhere to the interface that
client expects.
```

Factory as it refers it produces multiple & different kind of products.
Same way Factory pattern will help us in creating different kind of object for same categories.

This Factory pattern encapsulates object creation logic, which makes it easy to change later.

Example:

VehicleFactory can product Car, Auto, Bike.
But to do that we need to have Vehicle Interface which is implemented by Car, Bike & Auto.


