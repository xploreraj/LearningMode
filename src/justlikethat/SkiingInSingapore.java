package justlikethat;

import java.util.*;

/**
 * http://geeks.redmart.com/2015/01/07/skiing-in-singapore-a-coding-diversion/
 */
public class SkiingInSingapore {
    static int[][] grid;
    static Map<Position, List> posPathMap;
    public static void main(String[] args) {
        grid = new int[4][];
        grid[0] = new int[]{4, 8, 7, 3};
        grid[1] = new int[]{2, 5, 9, 3};
        grid[2] = new int[]{6, 3, 2, 5};
        grid[3] = new int[]{4, 4, 1, 6};

        posPathMap = new TreeMap<>();

        for(int lineInGrid=0; lineInGrid<grid.length; lineInGrid++)
            for(int posInLine=0; posInLine<grid[lineInGrid].length; posInLine++)
                move(new Position(lineInGrid, posInLine));

        //now compare each position wrt path length,
    }

    private static void move(Position pos) {
        //TO DO
        //for 4 directions, move and add position to path
        //try to cache
        //finish all movements recursively
    }

    private static class Position{
        int lineInGrid;
        int positionInLine;
        Position(int lineInGrid, int positionInLine){
            this.lineInGrid = lineInGrid;
            this.positionInLine = positionInLine;
        }
        int getElevation(){
            return grid[lineInGrid][positionInLine];
        }
    }

    private static class Path {
        private int length, drop;
        List<Integer> elevationList;
        Path(int elevation) {
            elevationList = new ArrayList<>();
            elevationList.add(elevation);
            length++;
        }
        Path(Position pos){
            elevationList = new ArrayList<>();
            elevationList.add(pos.getElevation());
            length++;
        }
        void addElevation(int elevation) {
            elevationList.add(elevation);
            drop = elevationList.get(0) - elevation;
            length++;
        }
        void addElevation(Position pos) {
            elevationList.add(grid[pos.lineInGrid][pos.positionInLine]);
            drop = elevationList.get(0) - pos.getElevation();
            length++;
        }
        int getLength(){
            return length;
        }
        int getDrop(){
            return drop;
        }
    }
}
