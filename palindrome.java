
public class  palindrome {
    public static void main(String[] args) {
        String text = args[1];
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            char charLeft = text.charAt(left);
            char charRight = text.charAt(right);


            if (!Character.isLetterOrDigit(charLeft)) {
                left++;
            }

            else if (!Character.isLetterOrDigit(charRight)) {
                right--;
            }

            else {
                if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
                    System.out.println("false");
                    return;
                }
                left++;
                right--;
            }
        }
        System.out.println("true");
    }
}