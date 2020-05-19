import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{15,5,45,45};
        System.out.print(Arrays.toString(arr));

        System.out.println("================");
        String s1 = "ewnbiugfbewifbgweifhwefwd";
        char[] strArray = s1.toCharArray();
        Arrays.sort(strArray);
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i] + " ");
        }

    }
}
