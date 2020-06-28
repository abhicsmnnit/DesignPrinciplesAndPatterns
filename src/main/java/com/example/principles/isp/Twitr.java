package com.example.principles.isp;

public class Twitr {
    public static void main(String[] args) {
        performPostOperations(new PostManagerForGuest());
        performPostOperations(new PostManagerForUser());
    }

    private static void performPostOperations(IPostManager postManager) {
        postManager.createPost();
        postManager.readPost();
    }
}
