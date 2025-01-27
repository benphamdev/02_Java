package $07;

import $07.employee.*;
import $07.hotel.Hotel;
import $07.hotel.Room;
import $07.employee.EmployeeManagement;
import $07.management.Salary;

import java.util.Scanner;

public class Main {

    private static Hotel hotel = new Hotel("Hotel");
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeManagement employeeManagement = new EmployeeManagement();

    public static void main(String[] args) {
        // Write your code here

        int option;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            printMenu();
            try {
                option = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid option");
                scanner.nextLine();
                continue;
            }

            if (option == 0) break;

            try {
                switch(option) {
                    case 1 -> configRoom();
                    case 2 -> configEmployee();
                    case 3 -> assignRoomToEmployee();
                    case 4 -> getRoomByEmployee();
                    case 5 -> getSalary();
                    default -> System.out.println("Invalid option");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void getSalary() {
        System.out.println("Enter employee id:");
        String employeeId = scanner.next();

        if (!employeeManagement.getEmployeeMap().containsKey(employeeId)) {
            throw new RuntimeException("Employee id does not exist");
        }

        Employee employee = employeeManagement.getEmployeeMap().get(employeeId);
        if (employee instanceof Salary) {
            System.out.println("Salary: " + ((Salary) employee).getSalary());
        } else {
            System.out.println("Employee does not have salary");
        }
    }

    private static void getRoomByEmployee() {
        System.out.println("Enter employee id:");
        String employeeId = scanner.next();

        if (!employeeManagement.getEmployeeMap().containsKey(employeeId)) {
            throw new RuntimeException("Employee id does not exist");
        }

        Employee employee = employeeManagement.getEmployeeMap().get(employeeId);
        System.out.println("Rooms assigned to employee:");
        for (Room room : employee.getRooms()) {
            System.out.printf("Room id: %s - %s\n", room.getId(),  room.getName());
        }
    }

    private static void assignRoomToEmployee() {
        System.out.println("Enter employee id:");
        String employeeId = scanner.next();

        if (!employeeManagement.getEmployeeMap().containsKey(employeeId)) {
            throw new RuntimeException("Employee id does not exist");
        }

        System.out.println("Enter room id:");
        String roomId = scanner.next();

        if (!hotel.getRoomMap().containsKey(roomId))
            throw new RuntimeException("Room id does not exist");

        Room room = hotel.getRoomMap().get(roomId);
        employeeManagement.assignRoomToEmployee(employeeId, room);

        System.out.println("Room assigned successfully");
    }

    private static void configEmployee() {
        System.out.println("Enter employee id:");
        String id = scanner.next();

        System.out.println("Enter employee name:");
        String name = scanner.next();

        System.out.println("Type of employee:");
        System.out.println("1. Manager");
        System.out.println("2. Labor");
        System.out.println("3. Receptionist");
        System.out.println("4. Boss");
        int type = scanner.nextInt();

        if (employeeManagement.getEmployeeMap().containsKey(id)) {
            throw new RuntimeException("Employee id already exists");
        }

        Employee employee = null;
        switch (type) {
            case 1 -> {
                // Manager
                employee = new Manager(id, name);
            }
            case 2 -> {
                // Labor
                employee = new Labor(id, name);
            }
            case 3 -> {
                // Receptionist
                employee = new Receptionist(id, name);
            }
            case 4 -> {
                // Boss
                 employee = new Boss(id, name);
            }
            default -> throw new RuntimeException("Invalid type");
        }
        employeeManagement.addEmployee(employee);
        System.out.println("Employee added successfully" + employee.getId());
    }

    private static void configRoom() {
        System.out.println("Enter room id:");
        String id = scanner.next();

        System.out.println("Enter room name:");
        String name = scanner.next();

        if (hotel.getRoomMap().containsKey(id)) {
            throw new RuntimeException("Room id already exists");
        }

        Room room = new Room(id, name);
        hotel.getRoomMap().put(id, room);
        System.out.println("Room added successfully" + room.getId());
    }

    public static void printMenu(){
        System.out.println("1. Config room");
        System.out.println("2. Config employee");
        System.out.println("3. Assign room to employee");
        System.out.println("4. Get room by employee");
        System.out.println("5. Get salary");
        System.out.println("0. Exit");
        System.out.println("Choose an option:");
    }
}

