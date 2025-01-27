package $07.employee;

import $07.hotel.Room;
import $07.management.Assigment;

import java.util.HashMap;

public class EmployeeManagement implements Assigment {
    private HashMap<String, Employee> employeeMap = new HashMap<>();

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    public HashMap<String, Employee> getEmployeeMap() {
        return employeeMap;
    }

    @Override
    public void assignRoomToEmployee(String employeeId, Room room) {
        Employee employee = employeeMap.get(employeeId);
        if (employee == null)
            throw new RuntimeException("Employee id does not exist");

        employee.getRooms().add(room);
    }
}
