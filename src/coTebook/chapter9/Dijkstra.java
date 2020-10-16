package coTebook.chapter9;
import java.util.Arrays;

    public class Dijkstra{

        public static void main(String[] args){

            final int INF = Integer.MAX_VALUE;
            int[][] Graph = {
                    {0, 3, 5, INF, INF, INF},
                    {INF, 0, 2, 6, INF, INF},
                    {INF, 1, 0, 4, 6, INF},
                    {INF, INF, INF, 0, 2, 3},
                    {INF, INF, INF, INF, 0, 6},
                    {INF, INF, INF, INF, INF, 0}
            };
            int start = 0;//시작노드
            int[] Distance = Graph[start].clone();//시작노드에서의 각 노드까지의 거리
            boolean[] visited = new boolean[Distance.length];//방문여부

            for(int i = 0 ; i < Graph.length ; i++){
                int minIndex = -1;
                int minValue = INF;
                // 방문하지 않는 노드 중에서 짧은 거리의 노드를 방문처리
                for(int j = 0 ; j < Distance.length ; j++){
                    if(!visited[j] && minValue > Distance[j]){
                        minIndex = j;
                        minValue = Distance[j];
                    }
                    if(!visited[j]&&Graph[minIndex][j]!=INF&&Distance[j]> Distance[minIndex]+Graph[minIndex][j]){
                        Distance[j] = Distance[minIndex]+Graph[minIndex][j];
                    }
                }
                //최소 거리의 노드를 방문 처리
                visited[minIndex] = true;
                // 방문하지 않는 노드 중에서 짧은 거리의 노드를 방문처리
                for(int j = 0 ; j < Distance.length ; j++){
                    if(!visited[j]&&Graph[minIndex][j]!=INF&&Distance[j]> Distance[minIndex]+Graph[minIndex][j]){
                        Distance[j] = Distance[minIndex]+Graph[minIndex][j];
                    }
                }
            }

            System.out.println(Arrays.toString(Distance));

        }
    }