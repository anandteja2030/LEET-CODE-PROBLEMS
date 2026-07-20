class Solution {
    public int myAtoi(String s) {

        s = s.trim();

        if (s.isEmpty())
            return 0;

        int sign = 1;
        int i = 0;

        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            if (s.charAt(0) == '-')
                sign = -1;

            i++;
        }

        if (i == s.length() || !Character.isDigit(s.charAt(i)))
            return 0;

        String number = s.substring(i).split("[^0-9]")[0];

        if (sign == -1)
            number = "-" + number;

        try {
            return Integer.parseInt(number);
        }
        catch (NumberFormatException e) {
            return sign == 1? Integer.MAX_VALUE: Integer.MIN_VALUE;
        }
    }
}