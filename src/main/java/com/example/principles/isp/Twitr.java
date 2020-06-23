package com.example.principles.isp;

public class Twitr {
    public static void main(String[] args) {
        handleOperations(new PostManagerForGuest());
        handleOperations(new PostManagerForUser());
    }

    private static void handleOperations(IPostManager postManager) {
        postManager.createPost();
        postManager.readPost();
    }
}
