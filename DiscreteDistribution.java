public class DiscreteDistribution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] freq = new int[args.length - 1];
        int sum = 0;

        for (int i = 0; i < freq.length; i++) {
            freq[i] = Integer.parseInt(args[i + 1]);
            sum += freq[i];
        }

        int r = (int) (Math.random() * sum);
        int index = 0;
        while (r >= freq[index]) {
            r -= freq[index];
            index++;
        }

        System.out.println(index);
    }
}
