package game.view;

public class ConsoleCleaner {

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
