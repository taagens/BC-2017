package ee.helmes.bootcamp.service;

import ee.helmes.bootcamp.dao.BookingDao;
import ee.helmes.bootcamp.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingDao bookingDao;

    @Override
    @Transactional
    public void addBooking(Booking booking) {
        bookingDao.addBooking(booking);
    }

    @Override
    @Transactional
    public List<Booking> getBookings() {
        return bookingDao.getBookings();
    }

    @Override
    @Transactional
    public Booking getBooking(Long id) {
        return bookingDao.getBooking(id);
    }
}
