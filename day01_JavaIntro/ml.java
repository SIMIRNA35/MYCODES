package day01_JavaIntro;

public class ml {
    public static void main(String[] args) {
        int q = 0;

        do {
            q = q++ + --q - (q % 3);
        } while (++q < 4);

        System.out.println(q);

        String input = "today it will be 100 degrees !";
        int n = 0;

        while (n++ < input.length()) {

            if (n == 8) {
                continue;
            } else if (n == 9) {
                break;
            }
            System.out.print(input.charAt(++n));
            System.out.println("------------------------------");

            int count = 0;
            for (int a = 0; a < 4; a++) {

                if (a == 3) continue;

                for (int b = a + 1; b < 5; b++) {
                    count++;

                    if (b == 3) break;
                }
            }

            System.out.print(count);

            double[] doub = new double[4];
            doub[0] = 1.0;
            doub[2] = 42.1;
            doub = new double[4];
            doub[1] = 17.2;
            doub[3] = doub.length;

            System.out.println(doub);

        }
        String[] strs = {"display", "population", "meeting", "copy", "franchise"};

        int a = strs.length;
        int b = strs[5].length();
        System.out.println(a + " " + b);

        System.out.println("-------------------------");




    }



}