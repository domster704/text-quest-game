package ru.gisupov;

public class Story {
    private Situation startStory;
    private Situation mediumPartStory;
    private Situation endingStory;
    public Situation currentSituation;

    public Story() {
        startStory = new Situation("Начало",
                "Приветствуем игрок! В данной игре вам предстоит поиграть за президента РФ Путина и захватить" +
                        "целый мир.\n Как мы знаем, в нашем мире РФ ведёт обычно нейтральную внешнюю политику, а что" +
                        "выберете вы?\n" +
                        "1) Сохранить нейтралитет и стараться улучшить ситуацию в стране\n" +
                        "2) Признать США сверхдержавой и отдать все свои земли им" +
                        "3) ЗАХВАТИТЬ ВЕСЬ ЭТОТ ЧЁРТОВ КАПИТАЛИСТИЧЕСКИЙ МИР И РАСПРОСТРАНИТЬ КОММУНИЗМ" +
                        "4) Захвачу весь мир и объявлю Путина императором сего бренного мира",
                3, 0, 0, 0, 0);
        startStory.direction[0] = new Situation();
        startStory.direction[1] = new Situation();
        startStory.direction[2] = new Situation();
        startStory.direction[3] = new Situation();
    }
}
