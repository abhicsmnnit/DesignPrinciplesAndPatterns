package com.example.principles.isp.solution;

public class PostManagerForGuest implements IPostReader {
    @Override
    public void readPost() {
        System.out.println("Reading a post as a Guest...");
    }
}
