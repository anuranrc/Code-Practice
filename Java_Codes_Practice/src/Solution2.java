import java.util.*;
import java.util.LinkedList;

public class Solution2 {

        static int find_minimum_number_of_moves(int rows, int cols, int start_row, int start_col, int end_row, int end_col) {
        Position start_p = new Position(start_row, start_col);
        Position target_p = new Position(end_row, end_col);

        int[][] moves = new int[rows+1][cols+1];
        Set<Position> seen = new HashSet<>();
        Queue<Position> q = new LinkedList<>();

        q.offer(start_p);
        seen.add(start_p);
        moves[start_p.row][start_p.col] = 0;

        while(! q.isEmpty()){
            Position cur = q.poll();
            seen.add(cur);

            if(cur.row == target_p.row && cur.col == target_p.col){
                return moves[cur.row][cur.col];
            }

            if(!seen.contains(new Position(cur.row+2, cur.col-1)) && cur.row+2 < rows-1 && cur.col-1 < cols-1 && cur.row+2 >= 0 && cur.col-1 >= 0 ){
                seen.add(new Position(cur.row+2, cur.col-1));
                q.offer(new Position(cur.row+2, cur.col-1));
                moves[cur.row+2][cur.col-1] = moves[cur.row+2][cur.col-1] +1;
            }

            if(!seen.contains(new Position(cur.row+2, cur.col+1)) && cur.row+2 < rows-1 && cur.col+1 < cols-1 && cur.row+2 >= 0 && cur.col+1 >= 0 ){
                seen.add(new Position(cur.row+2, cur.col+1));
                q.offer(new Position(cur.row+2, cur.col+1));
                moves[cur.row+2][cur.col+1] = moves[cur.row+2][cur.col+1] +1;
            }
            if(!seen.contains(new Position(cur.row-2, cur.col-1)) && cur.row-2 < rows-1 && cur.col-1 < cols-1 && cur.row-2 >= 0 && cur.col-1 >= 0 ){
                seen.add(new Position(cur.row-2, cur.col-1));
                q.offer(new Position(cur.row-2, cur.col-1));
                moves[cur.row-2][cur.col-1] = moves[cur.row-2][cur.col-1] +1;
            }
            if(!seen.contains(new Position(cur.row-2, cur.col+1)) && cur.row-2 <= rows-1 && cur.col+1 <= cols-1 && cur.row-2 >= 0 && cur.col+1 >= 0 ){
                seen.add(new Position(cur.row-2, cur.col+1));
                q.offer(new Position(cur.row-2, cur.col+1));
                moves[cur.row-2][cur.col+1] = moves[cur.row-2][cur.col+1] +1;
            }
            if(!seen.contains(new Position(cur.row+1,cur.col-2)) && cur.row+1 <= rows-1 && cur.col-2 <= cols-1 && cur.row+1 >= 0 && cur.col-2 >= 0 ){
                seen.add(new Position(cur.row+1, cur.col-2));
                q.offer(new Position(cur.row+1, cur.col-2));
                moves[cur.row+1][cur.col-2] = moves[cur.row+2][cur.col-2] +1;
            }
            if(!seen.contains(new Position(cur.row+1, cur.col+2)) && cur.row+1 <= rows-1 && cur.col+2 <= cols-1 && cur.row+1 >= 0 && cur.col+2 >= 0 ){
                seen.add(new Position(cur.row+1, cur.col+2));
                q.offer(new Position(cur.row+1, cur.col+2));
                moves[cur.row+1][cur.col+2] = moves[cur.row+1][cur.col+2] +1;
            }
            if(!seen.contains(new Position(cur.row-1, cur.col+2)) && cur.row-1 <= rows-1 && cur.col+2 <= cols-1 && cur.row-1 >= 0 && cur.col+2 >= 0 ){
                seen.add(new Position(cur.row-1, cur.col+2));
                q.offer(new Position(cur.row-1, cur.col+2));
                moves[cur.row-1][cur.col+2] = moves[cur.row+2][cur.col+2] +1;
            }

            if(!seen.contains(new Position(cur.row-1, cur.col-2)) && cur.row-1 <= rows-1 && cur.col-2 <= cols-1 && cur.row-1 >= 0 && cur.col-2>= 0 ){
                seen.add(new Position(cur.row-1, cur.col-2));
                q.offer(new Position(cur.row-1, cur.col-2));
                moves[cur.row-1][cur.col-2] = moves[cur.row-1][cur.col-2] +1;
            }

        }

        return -1;

    }

    static class Position{
        int row;
        int col;
        //List<Position> neighbour = new ArrayList<>();

        Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static  void  main(String[]args){
       int move =  find_minimum_number_of_moves(20, 20, 5,4,0,6 );
       System.out.println(move);

    }
}
