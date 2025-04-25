package com.rapido.service;
import com.rapido.model.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

    public class BookingService {
        private List<Booking> bookings = new ArrayList<>();
        private List<Driver> drivers = new ArrayList<>();

        public BookingService() {
            // Sample drivers
            drivers.add(new Driver(1, "John", true));
            drivers.add(new Driver(2, "Ali", true));
        }

        public Booking bookRide(User user, String source, String destination) {
            for (Driver driver : drivers) {
                if (driver.isAvailable()) {
                    driver.setAvailable(false); // Driver becomes busy
                    Booking booking = new Booking(bookings.size() + 1, user, driver, source, destination, LocalDateTime.now());
                    bookings.add(booking);
                    return booking;
                }
            }
            return null; // No drivers available
        }

        public List<Booking> getAllBookings() {
            return bookings;
        }
    }

