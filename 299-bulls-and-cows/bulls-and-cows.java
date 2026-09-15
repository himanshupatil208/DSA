class Solution {
    public String getHint(String secret, String guess) {
        int a=0;
        int b=0;

        int[] secretCount = new int[10];
        int[] guessCount = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i))
                a++;
            else {
                secretCount[secret.charAt(i) - '0']++;
                guessCount[guess.charAt(i) - '0']++;
            }
        }

        for (int i = 0; i < 10; i++) {
            b += Math.min(secretCount[i], guessCount[i]);
        }

        return "" + a + 'A' + b + 'B';
    }
}