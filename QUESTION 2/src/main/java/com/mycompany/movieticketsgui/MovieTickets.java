/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movieticketsgui;

/**
 *
 * @author matthewsamuel
 */
public class MovieTickets implements IMovieTickets {

    // Calculate the total ticket price including 14% VAT
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) 
    {

        double subtotal = numberOfTickets * ticketPrice;

        double vat = subtotal * 0.14;

        double total = subtotal + vat;

        return total;
    }

    // Validate the movie ticket information
    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) 
    {

        if (movieTicketData.getMovieName() == null
                || movieTicketData.getMovieName().trim().isEmpty()) 
        {
            return false;
        }

        if (movieTicketData.getNumberOfTickets() <= 0) 
        {
            return false;
        }

        if (movieTicketData.getTicketPrice() <= 0) 
        {
            return false;
        }

        return true;
    }
    
}
