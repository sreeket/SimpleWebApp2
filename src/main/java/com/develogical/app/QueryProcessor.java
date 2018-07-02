package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("ape")) {
            return "This is a software engineering module to understand agile engineering practices.";
        }
        return "";
    }
}
