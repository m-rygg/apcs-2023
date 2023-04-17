package unit10;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Maze {
    private boolean solution = false;
    private char[][] maze;

    /**
     * Instantiates a Maze instance based on the provided arguments
     * 
     * @param rows the number of rows
     * @param cols the number of columns
     * @param line the values to be placed in the maze.
     */
    public Maze(int rows, int cols, String line) {
        this.maze = new char[rows][cols];

        for(int r = 0; r < rows; r++){
            for(int c = 0; c <cols; c++){
                maze[r][c] = line.charAt(r*rows + c);
            }
        }


    }

    /**
     * @return the starting coordinates as "r c"
     */
    public String getStart() { /* Not shown, plz ignore implementation */
        int z = Arrays.stream(maze).map(String::new).collect(Collectors.joining("")).indexOf('@');
        return "" + z / maze[0].length + " " + z % maze[0].length;
    }

    /**
     * @return the ending coordinates as "r c"
     */
    public String getEnd() { /* Not shown, plz ignore implementation */
        int z = Arrays.stream(maze).map(String::new).collect(Collectors.joining("")).indexOf('$');
        return "" + z / maze[0].length + " " + z % maze[0].length;
    }

    public int[] parseCoord(String coord) {
        String[] strArray = coord.split(" ");
        int[] intArray = new int[2];
        intArray[0] = Integer.parseInt(strArray[0]);
        intArray[1] = Integer.parseInt(strArray[1]);
        return intArray;
    }

    public boolean canTravelTo(int r, int c){ //
        if((r<maze.length && r>=0 && c>=0 && c<maze[0].length) && (maze[r][c] != '#') && (maze[r][c] != 'c')){
            return true;
        }
        else{
            return false;
        }
    }

    private void explore(int r, int c){

        //check in bounds, not checked, not equal to wall
        //set checked by setting the point equal to c
        //check if solution not found
        //if getend true solution = true
        //if good.. mazerc = 'c'
        //check rightupleftdown
        
       
        
            if(maze[r][c] == '$'){
                solution = true;
            }
            else if(canTravelTo(r,c)){
            
                maze[r][c] = 'c';
                if(canTravelTo(r-1,c)){
                explore(r-1,c);
                }
                if(canTravelTo(r+1,c)){
                    explore(r+1,c);
                }
                if(canTravelTo(r,c+1)){
                    explore(r,c+1);
                }
                if(canTravelTo(r,c-1)){
                    explore(r,c-1);
                }
                //maze[r][c] = '.';
            }
            
        }
        
        

        

        

    /**
     * Uses recursion to see if the maze has a solution or not.
     * 
     * Suggested algorithm:
     * if R and C are in bounds and spot is !#
     * - if you are at $:
     * - - set has a solution
     * - else:
     * - - mark spot as checked
     * - - recur up
     * - - recur down
     * - - recur left
     * - - recur right
     * 
     * @param r current row index
     * @param c current column index
     */
    /*
     * private void check(int r, int c) {
     * // canTravelTo();
     * 
     * }
     * 
     */
    /**
     * Determines if there is a solution (a path of '.') for this maze.
     * 
     * @return true if the maze has a path from Start (@) to End ($).
     */
    public boolean hasSolution() {
        explore(parseCoord(getStart())[0],parseCoord(getStart())[1]);
        return solution; // replace me!

    }

    // HINT overriding toString may be handy. :)

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("sad panda");
    }

    public static void main(String[] args) {
        Maze example = new Maze(3, 3, "#.@.....$");
        check(example.hasSolution());

        Maze case1 = new Maze(5, 7, ".#.#....#.#.##@.....$#...#.##..#...");
        check(case1.hasSolution());

        Maze case2 = new Maze(4, 4, ".#.$.##..##.@..#");
        check(!case2.hasSolution());

        Maze test = new Maze(3, 3, "#.@.....$");
        check(test.hasSolution());

        test = new Maze(3, 3, "##@#####$");
        check(!test.hasSolution());

        test = new Maze(3, 3, "##@#..#.$");
        check(test.hasSolution());

        test = new Maze(3, 3, "#.@#.##.$");
        check(test.hasSolution());

        test = new Maze(3, 3, "##@#.##.$");
        check(!test.hasSolution());

        System.out.println("Happy Panda! \uD83D\uDC3C");

    }

}
