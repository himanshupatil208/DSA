class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int num = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        while (i < s.length()) {
            char c = s.charAt(i);

            if (c < '0' || c > '9') {
                break;
            }

            int n = c - '0';

            if (num > Integer.MAX_VALUE / 10 ||
                (num == Integer.MAX_VALUE / 10 && n > 7)) {
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }

            num = num * 10 + n;
            i++;
        }

        return num * sign;
    }
}