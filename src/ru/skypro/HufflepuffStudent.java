package ru.skypro;

public class HufflepuffStudent extends HogwartsStudent {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magic, transgression);
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int ability() {
        return industriousness + loyalty + honesty;
    }

    public void compareHufflepuff(HufflepuffStudent hufflepuffStudent) {
        int ability1 = ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент Пуффендуй %s лучше студента %s%n", getName(), hufflepuffStudent.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Студент Пуффендуй %s лучше студента %s%n", hufflepuffStudent.getName(), getName());
        } else {
            System.out.printf("Студент Пуффендуй %s такой же, как %s%n", hufflepuffStudent.getName(), getName());
        }
    }
    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; верность: %d; честность: %d", super.toString(), industriousness, loyalty, honesty);
    }
}
