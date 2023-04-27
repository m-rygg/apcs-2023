package unit11;

// tessa and i worked on it together -- please give her credit too :)

public class BeatThatDiceGame {
  
    int resultOne = 0;
    int resultTwo = 0;
    int winsOne = 0;
    int winsTwo = 0;


    public void roll(){
        resultOne = ((int) (Math.random() * 60)) + (int) (Math.random() * 6);
        resultTwo = ((int) (Math.random() * 60)) + (int) (Math.random() * 6);
    }

    public void round(){
        if(resultOne>resultTwo){
            winsOne++;
        }
        else if(resultTwo>resultOne){
            winsTwo++;
        }
    }

    public void playGame(){
        while(winsOne < 5 || winsTwo < 5){
            roll();
            round();
        }

        if(winsOne==5){
            System.out.println("Player one wins.");
        }
        else if(winsTwo == 5){
            System.out.println("Player two wins.");
        }

    }

    public static void main(String[] args) {
        BeatThatDiceGame game = new BeatThatDiceGame();
        game.playGame();
       
    }
}
