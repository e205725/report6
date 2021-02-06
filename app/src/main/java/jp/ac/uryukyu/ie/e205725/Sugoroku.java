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
    
}
