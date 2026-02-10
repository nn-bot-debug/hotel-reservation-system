package ua.kazmirchuk.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Booking {
    private Long id;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private BigDecimal totalPrice;
    private Customer customer;
    private Room room;

    public Booking(Long id, LocalDate checkIn, LocalDate checkOut, BigDecimal totalPrice, Customer customer, Room room) {
        this.id = id;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.totalPrice = totalPrice;
        this.customer = customer;
        this.room = room;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Booking {" +
                "id=" + id +
                ", guest=" + customer.getFirstName() + " " + customer.getLastName() +
                ", room=" + room.getRoomNumber() +
                ", dates=" + checkIn + " -> " + checkOut +
                ", total=" + totalPrice +
                '}';
    }
}
