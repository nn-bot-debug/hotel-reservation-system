package ua.kazmirchuk.repository;

import ua.kazmirchuk.model.Room;

import java.util.List;

public interface RoomRepository {
    void save(Room room);
    void update(Room room);
    void delete(Room room);
    Room findById(Long id);
    List<Room> findAll();
}
