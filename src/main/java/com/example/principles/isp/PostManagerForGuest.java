package com.example.principles.isp;

public class PostManagerForGuest implements IPostManager {
    @Override
    public void createPost() {
        System.out.println("Operation not allowed!");
    }

    @Override
    public void readPost() {
        System.out.println("Reading a post as a Guest...");
    }
}
