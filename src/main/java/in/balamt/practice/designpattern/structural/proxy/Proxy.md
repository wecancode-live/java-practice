# Proxy Design Pattern

-----------------------------------------------
Proxy means ‘in place of’, representing’ or ‘on behalf of’ are literal meanings of proxy 
and that directly explains Proxy Design Pattern.

Proxies are also called **surrogates**, **handles**, and **wrappers**.

A real world example can be a cheque or credit card is a proxy for what is in our bank account. 
It can be used in place of cash, and provides a means of accessing that cash when required.
And that’s exactly what the Proxy pattern does – “Controls and manage access to the object they are protecting“.

## When to use this pattern?
Proxy pattern is used when we need to create a wrapper to cover the main object’s complexity from the client. 
(Kind of encapsulating the core to be exposed outside)

### Types of proxies

1. **Remote proxy**:
   _They are responsible for representing the object located remotely. 
   Talking to the real object might involve marshalling and unmarshalling of data and talking to the remote object. 
   All that logic is encapsulated in these proxies and the client application need not worry about them._

2. **Virtual proxy**:
   _These proxies will provide some default and instant results if the real object is supposed to take some time to produce results.
   These proxies initiate the operation on real objects and provide a default result to the application. 
   Once the real object is done, these proxies push the actual data to the client where it has provided dummy data earlier._

3. **Protection proxy**:
   _If an application does not have access to some resource then such proxies will talk to the objects in applications 
   that have access to that resource and then get the result back._

4. **Smart Proxy**:
   _A smart proxy provides additional layer of security by interposing specific actions when the object is accessed. 
   An example can be to check if the real object is locked before it is accessed to ensure that no other object can change it_

### Advantage of Proxy design pattern

One of the advantages of Proxy pattern is security.
This pattern avoids duplication of objects which might be huge size and memory intensive. This in turn increases the performance of the application.
The remote proxy also ensures about security by installing the local code proxy (stub) in the client machine and then accessing the server with help of the remote code.
Drawbacks/Consequences:

This pattern introduces another layer of abstraction which sometimes may be an issue if the RealSubject code is accessed by some of the clients directly and some of them might access the Proxy classes. This might cause disparate behaviour.


### Disadvantage of Proxy design pattern

1. Code may become very complicated since lots of classes are introduced.
2. Server response might get delayed.


#### Example
1. Pay using Cash or Credit Card, Here Payment is the interface which is inherited by Cash and Credit card.
   