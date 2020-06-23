package com.example.principles.isp;

public class PostManagerForUser implements IPostManager {
    @Override
    public void createPost() {
        System.out.println("Creating a brand new post...");
    }

    @Override
    public void readPost() {
        System.out.println("Reading post as a logged-in User...");
    }
}
