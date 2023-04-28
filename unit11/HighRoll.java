package unit11;

public class HighRoll{

    private int scoreOne = 0;
    private int scoreTwo = 0;
    

    public int roll(){
        return ((int) (Math.random() * 6)) + ((int) (Math.random() * 6)) + ((int) (Math.random() * 6));
    }
    public void playRound(){
        int one = roll();
        int two = roll();
        if(one>two){
            scoreOne = scoreOne + one;
        }
        if(two>one){
            scoreTwo+=two;
        }
        if(two==one){
            scoreOne+=one;
            scoreTwo+=two;
        }
    }

    public void playGame(){
        while(scoreOne<50 && scoreTwo<50){
            playRound();
        }

        if(scoreOne>scoreTwo){
            System.out.println("Player One Wins");
        }
        if(scoreTwo>scoreOne){
            System.out.println("Player Two Wins");
        }
        if(scoreTwo==scoreOne){
            System.out.println("Tie");
        }
    }


    public static void main(String[] args) {
        HighRoll game = new HighRoll();
        game.playGame();
        
    }
}