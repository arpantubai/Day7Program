package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe5 {

    public static void main(String[] args) {
        System.out.println("Welcome to this program");

        char[] ch = new char[10];
        TicTacToe5 t1 = new TicTacToe5();
        t1.uc1(ch);

        char choice = t1.uc2();
        char choices1, choices2;

        if (choice == 'X') {
            System.out.println("Player chooses X and computer O");
            choices1 = choice;
            choices2 = 'O';
        } else {
            System.out.println("Player chooses O and computer chooses X");
            choices1 = choice;
            choices2 = 'X';
        }

        t1.showBoard(choice, ch);

    }

    static Scanner sc = new Scanner(System.in);

    void uc1(char[] ch) {
        for (int i = 1; i < 10; i++) {
            ch[i] = ' ';
        }
    }

    char uc2() {
        System.out.print("Enter X or O : ");

        return sc.next().charAt(0);
    }

    void showBoard(char choice, char ch[]) {
        System.out.print("Enter desired position in the board : ");
        int position = sc.nextInt();

        if (ch[position] != ' ')
            System.out.println("input choice is already occupied");
        else {
            ch[position] = choice;
            System.out.print(" " + ch[1] + " | " + ch[2] + " | " + ch[3] + " \n-----------\n " + ch[4] + " | " + ch[5] + " | " + ch[6] + " \n-----------\n " + ch[7] + " | " + ch[8] + " | " + ch[9] + " ");
        }
    }

}