package com.example.springboot;

public class BlogEntry {
    private String author;
    private String message;

    public String getAuthor() { return this.author; }
    public void setAuthor( String name ) { this.author = name; }

    public String getMessage() { return this.message; } 
    public void setMessage( String post ) { this.message = post; }
}