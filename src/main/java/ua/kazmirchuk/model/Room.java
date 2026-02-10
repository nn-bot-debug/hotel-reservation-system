package ua.kazmirchuk.model;

import java.math.BigDecimal;

public class Room {
    private Long id;
    private String roomNumber;
    private BigDecimal price;
    private RoomType type;
    private boolean isAvailable;

    public Room(Long id, String roomNumber, BigDecimal price, RoomType type) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.price = price;
        this.type = type;
        this.isAvailable = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room {id=" + id + ", number='" + roomNumber + "', type=" + type + ", price=" + price + "}";
    }
}
