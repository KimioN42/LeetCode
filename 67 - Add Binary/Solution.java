public class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder result = new StringBuilder("");

        int sum = 0;

        while (i >= 0 || j >= 0 || sum == 1) {
            sum += ((i >= 0) ? a.charAt(i) - '0' : 0);
            sum += ((j >= 0) ? b.charAt(j) - '0' : 0);

            result.append((char) (sum % 2 + '0'));

            sum /= 2;

            i--;
            j--;
        }

        int start = result.length() - 1;

        while (start >= 0 && result.charAt(start) == '0')
            start--;

        if (start != result.length() - 1)
            result.delete(start + 1, result.length());

        return result.isEmpty() ? "0" : result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "4";
        int sum = a.charAt(0) - '0';
        System.out.println(sum);
    }

}
