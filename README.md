# OOP_Design_Challenge
Overview

This project demonstrates key Object-Oriented Programming (OOP) concepts using a vehicle system implemented in Java. It includes:

Inheritance: A Vehicle base class with Car and Motorcycle subclasses.

Interface Implementation: A Drivable interface implemented by Car and Motorcycle.

Polymorphism: Method overriding (displayInfo()) and method overloading (accelerate(int increment)).

Data Coupling: Passing primitive values in methods (accelerate(int increment)).

Stamp Coupling: Passing objects as method parameters (inspectVehicle(Vehicle vehicle)).
How to Run

Clone this repository:

git clone https://github.com/YOUR_USERNAME/OOP_Vehicle_System.git

Navigate to the project folder:

cd OOP_Vehicle_System

Compile and run the Java file:

javac VehicleSystem.java
java Main

File Structure

OOP_Vehicle_System/
│── VehicleSystem.java  # Main Java implementation
│── README.md           # Project documentation (this file)

Example Output

Toyota car is driving.
Harley-Davidson motorcycle is driving.
Toyota accelerated to 120 km/h
Harley-Davidson accelerated to 95 km/h
Inspecting vehicle:
Car Brand: Toyota, Speed: 120 km/h, Doors: 4
Inspecting vehicle:
Motorcycle Brand: Harley-Davidson, Speed: 95 km/h, Sidecar: false

License

This project is for educational purposes.
