public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] sequence = new int[n];

        for (int i = 1; i < n; i++) {
            sequence[i] = 1 - sequence[i / 2];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sequence[i] == sequence[j]) System.out.print("+ ");
                else System.out.print("- ");
            }
            System.out.println();
        }
    }
}
