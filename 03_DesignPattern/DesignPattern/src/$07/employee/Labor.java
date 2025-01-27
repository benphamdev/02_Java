package $07.employee;

import $07.hotel.Room;
import $07.management.Salary;

public class Labor extends Employee implements Salary {
    private static final int SALARY_RATE = 1;

    public Labor(String id, String name) {
        super(id, name);
    }

    @Override
    public int getSalary() {
        return getRooms().size() * SALARY_RATE;
    }

    public void cleanRoom(Room room) {
        System.out.println("Cleaning room" + room.getId());
    }
}
