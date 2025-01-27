package $07.employee;

import $07.management.Salary;

public class Manager extends Employee implements Salary {
    private static final int SALARY_RATE = 3;

    public Manager(String id, String name) {
        super(id, name);
    }

    @Override
    public int getSalary() {
        return getRooms().size() * SALARY_RATE;
    }

    public void manage() {
        System.out.println("Managing");
    }
}
