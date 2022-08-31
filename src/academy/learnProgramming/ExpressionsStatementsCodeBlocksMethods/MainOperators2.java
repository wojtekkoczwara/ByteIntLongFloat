package academy.learnProgramming.ExpressionsStatementsCodeBlocksMethods;

public class MainOperators2 {

    //diffmerge!!!

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore =  calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);

      displayHighScorePosition("Michael", calculateHighScorePosition( calculateScore(true, 1500, 0, 0)));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = -1;
        if ((gameOver == true)){
            finalScore = score + (levelCompleted * bonus);
            finalScore+=1000;
            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }

    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + " manages to get into position " + position + " in the highscore table");
    }

    public static int calculateHighScorePosition(int score){
        if (score > 1000){
            return 1;
        } else if (score > 500) {
            return 2;
        } else if (score > 100) {
            return 3;
        }
        return 4;
    }

}
