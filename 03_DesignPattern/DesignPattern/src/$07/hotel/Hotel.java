package $07.hotel;

import java.util.HashMap;

public class Hotel {
    private String name;

    private HashMap<String, Room> roomMap;

    public Hotel(String name) {
        this.name = name;
        this.roomMap = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Room> getRoomMap() {
        return roomMap;
    }

    public void setRoomMap(HashMap<String, Room> roomMap) {
        this.roomMap = roomMap;
    }
}
