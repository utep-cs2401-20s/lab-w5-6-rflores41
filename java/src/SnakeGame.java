import java.lang.*;
public class SnakeGame {
    //elements////////////////////////////////////////////////////////////////////////////////////
    private boolean [][] game;          //stores final game state
    private int[] headPosition;         //stores location of snakes head
    private static int exhaustiveChecks;//number of positions checked using exhaustive search
    private static int recursiveChecks; //number of positions checked using recursive search

    //constructors///////////////////////////////////////////////////////////////////////////////
    //default to init an empty 1*1 game board
    public SnakeGame(){
        boolean [][] board = new boolean[1][1];
    }

    //a constructor that takes a 2-dimensional boolean array, and the x and y position of the snakes "head"
    public SnakeGame(boolean [][] board, int x, int y){
        //made a helper method to copy the board into the array
        helper(board);
        this.headPosition[0] = x;
        this.headPosition[1] = y;
    }

    //helper method//////////////////////////////////////////////////////////////////////////////
    public boolean [][] helper(boolean [][] board){
        for(int i =0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                this.game[i][j] = board[i][j];
            }
        }
        return game;
    }

    //Methods for function///////////////////////////////////////////////////////////////////////
    public int[] findTailExhaustive(boolean[][] board) {
        resetCounters();                                //reset counters before starting
        int neighbors = 0;                              //counter for neighbors
        int[] tailAndLength = new int[3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                exhaustiveChecks++;                  //increment exhaustiveChecks
                if (board[i][j]) {                   //if part of the snake
                    tailAndLength[2] += 1;           //count every part of the snake
                    if (i != headPosition[0] && j != headPosition[1]) {         //if not the head
                        //check for neighbors
                        if(board[i+1][j]) neighbors++;
                        if(board[i-1][j]) neighbors++;
                        if(board[i][j+1]) neighbors++;
                        if(board[i][j-1]) neighbors++;
                        if(board[i+1][j+1]) neighbors++;
                        if(board[i-1][j-1]) neighbors++;
                        if(board[i+1][j-1]) neighbors++;
                        if(board[i-1][j+1]) neighbors++;
                        else throw new IndexOutOfBoundsException();             //throw when out of bounds
                        if (1 == neighbors) {                //if only 1 neighbor, mark as tail position
                            tailAndLength[0] = i;
                            tailAndLength[1] = j;
                        }
                    }
                }
            }
        }
        return tailAndLength;
    }


    public int[] findTailRecursive(){
        resetCounters();
        int [] recursiveTailAndLength = new int[3];
        findTailRecursive(headPosition, headPosition);
        return recursiveTailAndLength;
    }

    private int[] findTailRecursive(int[] currentPosition, int[] previousPosition){
        //starting from the head, recursively follow the snake to its tail
        //fair warning this one confused me and I don't know how to fix it
        int [] recursiveTailAndLength = new int[3];
        for(int i = 0; i<currentPosition.length; i++) {
            if(currentPosition[recursiveChecks] == previousPosition[i]) {
                currentPosition[recursiveChecks] += 1;
            }else{
                previousPosition[i] = currentPosition[recursiveChecks];
            }
            recursiveChecks++;
            recursiveTailAndLength[2] += 1;
            recursiveTailAndLength[0] = currentPosition[i];
            recursiveTailAndLength[1] = previousPosition[i];
        }
        return recursiveTailAndLength;
    }

    private void resetCounters(){               //resets exhaustiveChecks and recursiveChecks counter
        exhaustiveChecks = 0;
        recursiveChecks = 0;
    }

    //Getters////////////////////////////////////////////////////////////////////////////////////////
    public static int getRecursiveChecks(){    //gets the current state of the recursiveChecks counter
        return recursiveChecks;
    }

    public static int getExhaustiveChecks(){   //gets the current state of exhaustiveChecks counter
        return exhaustiveChecks;
    }
}
