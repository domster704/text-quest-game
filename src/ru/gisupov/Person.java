package ru.gisupov;

public class Person {
    public int M; // деньги в миллиардах $
    public int RC; // отношения с другими странами (-200; 200)
    public int RP; // отношение с народом (-200; 200)
    public float TP; // территория страны относительно всего мира в процентах (0; 100)

    public Person() {
        this.M = 250;
        this.RC = 20;
        this.RP = -30;
        this.TP = 11.4f;
    }
}
