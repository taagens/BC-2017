package ee.helmes.bootcamp.controller;

import ee.helmes.bootcamp.model.Booking;
import ee.helmes.bootcamp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private BookingService bookingService;

    @RequestMapping("/")
    public String main() {
        return "redirect:/bookings";
    }

    @RequestMapping(value = "bookings", method = RequestMethod.GET)
    public String bookings(Model model) {
        List<Booking> bookingList = bookingService.getBookings();
        model.addAttribute("bookings", bookingList);
        return "bookings";
    }

    @RequestMapping(value = "booking/create", method = RequestMethod.GET)
    public String createBooking(Model model) {
        model.addAttribute("booking", new Booking());
        return "newBooking";
    }

    @RequestMapping(value = "booking/create", method = RequestMethod.POST)
    public String createBookingAction(Booking booking) {
        bookingService.addBooking(booking);
        return "redirect:/bookings";
    }

}
