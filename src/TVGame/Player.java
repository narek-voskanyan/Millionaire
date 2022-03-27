package TVGame;

import java.util.Scanner;

public class Player {

    public void getPlayerInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        this.name = in.nextLine();
        System.out.println("Enter your age");
        this.age = in.nextInt();
    }
    public String setName(){
        return this.name;
    }

    public int setAge(){
        return this.age;
    }

    public void plusWinCash(int a){
        cash = cash + a;
    }

    public int setCash(){
        return  this.cash;
    }


    private String name;
    private int age;
    private int cash;
}
