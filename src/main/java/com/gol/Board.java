package com.gol;

public class Board {
    private Case[][] board;
    private int width;
    private int height;
    

    public Board(int i, int j) {
        this.board = new Case[i][j];
        this.width = i;
        this.height = j;
        for(int k=0; k<width; k++){
            for(int l=0; l<height; l++){
                this.board[k][l] = new Case();
            }
        }
    }


    public Case[][] getBoard() {
        return this.board;
    }

    public void setBoard(int i, int j) {
        this.board = new Case[i][j];
        this.width = i;
        this.height = j;
    }

    public void setBoard(Case[][] board) {
        this.board = board;
    }

    public void setValue(int i, int j, boolean active) {
        this.board[i][j].setActive(active);
    }

    public boolean getValue(int i, int j ) {
        return this.board[i][j].getActive();
    }

    public void printBoard(){
        System.out.println("-----");
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                this.board[i][j].print();
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("-----");
    }

    /**
     * On avance d'une étape dans Game Of Life
     */
    public void step(){
        //Initialisation du nouveau tableau
        Case[][] newBoard = new Case[width][height];
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                newBoard[i][j] = new Case(this.getValue(i,j));
            }
        }


        //Parcours de toutes les cases du tableau courant
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                
                //On compte les voisins de la case courante
                int voisins = 0; 
                for(int k = -1; k<=1; k++){
                    for(int l = -1; l<=1; l++){
                        if(i+k >= 0 && i+k < width && j+l >= 0 && j+l < height && !(k==0 && l==0)){
                            if(board[i+k][j+l].isActive())
                                voisins++;
                        }
                    }
                }

                //Selon le nombre de voisins on définit l'état de la case pour le prochain step du tableau
                switch(voisins){
                    case 2:
                        break;
                        
                    case 3:
                        newBoard[i][j].setActive(true);
                        break;

                    default:
                        newBoard[i][j].setActive(false);
                }

            }
        }
        board = newBoard;
    }

    


}
