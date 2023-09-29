public class RandomWalkers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java RandomWalkers <r> <trials>");
            return;
        }

        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int totalSteps = 0;

        for (int trial = 0; trial < trials; trial++) {
            int x = 0;
            int y = 0;
            int steps = 0;

            while (Math.abs(x) + Math.abs(y) < r) {

                int direction = (int) (Math.random() * 4);
                switch (direction) {
                    case 0:
                        y++;
                        break;
                    case 1:
                        y--;
                        break;
                    case 2:
                        x--;
                        break;
                    case 3:
                        x++;
                        break;
                }


                steps++;
            }


            totalSteps += steps;
        }

        double averageSteps = (double) totalSteps / trials;

        System.out.println("average number of steps = " + averageSteps);
    }
}
