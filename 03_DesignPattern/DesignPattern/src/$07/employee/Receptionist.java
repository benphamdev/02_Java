package $07.employee;

import $07.management.Salary;

public class Receptionist extends Employee implements Salary {
    private static final int SALARY_RATE = 2;

    public Receptionist(String id, String name) {
        super(id, name);
    }

    @Override
    public int getSalary() {
        return getRooms().size() * SALARY_RATE;
    }

    public void checkIn() {
        System.out.println("Checking in");
    }
}
