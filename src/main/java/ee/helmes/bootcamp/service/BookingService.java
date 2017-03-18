package ee.helmes.bootcamp.service;

import ee.helmes.bootcamp.model.Booking;

import java.util.List;

public interface BookingService {
    void addBooking(Booking booking);
    List<Booking> getBookings();
    Booking getBooking(Long id);
}
