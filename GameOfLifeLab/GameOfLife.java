import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;

    // the game board will have 5 rows and 5 columns
    private final int ROWS = 8;
    private final int COLS = 8;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the 8 cells initially alive
        final int X1 = 5, Y1 = 1;
        final int X2 = 6, Y2 = 1;
        final int X3 = 5, Y3 = 2;
        final int X4 = 6, Y4 = 2;
        final int X5 = 5, Y5 = 3;
        final int X6 = 3, Y6 = 3;
        final int X7 = 3, Y7 = 4;
        final int X8 = 2, Y8 = 4;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Critter crit1 = new Critter();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, crit1);
        
        Critter crit2 = new Critter();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, crit2);
        
        Critter crit3 = new Critter();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, crit3);
        
        Critter crit4 = new Critter();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, crit4);
        
        Critter crit5 = new Critter();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, crit5);
        
        Critter crit6 = new Critter();
        Location loc6 = new Location(Y6, X6);
        grid.put(loc6, crit6);
        
        Critter crit7 = new Critter();
        Location loc7 = new Location(Y7, X7);
        grid.put(loc7, crit7);
        
        Critter crit8 = new Critter();
        Location loc8 = new Location(Y8, X8);
        grid.put(loc8, crit8);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
       /** You will need to read the documentation for the World, Grid, and Location classes
       *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
       */
       // create the grid, of the specified size, that contains Actors
       Grid<Actor> grid = world.getGrid();
       BoundedGrid<Actor> grid1 = new BoundedGrid<Actor>(ROWS, COLS);
       for(int row = 0; row < ROWS; row++)
       {
            for(int col = 0; col < COLS; col++)
            {
                Actor cell = this.getActor(row, col);
                Location cell1 = new Location(row,col);
                if (cell != null){
                    ArrayList<Actor> neighbors = grid.getNeighbors(cell1);
                    int neighborcount = neighbors.size();
                    if (neighborcount == 2 || neighborcount == 3){
                        Critter critnew = new Critter();
                        Location locnew = new Location(row,col);
                        grid1.put(locnew, critnew);
                    }
                }
                else{
                    ArrayList<Actor> neighbors = grid.getNeighbors(cell1);
                    int neighborcount = neighbors.size();
                    if( neighborcount == 3){
                        Critter critnew = new Critter();
                        Location locnew = new Location(row,col);
                        grid1.put(locnew, critnew);
                    }
                }
            }
       }
       world.setGrid(grid1);
       world.show();
    }

    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
        int count = 0;
        while (count <=3){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
            game.createNextGeneration();
            count++;
            
        }
    }

}
