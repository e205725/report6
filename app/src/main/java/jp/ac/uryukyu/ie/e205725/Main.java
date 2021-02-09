
package jp.ac.uryukyu.ie.e205725;

public class Main {
    public static void main(String[] args) throws InterruptedException {
     System.out.println("すごろくゲームを始めます");
     System.out.println("今回の目的地は"+Sugoroku.university+"です");
     Sugoroku.banmen();
     Sugoroku.game();
     Sugoroku.result();
     
    }
}  

