package com.gol;

public class Engine {
    
    public static void terminalExecution(int iterations, long temps) throws InterruptedException{
        Board b = new Board(18, 12);
        b.printBoard();
        b.setValue(3, 4, true);
        b.setValue(3, 5, true);
        b.setValue(3, 6, true);
        b.setValue(4, 3, true);
        b.setValue(4, 7, true);
        b.setValue(5, 3, true);
        b.setValue(5, 7, true);
        b.setValue(6, 4, true);
        b.setValue(6, 5, true);
        b.setValue(6, 6, true);

        b.setValue(11, 4, true);
        b.setValue(11, 5, true);
        b.setValue(11, 6, true);
        b.setValue(12, 3, true);
        b.setValue(12, 7, true);
        b.setValue(13, 3, true);
        b.setValue(13, 7, true);
        b.setValue(14, 4, true);
        b.setValue(14, 5, true);
        b.setValue(14, 6, true);

        for(int i=0; i<=iterations; i++){
            b.step();
            b.printBoard();
            Thread.sleep(temps);
        }
    }

}
