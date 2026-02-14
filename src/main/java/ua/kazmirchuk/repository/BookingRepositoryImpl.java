package ua.kazmirchuk.repository;

import ua.kazmirchuk.model.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepository{

    private final List<Booking> bookings = new ArrayList<>();
    private Long currentId = 1L;

    @Override
    public void save(Booking booking) {
        booking.setId(currentId);
        currentId +=1L;
        bookings.add(booking);
    }

    @Override
    public void update(Booking booking) {
        Booking existingBooking = findById(booking.getId());
        if(existingBooking != null) {
            existingBooking.setCheckIn(booking.getCheckIn());
            existingBooking.setCheckOut(booking.getCheckOut());
            existingBooking.setTotalPrice(booking.getTotalPrice());
            existingBooking.setCustomer(booking.getCustomer());
            existingBooking.setRoom(booking.getRoom());
        }
    }

    @Override
    public void delete(Booking booking) {
        bookings.removeIf(booking1 -> booking1.getId().equals(booking.getId()));
    }

    @Override
    public Booking findById(Long id) {
        return bookings.stream().filter(booking -> id.equals(booking.getId())).findFirst().orElse(null);
    }

    @Override
    public List<Booking> findAll() {
        return bookings;
    }
}
