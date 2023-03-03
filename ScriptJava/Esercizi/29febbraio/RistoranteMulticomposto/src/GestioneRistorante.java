import java.util.ArrayList;
import java.util.Scanner;

public class GestioneRistorante {

    private static Scanner intScanner = new Scanner(System.in);

    public static int avviaRistorante() {
        ArrayList<Pietanza> listaPietanze = new ArrayList<Pietanza>();

        String[] ingredienti1 = {"patate","salsiccia"};
        listaPietanze.add(new Pietanza("Pizza patate e salsiccia",8, ingredienti1 ));
        String[] ingredienti2 = {"pomodoro","mozzarella"};
        listaPietanze.add(new Pietanza("Pizza rossa",8, ingredienti2 ));

        Ristorante ristorante = new Ristorante(listaPietanze);

        showFirstMenu(ristorante);

        return ristorante.getContoAperto();

    }

    public static void showFirstMenu(Ristorante ristorante) {
        boolean exit = false;

        while(!exit) {

            System.out.print("1) Ordina\n2) LogOut\n\nInserisci un numero: ");
            int input = intScanner.nextInt();

            switch (input) {
                case 1: {
                    showOrderMenu(ristorante);
                    break;
                }
                case 2:
                    exit=true;
                    System.out.println(input);
                    break;
            }

        }
        System.out.println("Il Totale è : "+ ristorante.getContoAperto());

    }

    public static void showOrderMenu(Ristorante ristorante) {

        boolean exitOrderMenu = false;

        int inputOrder;
        int input;

        while(!exitOrderMenu) {

            System.out.print("1) Ordina\n2) Visualizza \n3) Esci\n\nInserisci un numero: ");
            inputOrder = intScanner.nextInt();

            switch (inputOrder) {

                case 1:
                    System.out.println(ristorante.toString());
                    System.out.println("\nOrdina un piatto inserendo un numero: ");
                    input = intScanner.nextInt();
                    ristorante.ordina(input);
                    break;
                case 2:
                    System.out.println(ristorante.toString());
                    System.out.println("\nVisualizza un piatto inserendo un numero: ");
                    input = intScanner.nextInt();
                    ristorante.visualizza(input);
                    break;
                case 3:
                    exitOrderMenu=true;
                    break;
            }
        }

    }


}