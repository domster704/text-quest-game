package ru.gisupov;

public class Situation {
    public int dM, dRC, dRP;
    public float dTP;
    public Situation[] direction;
    private String text;
    private String subject;

    public Situation(String subject, String text, int variants,  int dM, int dRC, int dRP, float dTP) {
        this.subject = subject;
        this.text = text;
        this.dM = dM;
        this.dRC = dRC;
        this.dRP = dRP;
        this.dTP = dTP;

        this.direction = new Situation[variants];
    }
}
