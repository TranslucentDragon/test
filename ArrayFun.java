public class ArrayFun {

    private static int[] a = {1, 2, 3};

    public static void printA(int[] a) {
        //[1,2,3]
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < (a.length - 1)) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

    public static int sum(int[] b) {
        int y = 0;
        int i = 0;
        while (i < b.length) {
            y += b[i];
            i++;
        }
        return y;
    }

    public static void main(String[] args) {
        int someInt = Integer.parseString(args);
        printA(a);
        System.out.format("%d%n", sum(a));
        char [][] grid = {{'a', 'b', 'c'},
                         {'d','e','f'}};
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++)
        }
    }


}