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
    public int[] findTailExhaustive(boolean [][] board) {
        resetCounters();                                //reset counters before starting
        int neighbors = 0;                              //counter for neighbors
        int[] tailAndLength = new int[3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                exhastiveChecks ++;                  //increment exhaustiveChecks
                if (board[i][j] == true) {           //if part of the snake
                    if (i != headPosition[0] && j != headPosition[1]) {         //if not the head
                        FindNeighbors(i, j, board);          //check for neighbors
                        if (neighbors == 1) {                //if only 1 neighbor, mark as tail position
                            tailAndLength[0] = i;
                            tailAndLength[1] = j;
                        }else if(neighbors >=2){
                            
                        }
                    }
                    //2 or more neighbors, move to next cell
                    //count every piece of the snake
                    //return tail(x,y)
                }
            }
        }return tailAndLength;
    }

    public static int FindNeighbors(int i, int j, boolean[][] board){   //method to find neighbors of the current snake piece

    }


    public int[] findTailRecursive(){

    }

    private int[] findTailRecursive(int[] currentPosition, int[] previousPosition){

    }

    private void resetCounters(){               //resets exhaustiveChecks and recursiveChecks counter
        this.exhaustiveChecks = 0;
        this.recursiveChecks = 0;
    }

    //Getters////////////////////////////////////////////////////////////////////////////////////////
    private static int getRecursiveChecks(){    //gets the current state of the recursiveChecks counter
        return recursiveChecks;
    }

    private static int getExhaustiveChecks(){   //gets the current state of exhaustiveChecks counter
        return exhaustiveChecks;
    }
}
