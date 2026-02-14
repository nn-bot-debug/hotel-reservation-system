package ua.kazmirchuk.repository;

import ua.kazmirchuk.model.Booking;

import java.util.List;

public interface BookingRepository {
    void save(Booking booking);
    void update(Booking booking);
    void delete(Booking booking);
    Booking findById(Long id);
    List<Booking> findAll();
}
