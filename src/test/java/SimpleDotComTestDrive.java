import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleDotComTestDrive {
    public static void main (String [] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int [] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "1";
        String result = dot.checkYourself(userGuess);
    }
}



class SimpleDotCom {
    int [] locationCells;
    int numOfHits = 0;

    public void setLocationCells (int [] locs) {
        locationCells = locs;
    }
    public String checkYourself (String stringGuess) {
        int guess = Integer.parseInt (stringGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
class GameHelper {
    public String getUserInput (String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        }
        catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

}
