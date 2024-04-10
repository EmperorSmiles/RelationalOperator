public class SingleDimensionalArray {
    public static void main(String[] args) {
//        int[] marks;
//        marks = new int[5]
        int[] marks = new int[] {20, 30 ,40, 50 , 60};

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("***********************");

        for (int value : marks) {
            System.out.println(value);
        }
    }
}
