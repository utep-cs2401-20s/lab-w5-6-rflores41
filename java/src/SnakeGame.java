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
        this.game = board;
        this.headPosition[0] = x;
        this.headPosition[1] = y;
    }
    //Methods for functions//////////////////////////////////////////////////////////////////////
    public int[] findTailExhaustive(boolean [][] board){
        for(int i =0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) { //increment exhaustiveChecks
                if (board[i][j] == true) {       //if part of the snake, look for neighbors, else go to next cell

                }                              //either at head or tail if 1 neighbor, check with headPosition
                //2 or more neighbors, move to next cell
                //count every piece of the snake
                //return tail(x,y)
            }
        }
        return  //return the tail x,y, and length of the snake in an int [] array
    }

    public int[] findTailRecursive(){

    }

    private int[] findTailRecursive(int[] currentPosition, int[] previousPosition){

    }

    private void resetCounters(){               //resets exhaustiveChecks and recursiveChecks counter

    }

    //Getters////////////////////////////////////////////////////////////////////////////////////////
    private static int getRecursiveChecks(){    //gets the current state of the recursiveChecks counter
        return recursiveChecks;
    }

    private static int getExhaustiveChecks(){   //gets the current state of exhaustiveChecks counter
        return exhaustiveChecks;
    }
    //test
}
