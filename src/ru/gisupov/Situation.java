package ru.gisupov;

public class Situation {
    public int dM, dRC, dRP;
    public float dTP;
    public Situation[] direction;
    public String text;
    public String subject;
    public int variants;
    public boolean hasContinued;

    public Situation(String subject, String text, int variants,  int dM, int dRC, int dRP, float dTP, boolean hasContinued) {
        this.subject = subject;
        this.text = text;
        this.dM = dM;
        this.dRC = dRC;
        this.dRP = dRP;
        this.dTP = dTP;
        this.variants = variants;
        this.hasContinued = hasContinued;

        this.direction = new Situation[this.variants];
    }
}
