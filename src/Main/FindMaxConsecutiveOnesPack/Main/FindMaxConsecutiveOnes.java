package Main.FindMaxConsecutiveOnesPack.Main;

public class FindMaxConsecutiveOnes {
    public int FindMaxConsecutiveOnes(int[] arr) {
        int countOnes = 0;
        int maxConsecutiveOnes = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countOnes++;
            } else {
                countOnes = 0;
            }
            maxConsecutiveOnes = Math.max(countOnes, maxConsecutiveOnes);
        }
        return maxConsecutiveOnes;
    }
}
