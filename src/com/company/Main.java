package com.company;
import java.util.Scanner;
//import com.company.HangmanCanvas;

public class Main {
    private static String lexicon() {//todo add background
        String[] list = {"FERRARI", "EPIGLOTTIS", "MOON","MOCKINGBIRD","ADVERTISEMENT","AUTOMATIC","MOUNTAIN","ANDROID","WINDOW"};// todo expand the list
        int x = (int) (Math.random() * list.length);
        return list[x];
    }

    public static void main(String[] args) {
//        HangmanCanvas hh = new HangmanCanvas();
//        hh.stickman();
        Scanner reader = new Scanner(System.in);
        char c;
        boolean flag;
        boolean won = false;
        int guesses = 8;
        String word = lexicon(); // calling the lexicon for a random word
        System.out.println("Welcome to Hangman !!, guess the word or you die.......");
        StringBuilder state = new StringBuilder(word.replaceAll("[A-Z]", "-"));
        System.out.println("\n" + state+"\nYou have 8 guesses");
        while (guesses > 0) {
            System.out.print("\nGuess the letter :");
            c = reader.next().toUpperCase().charAt(0);
            flag = false;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == c) {
                    state.setCharAt(j, c);
                    flag = true;
                }
            }
            if (!flag) {
                guesses--;
                System.out.println("\nSorry! there is no " + c + "'s in the word. You have " + guesses + " guesses left.");
                continue;
            }
            System.out.println("\n" + state);
            if ((word.contentEquals(state))) {
                won = true;
                break;
            }
        }
        if (won) {
            System.out.println("\nCongrats you won !!!!!!!");
        } else {
            System.out.println("\nThe hangman died !! the word was "+word);
        }
    }
}
