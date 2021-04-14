package com.example.myapplication;

import java.util.ArrayList;

public class PhysicsTest {
    private ArrayList<TestExample> tests;

    public PhysicsTest() {
        tests = new ArrayList<>();
    }

    public ArrayList<TestExample> getTests() {
        return tests;
    }

    private void createTest(){
        tests.add(new TestExample(
                "question 1",
                "var A",
                "var B",
                "var C",
                "var D",
                "A"
        ));
        tests.add(new TestExample(
                "question 2",
                "var A",
                "var B",
                "var C",
                "var D",
                "A"
        ));
        tests.add(new TestExample(
                "question 3",
                "var A",
                "var B",
                "var C",
                "var D",
                "A"
        ));
        tests.add(new TestExample(
                "question 4",
                "var A",
                "var B",
                "var C",
                "var D",
                "A"
        ));
        tests.add(new TestExample(
                "question 5",
                "var A",
                "var B",
                "var C",
                "var D",
                "A"
        ));
    }
}
