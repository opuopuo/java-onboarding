package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        if (!verifyException(number)) {
            return -1;
        }

        return answer;
    }

    public static boolean verifyException(int number) {
        return (number >= 1 && number <= 10000);
    }
}
