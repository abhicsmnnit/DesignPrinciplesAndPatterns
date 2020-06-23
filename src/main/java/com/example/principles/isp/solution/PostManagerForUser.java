package com.example.principles.isp.solution;

public class PostManagerForUser implements IPostCreator, IPostReader {
    @Override
    public void createPost() {
        System.out.println("Creating a brand new post...");
    }

    @Override
    public void readPost() {
        System.out.println("Reading a post as a logged-in User...");
    }
}
