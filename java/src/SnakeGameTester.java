public class SnakeGameTester {
    //5 test cases for findTailExhaustive//////////////////////////////////////
    public static void main(String[] args) {
        int test1head = 0;              //all test heads are the x and y for the head position
        int test1head2 = 0;
        new SnakeGame(Test1(), test1head , test1head2);
        ///////////////////////////////////////////////
        int test2head = 2;
        int test2head2 = 1;
        new SnakeGame(Test2(), test2head, test2head2);
        //////////////////////////////////////////////
        int test3head = 7;
        int test3head2 = 0;
        new SnakeGame(Test3(), test3head, test3head2);
        //////////////////////////////////////////////
        int test4head = 0;
        int test4head2 = 0;
        new SnakeGame(Test4(), test4head, test4head2);
        //////////////////////////////////////////////
        int test5head = 9;
        int test5head2 = 9;
        new SnakeGame(Test5(), test5head, test5head2);
        //////////////////////////////////////////////
        int test6head = 2;
        int test6head2 = 0;
        new SnakeGame(Test6(), test6head, test6head2);
        //////////////////////////////////////////////
        int test7head = 0;
        int test7head2 = 2;
        new SnakeGame(Test7(), test7head, test7head2);
        //////////////////////////////////////////////
        int test8head = 0;
        int test8head2 = 0;
        new SnakeGame(Test8(), test8head, test8head2);
        //////////////////////////////////////////////
        int test9head = 0;
        int test9head2 = 0;
        new SnakeGame(Test9(), test9head, test9head2);
        //////////////////////////////////////////////
        int test10head = 0;
        int test10head2 = 9;
        new SnakeGame(Test10(), test10head, test10head2);
    }

    //Test 1, a 5 x 5 board with a snake around the border slowly going inward
    //This is a standard test case and is to test functionality
    public static boolean [][] Test1(){
        return new boolean[][]{
                {true, true, true, true, true},
                {false, false, false, false, true},
                {true, true, true, false, true},
                {true, false, false, false, true},
                {true, true, true, true, true}
        };
    }

    //Test 2, a 3 x 3 board with and L snake at the bottom of the grid
    //This test is to see how the method handles a small snake game
    public static boolean [][] Test2(){
        return new boolean[][]{
                {false, false, false},
                {false, false, true},
                {true, true, true}
        };
    }

    //Test 3, a 7 x 7 board with a snake diagonally across the board
    public static  boolean [][] Test3(){
        return new boolean[][]{
                {false, false, false, false, false, false, true},
                {false, false, false, false, false, true, true},
                {false, false, false, false, true, true, false},
                {false, false, false, true, true, false, false},
                {false, false, true, true, false, false, false},
                {false, true, true, false, false, false, false},
                {true, true, false, false, false, false, false},
        };
    }

    //Test 4, a 5 x 5 board with no snake at all, to see what would happen
    public static boolean[][] Test4(){
        return new boolean [][]{
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
    }

    //Test 5, a 10 x 10 board with a full snake
    public static boolean[][] Test5(){
        return new boolean[][]{
                {true, false, true, true, true, false, true, true, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, true, true, false, true, true, true, false, true, true},
        };
    }

    //////////////////////////////////////////////////////////////////////////
    //5 test cases for findTailRecursive
    //Test 6, a 5 x 5 board with a snake around the border only
    //This is a standard test case and is to test functionality of recursiveFindTail
    public static boolean [][] Test6(){
        return new boolean[][]{
                {true, true, true, true, true},
                {false, false, false, false, true},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {true, true, true, true, true}
        };
    }

    //Test 7, a 3 x 3 board with and L snake at the top of the grid
    //This test is to see how the recursive method handles a small snake game
    public static boolean [][] Test7(){
        return new boolean[][]{
                {true, true, true},
                {true, false, false},
                {true, false, false}
        };
    }

    //Test 8, a 7 x 7 board with a snake diagonally across the board from bottom right to top left
    public static  boolean [][] Test8(){
        return new boolean[][]{
                {true, false, false, false, false, false, false},
                {true, true, false, false, false, false, false},
                {false, true, true, false, false, false, false},
                {false, false, true, true, false, false, false},
                {false, false, false, true, true, false, false},
                {false, false, false, false, true, true, false},
                {false, false, false, false, false, true, true},
        };
    }

    //Test 9, a 5 x 5 board with no snake at all, to see what would happen
    public static boolean[][] Test9(){
        return new boolean [][]{
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
        };
    }

    //Test 10, a 10 x 10 board with a full snake
    public static boolean[][] Test10(){
        return new boolean[][]{
                {true, true, true, false, true, true, true, false, true, true},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, false, true, false, true, false, true, false},
                {true, false, true, true, true, false, true, true, true, false},
        };
    }

}
