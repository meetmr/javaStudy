public class DemoArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 1; i< 10; i++){
            arr[i] = i;
        }

        for (int i = 1; i< 10; i++){
            System.out.println(arr[i]);
        }

        String[] strAtrray = new String[]{"王恒兵","谢国燕"};
        for (int i = 0; i< strAtrray.length; i++){
            System.out.println(strAtrray[i]);
        }

        String[] strr = {"50","5"};


    }
}
