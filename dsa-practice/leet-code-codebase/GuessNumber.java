/*We are playing the Guess Game. The game is as follows:
I pick a number from 1 to n. You have to guess which number I picked (the number I picked stays the same throughout the game).
Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
You call a pre-defined API int guess(int num), which returns three possible results:
-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked. */

import java.util.Scanner;

class GuessGame {
    int pickedNumber;

    // Simulated guess API
    int guess(int num) {
        if (num == pickedNumber) return 0;
        if (num > pickedNumber) return -1;
        return 1;
    }
}

public class GuessNumber extends GuessGame {

    public int guessNumber(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid;
            } else if (res == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GuessNumber game = new GuessNumber();

        System.out.print("Enter n (range 1 to n): ");
        int n = sc.nextInt();

        System.out.print("Enter the picked number: ");
        game.pickedNumber = sc.nextInt();

        int result = game.guessNumber(n);
        System.out.println("Guessed Number: " + result);

        sc.close();
    }
}
