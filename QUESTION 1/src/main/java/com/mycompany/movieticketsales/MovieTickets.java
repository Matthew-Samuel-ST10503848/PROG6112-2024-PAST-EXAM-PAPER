/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movieticketsales;

/**
 *
 * @author matthewsamuel
 */
public class MovieTickets implements IMovieTickets {
    
    //Calculate total sales for one movie
    @Override
    public int TotalMovieSales(int[] movieTicketSales)
    {
        int total = 0;
        
        for (int r = 0; r < movieTicketSales.length; r++)
        {
            total = total + movieTicketSales[r];
        }
        
        return total;
    }
    
    //Find the movie with the highest total sales 
    @Override
    public String TopMovie(String [] movies, int [] totalSales)
    {
        int highest = 0;
        
        for (int r = 1; r < totalSales.length; r++)
        {
            if (totalSales[r] > totalSales[highest])
            {
                highest = r;
            }
        }
        
        return movies[highest];
    }
    
}
