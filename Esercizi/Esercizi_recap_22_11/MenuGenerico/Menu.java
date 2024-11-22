package Esercizi_recap_22_11.MenuGenerico;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<IMenuHandler> handlers = new ArrayList<>();
    private Scanner choiceScanner = new Scanner(System.in);
    private static Menu singletonInstance = null;
    private Menu(){

    }
    public static Menu getInstance(){
        if(singletonInstance == null)
            singletonInstance = new Menu();
        return singletonInstance;
    }

    private void printMenu(){
        int handlerIndex = 0;
        for (IMenuHandler handler : handlers) {
            System.out.println("Press "+handlerIndex+" to "+handler.printInfo());
            handlerIndex++;
        }
        System.out.println("Press "+handlerIndex+" to exit");
    }

    public void handleRequest(){
        boolean running = true;
        while (running) {
            this.printMenu();
            System.out.print(">>");
            int choice = choiceScanner.nextInt();
            if (choice < handlers.size()) {
                handlers.get(choice).handle();
            }
            else running = false;
            
        }
    }

    public void addHandler(IMenuHandler handler){
        handlers.add(handler);
    }
}
