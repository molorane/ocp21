package com.blessing.test;

public class Swtchinng {

    public static void main(String[] args) {
        final var score1 = 8;
        final var score2 = 3;
        char myScore = 7;
        switch (myScore) {
            default:
            case score1:
            case '2':
            case 6:
                System.out.print("great-");
            case 4:
                System.out.print("good-");
                break;
            case score2:
            case 1:
                System.out.print("not good-");
        }
    }

}
