package com.gol;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        /**Board b = new Board(5, 5);
        b.printBoard();
        b.setValue(2, 1, true);
        b.setValue(2, 2, true);
        b.setValue(2, 3, true);
        System.out.println("-----");
        b.printBoard();
        b.step();
        System.out.println("-----");
        b.printBoard();**/

        try {
            Engine.terminalExecution(50, 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
