# OOP Vehicle System

## Overview

This project demonstrates key **Object-Oriented Programming (OOP)** concepts using a **vehicle system** implemented in **Java**. It includes:

- **Inheritance**: A `Vehicle` base class with `Car` and `Motorcycle` subclasses.
- **Interface Implementation**: A `Drivable` interface implemented by `Car` and `Motorcycle`.
- **Polymorphism**: 
  - Method overriding (`displayInfo()`)
  - Method overloading (`accelerate(int increment)`)
- **Data Coupling**: Passing primitive values in methods (`accelerate(int increment)`).
- **Stamp Coupling**: Passing objects as method parameters (`inspectVehicle(Vehicle vehicle)`).

---

## How to Run

1. Clone this repository:

    ```sh
    git clone https://github.com/YOUR_USERNAME/OOP_Vehicle_System.git
    ```

2. Navigate to the project folder:

    ```sh
    cd OOP_Vehicle_System
    ```

3. Compile and run the Java file:

    ```sh
    javac VehicleSystem.java
    java Main
    ```

---

## File Structure

```plaintext
OOP_Vehicle_System/
│── VehicleSystem.java  # Main Java implementation
│── README.md           # Project documentation (this file)
```

---

## Example Output

Toyota car is driving.
Harley-Davidson motorcycle is driving.
Toyota accelerated to 120 km/h
Harley-Davidson accelerated to 95 km/h
Inspecting vehicle:
Car Brand: Toyota, Speed: 120 km/h, Doors: 4
Inspecting vehicle:
Motorcycle Brand: Harley-Davidson, Speed: 95 km/h, Sidecar: false
