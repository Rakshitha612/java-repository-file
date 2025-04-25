package com.rapido.model;
import java.time.LocalDateTime;

    public class Booking {
        private int bookingId;
        private User user;
        private Driver driver;
        private String source;
        private String destination;
        private LocalDateTime time;

        public Booking(int bookingId, User user, Driver driver, String source, String destination, LocalDateTime time) {
            this.bookingId = bookingId;
            this.user = user;
            this.driver = driver;
            this.source = source;
            this.destination = destination;
            this.time = time;
        }

        // Getters and Setters
    }

