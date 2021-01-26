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

    public boolean isEnd() {
        if (this.TP >= 100) {
            System.out.println("Вы захватили весь мир! Вы победили!");
            return true;
        }
        else if (this.TP <= 0) {
            System.out.println("Вы потеряли все земли! Вы проиграли!");
            return true;
        }
        else if (this.RC <= -200) {
            System.out.println("Весь мир объявил вам войну! Вы не сможете в ней победить! Вы проиграли!");
            return true;
        }
        else if (this.RP <= -200) {
            System.out.println("Народ взбунтовался! Теперь вам придётся сосредоточится на внутренней политике.\n" +
                    "Вы не сможете продолжить захватывать мир! Вы проиграли");
            return true;
        }
        else if (this.M < -100) {
            System.out.println("У вас слишком много долгов! Вы не можете больше поддерживать армию и дипломатов для захвата мира.\n" +
                    "Вы проиграли!");
        }
        return false;
    }
}
