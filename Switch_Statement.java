package co.develhope.introduction._9;

import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
            System.out.print("Inserisci un numero compreso tra 1 e 10: ");

            while (!scanner.hasNextInt()) { // restituisce true se il numero inserito è intero, altrimenti false
                                            // hasNextInt è un metodo di scanner e restituisce true se l'inserimento successivo è intero
                System.out.println("Input non valido. Devi inserire un numero.");
                System.out.print("Inserisci un numero compreso tra 1 e 10: ");
                scanner.next(); // legge e scarta l'input dato dall'utente, in modo da dare la possibiità all'ìutente di fornire un nuovo input corretto
            }
            input = scanner.nextInt(); //assegno a input quello che ho digitato da tastiera se è un numero intero

        switch (input) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default :
                System.out.println("Cannot give you the name");
        }

        scanner.close();
    }
}