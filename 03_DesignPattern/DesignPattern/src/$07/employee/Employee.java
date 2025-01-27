package $07.employee;

import $07.hotel.Room;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private String name;

    private String id;

    private List<Room> rooms = new ArrayList<>();

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
