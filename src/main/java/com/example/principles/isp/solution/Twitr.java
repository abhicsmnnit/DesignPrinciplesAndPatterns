package com.example.principles.isp.solution;

public class Twitr {
    public static void main(String[] args) {
        readPost(new PostManagerForGuest());
        readPost(new PostManagerForUser());

        createPost(new PostManagerForUser());
    }

    private static void readPost(IPostReader reader) {
        reader.readPost();
    }

    private static void createPost(IPostCreator creator) {
        creator.createPost();
    }
}
