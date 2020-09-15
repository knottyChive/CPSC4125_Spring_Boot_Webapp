package com.example.springboot;

public class BlogEntry {
    private String author;
    private String blogPost;

    public String getAuthor() { return this.author; }
    public void setAuthor( String name ) { this.author = name; }

    public String getBlogPost() { return this.blogPost; } 
    public void setBlogPost( String post ) { this.blogPost = post; }
}