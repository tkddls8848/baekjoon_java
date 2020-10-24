import java.util.*;
/*수건 돌리기 게임
    case1
6 인원수
2 달리기가 절대적으로 빨라 술래가 되지 않는 인원수
B C 술래 안되는 인원
2 게임 진행 횟수
3 -2 각 게임 진행 방향
참여인원별 술래 횟수 결과 출력
B 0
C 0
D 0
A 1
F 0
E 2
  case2
17
5
B D I M P
11
3 -4 5 6 -7 -8 10 -12 -15 -20 23

B 0
C 0
D 0
L 1
Q 1
A 3
F 2
I 0
J 0
G 1
K 1
M 0
N 0
H 1
P 0
E 1
O 1
 */
public class NHN_PreTest1 {

    static String[] orderArr = {"B","2","(","R","G",")"};

    private static void solution(int numOfOrder, String[] orderArr) {
        int front = 0;
        int start = 0;
        int end = 0;
        String answer = "";
        for (int i = 0 ; i < orderArr.length ; i++){
            System.out.println(orderArr[i]);
            if (orderArr[i] == "("){
                start = i;
                front = start - 1;
                break;
            }
        }
        for (int j = orderArr.length-1 ; j >= 0 ; j--){
            if (orderArr[j] == ")"){
                end = j;
                break;
            }
        }
        if (47<(int)orderArr[front].charAt(0)&&58>(int)orderArr[front].charAt(0)){
/*            start + 1;
            end - 1;*/
            System.out.println("숫자");
        }
        System.out.println((int)orderArr[front].charAt(0)+" "+start+" "+end);
    }

    public static void main(String[] args)  {
        solution(1, orderArr);
    }
}
