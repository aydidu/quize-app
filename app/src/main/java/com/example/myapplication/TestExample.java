package com.example.myapplication;

public class TestExample {
    private String question;
    private String varA;
    private String varB;
    private String varC;
    private String varD;
    private String answer;

    public TestExample(String question, String varA, String varB, String varC, String varD, String answer) {
        this.question = question;
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
        this.varD = varD;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getVarA() {
        return varA;
    }

    public String getVarB() {
        return varB;
    }

    public String getVarC() {
        return varC;
    }

    public String getVarD() {
        return varD;
    }

    public String getAnswer() {
        return answer;
    }
}
