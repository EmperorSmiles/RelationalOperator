
public class MultiDimentionalArray{
    public static void main(String[] args) {
        int marks[][] = {
                {10, 9 , 8, 7, 6},
                {6, 5, 4, 3, 2},
                {11, 12, 13, 14, 15},
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(marks[i][j] + "\t");
            }}
        System.out.println();
}
}

