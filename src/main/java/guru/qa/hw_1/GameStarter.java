package guru.qa.hw_1;

public class GameStarter {

    public static void main(String[] args){
        Player id123 = new Player();

        id123.Nickname = "satyr663";
        id123.MMR = 3700;
        id123.Hero = "Viper";
        id123.Line_position = "Offlane";
        id123.Connection = true;

        id123.showNickname();
        id123.incrememtMMR();
        id123.showMMR();
        id123.showHero();
        id123.showLine_position();
        id123.showConnection();
        id123.gameStart();


    }
}
