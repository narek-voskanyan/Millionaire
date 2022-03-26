package TVGame;

public class Player {

    public void getPlayerInfo(String name, int age){
        this.name = name;
        this.age = age;
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
