package ee.helmes.bootcamp.dao;

import java.util.List;

import ee.helmes.bootcamp.model.Booking;

public interface BookingDao {

	void addBooking(Booking booking);
	List<Booking> getBookings();
	Booking getBooking(Long id);
}
