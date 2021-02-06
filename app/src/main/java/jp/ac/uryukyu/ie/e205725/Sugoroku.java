package jp.ac.uryukyu.ie.e205725;
import java.util.Scanner;
public class Sugoroku {
    static int player1 = 1;
    static int player2 = 1;
    static String[] universitylist = {"沖縄大学","沖縄国際大学","琉球大学","沖縄キリスト教学院大学"};
    static int a = new java.util.Random().nextInt(3);
    static String university = universitylist[a];

    public static void banmen() {
        for (int i = 0;i<player1;i++){
            System.out.print('・');
        }
        System.out.print('P');
        for (int i = 0;i<50-player1;i++){
            System.out.print("・");
        }
        System.out.print(university);
        System.out.println("");
    }
    public static void game(){
        while (true){
            System.out.println("0を押すとすごろくを投げるよ");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num == 0){
                int r = new java.util.Random().nextInt(7);
                int sugoroku = r + 1;
                System.out.println("あなたの出した目は"+ sugoroku + "です");
                player1 += sugoroku;
                if (player1 > 50){
                    int back = player1 - 50;
                    player1 = 50-back;
                }
                banmen();
                if (player1 == 50){
                    System.out.println("おめでとうございます"+university + "に到着しました");
                    break;
                }
            }
        }
    }
}
