package com.example.principles.isp.solution;

public class Twitr {
    public static void main(String[] args) {
        handleReads(new PostManagerForGuest());
        handleReads(new PostManagerForUser());

        handleCreates(new PostManagerForUser());
    }

    private static void handleReads(IPostReader reader) {
        reader.readPost();
    }

    private static void handleCreates(IPostCreator creator) {
        creator.createPost();
    }
}
