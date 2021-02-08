package jp.ac.uryukyu.ie.e205725;
import java.util.Scanner;
public class Sugoroku {
    static int player1 = 1;
    static int player2 = 1;
    static int money1 = 0;
    static int money2 = 0;
    static String[] universitylist = {"沖縄大学","沖縄国際大学","琉球大学","沖縄キリスト教学院大学"};
    static int a = new java.util.Random().nextInt(3);
    static String university = universitylist[a];

    public static void banmen() {
        for (int i = 0;i<player1;i++){
            System.out.print('・');
        }
        System.out.print("P1");
        for (int i = 0;i<50-player1;i++){
            System.out.print("・");
        }
        System.out.print(university);
        System.out.println("");

        for (int i = 0;i<player2;i++){
            System.out.print('・');
        }
        System.out.print("P2");
        for (int i = 0;i<50-player2;i++){
            System.out.print("・");
        }
        System.out.print(university);
        System.out.println("");
    }
    public static void game() throws InterruptedException {
        while (true){
            System.out.println("player1のターンです");
            System.out.println("0とenterキーを押すとすごろくを投げるよ");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num == 0){
                int r = new java.util.Random().nextInt(7);
                int sugoroku = r + 1;
                System.out.println("player1の出した目は"+ sugoroku + "です");
                player1 += sugoroku;
                if (player1 > 50){
                    int back = player1 - 50;
                    player1 = 50-back;
                }
                if (player1 % 2 == 0){
                    System.out.println("財布が落ちている??");
                    System.out.println("猫ばばしようかかか考え中・・・");
                    Thread.sleep(5000);
                    System.out.println("player1は、交番に届けた");
                    int purasu = new java.util.Random().nextInt(1000);
                    money1 += purasu*1000;
                    System.out.println("財布の持ち主が見つかった");
                    Thread.sleep(3000);
                    System.out.println("player1は財布の持ち主からお礼に"+purasu*1000+"円貰った");
                    Thread.sleep(3000);
                    System.out.println("よって所持金が"+money1+"円になった！！");
                }else if (player1 %2 != 0){
                    System.out.println("財布が落ちている??");
                    System.out.println("猫ばばしようかかか考え中・・・");
                    Thread.sleep(5000);
                    System.out.println("player1は、財布を盗んだ");
                    int purasu = new java.util.Random().nextInt(1000);
                    money1 -= purasu*1000;
                    Thread.sleep(3000);
                    System.out.println("真後ろにいる警察に見つかった");
                    Thread.sleep(3000);
                    System.out.println("player1は罰金として"+purasu*1000+"円払った");
                    Thread.sleep(3000);
                    System.out.println("よって所持金が"+money1+"円になった！！");
                }
                banmen();
                if (player1 == 50){
                    System.out.println("おめでとうございます"+university + "に到着しました");
                    System.out.println("一番最初に到着したので、player1さんに賞金20000000円差し上げます");
                    money1 += 20000000;
                    break;    
                }
            
            }


            System.out.println("player2のターンです");
            System.out.println("0とenterキーを押すとすごろくを投げるよ");
            Scanner scan2 = new Scanner(System.in);
            int num2 = scan2.nextInt();
            if (num2 == 0){
                int r = new java.util.Random().nextInt(7);
                int sugoroku = r + 1;
                System.out.println("あなたの出した目は"+ sugoroku + "です");
                player2 += sugoroku;
                if (player2 > 50){
                    int back = player2 - 50;
                    player2 = 50-back;
                }
                if (player2 % 2 == 0){
                    System.out.println("財布が落ちている??");
                    System.out.println("猫ばばしようかかか考え中・・・");
                    Thread.sleep(5000);
                    System.out.println("player2は、交番に届けた");
                    int purasu = new java.util.Random().nextInt(1000);
                    money2 += purasu*1000;
                    System.out.println("財布の持ち主が見つかった");
                    Thread.sleep(3000);
                    System.out.println("player2は財布の持ち主からお礼に"+purasu*1000+"円貰った");
                    Thread.sleep(3000);
                    System.out.println("よって所持金が"+money2+"円になった！！");
                }else if (player1 %2 != 0){
                    System.out.println("財布が落ちている??");
                    System.out.println("猫ばばしようかかか考え中・・・");
                    Thread.sleep(5000);
                    System.out.println("player2は、財布を盗んだ");
                    int purasu = new java.util.Random().nextInt(1000);
                    money2 -= purasu*1000;
                    Thread.sleep(3000);
                    System.out.println("真後ろにいる警察に見つかった");
                    Thread.sleep(3000);
                    System.out.println("player2は罰金として"+purasu*1000+"円払った");
                    Thread.sleep(3000);
                    System.out.println("よって所持金が"+money2+"円になった！！");
                }
                banmen();
                if (player2 == 50){
                    System.out.println("おめでとうございます"+university + "に到着しました");
                    System.out.println("一番最初に到着したので、player2さんに賞金20000000円差し上げます");
                    money2 += 20000000;
                    break;    
                }
            }
        }

    }
}
