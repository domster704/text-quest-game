package ru.gisupov;

import java.util.*;

public class Game {
    public static Person putin;
    public static Story story;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        putin = new Person();
        story = new Story();

        while (true) {
            putin.M += story.currentSituation.dM;
            putin.RC += story.currentSituation.dRC;
            putin.RP += story.currentSituation.dRP;
            putin.TP += story.currentSituation.dTP;
            System.out.println("-------------\n" +
                    "Деньги: " + putin.M + " млрд $\n" +
                    "Репутация с странами: " + putin.RC + "\n" +
                    "Репутация у народа: " + putin.RP + "\n" +
                    "Территория: " + putin.TP + "%\n" +
                    "-------------");

            System.out.println("============ " + story.currentSituation.subject + " ============");
            System.out.print(story.currentSituation.text);

            if (putin.isEnd() || story.isEnd()) {
                break;
            }

            int num_scene = s.nextInt();
            while (!story.go(num_scene)) {
                num_scene = s.nextInt();
            }
        }
    }
}
