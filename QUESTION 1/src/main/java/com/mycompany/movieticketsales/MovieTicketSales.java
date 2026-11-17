/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movieticketsales;

/**
 *
 * @author matthewsamuel
 */
public class MovieTicketSales {

    public static void main(String[] args) {
        
        //Store the movie names in a 1D array
        String[] movies = {"Napolean", "Oppenheimer"};
        
        //Store the ticket sales for each movie in a 2D array
        int[][] ticketSales = { {3000, 1500, 1700}, {3500, 1200, 1600} };
        
        //Create an object of the MovieTickets class so you can call the methods
        MovieTickets movieTickets = new MovieTickets();
        
        //Store the total sales for each movie using a 1D array
        int[] totalSales = new int[movies.length];
        
        //Display the report heading
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("--------------------------------");
        
        //Display the column headings
        System.out.println("Movie\t\tJanuary\tFebruary\tMarch\tTotal Sales");
        
        
        //Display each movie's monthly sales
        for (int r = 0; r < ticketSales.length; r++)
        {
             System.out.printf("%-15s", movies[r]);
             
             for (int c = 0; c < ticketSales[r].length; c++)
             {
                  System.out.printf("%-12d", ticketSales[r][c]);
             }
             
             //Calculate the total sales for this movie
             totalSales[r] = movieTickets.TotalMovieSales(ticketSales[r]);
             
              System.out.println(totalSales[r]);
        }
        
        //Find the top performing movie
        String topMovie = movieTickets.TopMovie(movies, totalSales);
        
        System.out.println("---------------------------------");
        System.out.println("Top Performing Movie: " + topMovie);
    }
}
