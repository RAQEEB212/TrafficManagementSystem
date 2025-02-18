import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Deque;

class Vehicle implements Comparable<Vehicle> {
    String type;
    int priority; // Higher number = higher priority

    public Vehicle(String type, int priority) {
        this.type = type;
        this.priority = priority;
    }

    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(other.priority, this.priority); // Higher priority first
    }

    @Override
    public String toString() {
        return type + " (Priority: " + priority + ")";
    }
}

class TrafficQueue {
    Queue<Vehicle> normalQueue = new LinkedList<>();

    public void enqueue(Vehicle vehicle) {
        normalQueue.add(vehicle);
        System.out.println(vehicle + " added to normal queue.");
    }

    public Vehicle dequeue() {
        return normalQueue.poll(); // Removes first vehicle in FIFO order
    }

    public void processQueue() {
        while (!normalQueue.isEmpty()) {
            System.out.println("Passing through: " + dequeue());
        }
    }
}

class EmergencyTrafficQueue {
    PriorityQueue<Vehicle> emergencyQueue = new PriorityQueue<>();

    public void enqueue(Vehicle vehicle) {
        emergencyQueue.add(vehicle);
        System.out.println(vehicle + " added to emergency queue.");
    }

    public Vehicle dequeue() {
        return emergencyQueue.poll(); // Process highest priority first
    }

    public void processQueue() {
        while (!emergencyQueue.isEmpty()) {
            System.out.println("Emergency vehicle passing: " + dequeue());
        }
    }
}

class TrafficRerouting {
    Deque<String> routes = new LinkedList<>();

    public void insertFront(String route) {
        routes.addFirst(route);
        System.out.println("New route added: " + route);
    }

    public void deleteRear() {
        String removedRoute = routes.pollLast();
        if (removedRoute != null) {
            System.out.println("Old route removed: " + removedRoute);
        }
    }

    public void displayRoutes() {
        System.out.println("Current Rerouting Paths: " + routes);
    }
}

public class TrafficManagementSystem {
    public static void main(String[] args) {
        // Normal Queue (FIFO)
        TrafficQueue trafficQueue = new TrafficQueue();
        trafficQueue.enqueue(new Vehicle("Car", 1));
        trafficQueue.enqueue(new Vehicle("Bus", 1));
        trafficQueue.enqueue(new Vehicle("Bike", 1));

        // Emergency Priority Queue
        EmergencyTrafficQueue emergencyQueue = new EmergencyTrafficQueue();
        emergencyQueue.enqueue(new Vehicle("Ambulance", 3));
        emergencyQueue.enqueue(new Vehicle("Fire Truck", 2));

        // Traffic Rerouting (Deque)
        TrafficRerouting rerouting = new TrafficRerouting();
        rerouting.insertFront("Highway Route A");
        rerouting.insertFront("Express Route B");
        rerouting.deleteRear();

        // Process Vehicles
        System.out.println("\nProcessing Emergency Vehicles First:");
        emergencyQueue.processQueue();

        System.out.println("\nProcessing Normal Vehicles:");
        trafficQueue.processQueue();

        System.out.println("\nFinal Rerouting Paths:");
        rerouting.displayRoutes();
    }
}