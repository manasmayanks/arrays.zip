public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] hasBirthday = new boolean[n];
        int count = 0;

        while (true) {
            int day = (int) (Math.random() * n);
            count++;
            if (hasBirthday[day]) break;
            hasBirthday[day] = true;
        }

        System.out.println("Number of people = " + count);
    }
}
