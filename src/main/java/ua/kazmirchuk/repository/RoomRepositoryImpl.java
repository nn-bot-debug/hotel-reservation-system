package ua.kazmirchuk.repository;

import ua.kazmirchuk.model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomRepositoryImpl implements RoomRepository{

    private final List<Room> rooms = new ArrayList<>();
    private Long currentId = 1L;

    @Override
    public void save(Room room) {
        room.setId(currentId);
        currentId+=1L;
        rooms.add(room);
    }

    @Override
    public void update(Room room) {
        Room existingRoom = findById(room.getId());
        if(existingRoom != null ) {
            existingRoom.setRoomNumber(room.getRoomNumber());
            existingRoom.setPrice(room.getPrice());
            existingRoom.setType(room.getType());
            existingRoom.setAvailable(room.isAvailable());
        }
    }

    @Override
    public void delete(Room room) {
        rooms.removeIf(room1 -> room1.getId().equals(room.getId()));
    }

    @Override
    public Room findById(Long id) {
        return rooms.stream().filter(room -> id.equals(room.getId())).findFirst().orElse(null);
    }

    @Override
    public List<Room> findAll() {
        return rooms;
    }
}
