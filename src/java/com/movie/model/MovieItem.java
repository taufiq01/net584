/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movie.model;
import java.io.Serializable;

/**
 *
 * @author User
 */
public class MovieItem {
    private String title;
    private String year;
    private String genre;

    // Constructor with parameters to initialize the fields
    public MovieItem(String title, String year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Getter method for year
    public String getYear() {
        return year;
    }

    // Getter method for genre
    public String getGenre() {
        return genre;
    }
}

