package ru.gisupov;

public class Story {
    private Situation startStory;
    private Situation mediumPartStory;
    private Situation endingSituation;
    public Situation currentSituation;
    private int chapterQuest = 0; // если chapterQuest четное, то это новая глава, если нет, то это ответ на вопрос этой главы
//    private Situation[] listOfChapter = new Situation[]{startStory, mediumPartStory, endingSituation}; // пока не используется

    public Story() {
        startStory = new Situation("Начало",
                "Приветствуем игрок! В данной игре вам предстоит поиграть за президента РФ Путина и захватить" +
                        "целый мир.\nКак мы знаем, в нашем мире РФ ведёт обычно нейтральную внешнюю политику, а что" +
                        "выберете вы?\n" +
                        "1) Сохранить нейтралитет и стараться улучшить ситуацию в стране\n" +
                        "2) Признать США сверхдержавой и отдать все свои земли им\n" +
                        "3) ЗАХВАТИТЬ ВЕСЬ ЭТОТ ЧЁРТОВ КАПИТАЛИСТИЧЕСКИЙ МИР И РАСПРОСТРАНИТЬ КОММУНИЗМ\n" +
                        "4) Захвачу весь мир и объявлю Путина императором сего бренного мира\n",
                4, 0, 0, 0, 0, true);
        startStory.direction[0] = new Situation("Хороший выбор, но не для этой игры",
                "Вы проиграли, игра же называется «Путинизация», то есть надо захватить мир",
                0, 0, -200, 100, 0, false);
        startStory.direction[1] = new Situation("США - сверхдержава!",
                "Возможно, это было неплохое решение, но народу оно не понравилось. Тем более вы потеряли все земли.",
                0, 0, 100, -1000, -1000, false);
        startStory.direction[2] = new Situation("Коммунизм всему голова!",
                "Пойти по пути отца Росии? Давайте не будем повторять эти ошибки, а то народ взбунтуется.",
                0, 0, -20, -1000, 0, false);
        startStory.direction[3] = new Situation("Путинизация",
                "А что, звучит неплохо! Давайте так и сделаем!\n" +
                        "1) Продолжить\n",
                1, 0, 0, 10, 0, true);
        this.currentSituation = startStory;
    }

    public void MediumPartStory() {
        mediumPartStory = new Situation("Первое дипломатическое задание",
                "Беларусь предлгает создать надгосударство совместно с нашей страной. Согласимся?\n" +
                        "1) Конечно, мы же братья\n" +
                        "2) Мы разные народы, мы отказываемся\n",
                2, 0, 0, 0, 0, true);
        mediumPartStory.direction[0] = new Situation("Надгосударство",
                "Это первый шаг на пути создания Империи Путина!\n" +
                "1) Продолжить (пока не нажимайте, так как просто будет повторение, я ещё не сделал продолжение)",
                1, 100, -5, 60, 2, true);
        mediumPartStory.direction[1] = new Situation("Странный выбор",
                "Зачем ты это сделал? Совсем дурной?\n",
                0, 0, 5, -100, 0, false);

        this.currentSituation = mediumPartStory;
    }

    public boolean go(int num_scene) {
        if (num_scene <= currentSituation.direction.length && num_scene >= 0) {
            if (currentSituation.hasContinued)
                this.chapterQuest++;
            currentSituation = currentSituation.direction[num_scene - 1];
            if (this.chapterQuest % 2 == 0) {
                MediumPartStory();
            }
            return true;
        } else {
            System.out.println("Вы ввели недопустимый вариант! Вы можете выбрать из " + currentSituation.direction.length +
                    " вариантов");
            return false;
        }
    }

    public boolean isEnd() {
        return currentSituation.direction.length == 0;
    }
}
