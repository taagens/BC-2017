package ee.helmes.bootcamp.dao;

import ee.helmes.bootcamp.model.Booking;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class BookingDaoImpl implements BookingDao {

    private static final Logger logger = LoggerFactory.getLogger(BookingDaoImpl.class);

    @Resource(name="localSessionFactoryBean")
    private SessionFactory sessionFactory;

    @Override
    public void addBooking(Booking booking) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(booking);
        logger.info("Booking record saved successfully");
    }

    @Override
    public List<Booking> getBookings() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Booking> bookingList = session.createCriteria(Booking.class).list();
        for (Booking booking : bookingList) {
            logger.info("Booking List::" + booking);
        }
        return bookingList;
    }

    @Override
    public Booking getBooking(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Booking booking = (Booking) session.load(Booking.class, id);
        logger.info("Booking loaded successfully, Booking details=" + booking);
        return booking;
    }

}
