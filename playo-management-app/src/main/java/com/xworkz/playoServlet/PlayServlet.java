package com.xworkz.playoServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

    @WebServlet("/ValidatePlayo")
    class PlayoServlet extends HttpServlet {

        public PlayoServlet() {
            System.out.println("PlayoServlet created now it can handle the request and response");
        }

        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse resp) {
            System.out.println("doGet method invoked");
            // Add any GET request handling code if needed
        }

        @Override
        public void doPost(HttpServletRequest req, HttpServletResponse resp) {
            System.out.println("doPost method invoked");

            // Retrieving user input from the request
            String playerName = req.getParameter("playername");
            String email = req.getParameter("email");
            String contactNumber = req.getParameter("contactnumber");
            String sport = req.getParameter("sport");
            String costPerHead = req.getParameter("costperhead");
            String numberOfPeopleStr = req.getParameter("numberofpeople");

            // Parsing costPerHead and numberOfPeople to calculate total cost
            double costPerHeadValue = Double.parseDouble(costPerHead);
            int numberOfPeople = Integer.parseInt(numberOfPeopleStr);
            double totalCost = costPerHeadValue * numberOfPeople;

            // Printing to the console for debugging
            System.out.println("Player Name is: " + playerName);
            System.out.println("Email ID is: " + email);
            System.out.println("Contact Number is: " + contactNumber);
            System.out.println("Sport is: " + sport);
            System.out.println("Cost per Head is: " + costPerHead);
            System.out.println("Number of People is: " + numberOfPeople);
            System.out.println("Total Cost is: " + totalCost);

            // Sending the response back to the browser
            PrintWriter writer = null;
            try {
                writer = resp.getWriter();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            resp.setContentType("text/html");

            writer.print("<html>");
            writer.print("<head>");
            writer.print("<title>" + "Playo Management App - Player Details" + "</title>");
            writer.print("</head>");
            writer.print("<body>");
            writer.print("<h1>" + "Entered Player Details:" + "</h1>");
            writer.print("<h2>" + "Player Name: " + playerName + "</h2>");
            writer.print("<h2>" + "Email ID: " + email + "</h2>");
            writer.print("<h2>" + "Contact Number: " + contactNumber + "</h2>");
            writer.print("<h2>" + "Sport: " + sport + "</h2>");
            writer.print("<h2>" + "Cost per Head: " + costPerHead + "</h2>");
            writer.print("<h2>" + "Number of People: " + numberOfPeople + "</h2>");
            writer.print("<h2>" + "Total Cost: " + totalCost + "</h2>");
            writer.print("</body>");
            writer.print("</html>");
        }
    }

