# 🚦 Traffic Management System for Smart Cities

A Java-based **Smart Traffic Management System** that dynamically **prioritizes emergency vehicles**, optimizes **traffic light sequencing**, and predicts congestion using **data structures** like **Queue, Priority Queue, and Deque**.
 📌 Features
- 🚗 Queue (FIFO) for Normal Traffic** → Vehicles are processed in the order they arrive.
- 🚑 Priority Queue for Emergency Vehicles** → Ambulances, fire trucks, and police cars get priority over regular vehicles.
- 🛣 Dynamic Traffic Rerouting (Deque)** → Helps reroute vehicles efficiently during congestion or accidents.
- ⏳ Efficient Traffic Flow** → Reduces congestion and improves emergency response times.
- 📊 Real-time Simulation** → Simulates traffic flow based on predefined vehicle entries.

 🔧 Technologies Used
- Java
- Queue (FIFO)
- PriorityQueue
- Deque (Double-Ended Queue)




 🚀 How to Run
1️⃣ Clone the Repository

```sh

git clone https://github.com/yourusername/Traffic-Management-System.git
cd Traffic-Management-System


command of terminal for runiny the program 
javac TrafficManagementSystem.java
java TrafficManagementSystem



                    output

Car (Priority: 1) added to normal queue.
Bus (Priority: 1) added to normal queue.
Bike (Priority: 1) added to normal queue.
Ambulance (Priority: 3) added to emergency queue.
Fire Truck (Priority: 2) added to emergency queue.
New route added: Highway Route A
New route added: Express Route B
Old route removed: Highway Route A

Processing Emergency Vehicles First:
Emergency vehicle passing: Ambulance (Priority: 3)
Emergency vehicle passing: Fire Truck (Priority: 2)

Processing Normal Vehicles:
Passing through: Car (Priority: 1)
Passing through: Bus (Priority: 1)
Passing through: Bike (Priority: 1)

Final Rerouting Paths:
Current Rerouting Paths: [Express Route B]

