package guru.qa.hw_1;

public class Player {
    public String Nickname;
    public int MMR;
    public String Hero;
    public String Line_position;
    public boolean Connection;

    public void showNickname() {
        System.out.println(Nickname);
    }
    public void showMMR() {
        System.out.println(MMR);
    }
    public void incrememtMMR() {
        MMR = MMR + 30;
    }
    public void showHero(){
        System.out.println(Hero);
    }
    public void showLine_position(){
        System.out.println(Line_position);
    }
    public void showConnection(){
        System.out.println(Connection);
    }
    public void gameStart(){
        if (Connection = false){
            System.out.println("Connection is failed. Searching the new game.");
        } else {
            System.out.println("Connection is stable. Start the game");
        }
    }
}
