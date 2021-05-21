import java.util.Random;
import java.util.Scanner;

class guessTheNumber {
    int count=0;
public guessTheNumber(){
    Random random =new Random();
    int variable=random.nextInt(100);

    Scanner input =new Scanner(System.in);
    for (int i=1;i<100;i++) {

        System.out.println("Guess the Number :)\n");
        int userNum = input.nextInt();
        isCorrectNumber(variable, userNum);
        if (variable==userNum){
            break;
        }
    }


}

    public int isCorrectNumber(int comp,int user){





    if (comp > user) {
        System.out.println("You Chosed smaller Number\n");
        count++;
    } else if (comp < user) {
        System.out.println("You Chosed larger Number\n");
        count++;
    } else if (comp == user) {
        System.out.println("You Chose the Correct Number\n");
        count++;
    }

        return count;

    }
    public int getCount(){
    return count;
    }
 public void setCount(int setting){
    count=setting;
    }


}
