# BackEndTraining

import **static** java.Math.pow --
we can access the static members of a class directly without class name or any object.

#AutoBoxing --
converting object type to primitive type.

#Serialization --  
Object's state(Instance variables ) value can be stored as byte stream value in a file. used in Distributed computing.
For not serializaing a object in instance variables use transcient keyword;

#Deserialization --
reverse process of Serilization.
 
#Externalizabel--
it can control Serialization , even transient variable can be accessed

#JavaRunTime Areas
1.method area -- All static information and java classs.
2.Heap -- All instance objects will be created.
3.java stack -- each thread has seperate stack in stack the frame consits of  method's local variable wil be in that.
4.pc register --  next instruction count.
5.native method -- api call from os that will create a new stack .