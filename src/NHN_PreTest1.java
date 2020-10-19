import java.util.*;

public class NHN_PreTest1 {
    static int sizeOfArray = 6;
    static int[][] map = {
        {0, 1, 1, 0, 0, 0},
        {0, 1, 1, 0, 1, 1},
        {0, 0, 0, 0, 1, 1},
        {0, 0, 0, 0, 1, 1},
        {1, 1, 0, 0, 1, 0},
        {1, 1, 1, 0, 0, 0},
    };
    static int[][] move = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    static boolean visited[][] = new boolean[sizeOfArray][sizeOfArray];
    static ArrayList<Integer> sol = new ArrayList<>();

    public static void bfs(int y, int x){
        if (map[x][y] == 1 && !visited[x][y]){
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{x,y});
            visited[x][y] = true;
            int cnt = 1;
            while (!q.isEmpty()){
                int[] pos = q.poll();
                int x1 = pos[0];
                int y1 = pos[1];
                for(int i = 0 ; i < 4; i++){
                    int afterX = x1+move[i][0];
                    int afterY = y1+move[i][1];
                    if (afterX < sizeOfArray && afterX >= 0 && afterY < sizeOfArray && afterY >= 0){
                        if (!visited[afterX][afterY] && map[afterX][afterY] == 1){
                        q.add(new int[]{afterX,afterY});
                        visited[afterX][afterY] = true;
                        cnt =cnt+1;
                        }
                    }
                }
            }

        for(int i = 0 ; i < 6 ; i++){
            for(int j = 0 ; j < 6 ; j++){
                System.out.print(visited[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(cnt);
        sol.add(cnt);
        }
    }

    public static void main(String[] args){

        bfs(0,5);
        bfs(1,1);
        bfs(5,1);
        Collections.sort(sol);
        System.out.println(sol+"number"+sol.size());
    }
}
