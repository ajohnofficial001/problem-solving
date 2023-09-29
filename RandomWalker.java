public class RandomWalker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java RandomWalker <r>");
            return;
        }

        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        int steps = 0;

        System.out.println("(" + x + ", " + y +")");

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
            System.out.println("(" + x + ", " + y + ")");


            steps++;
        }


        System.out.println("steps = " + steps);
    }
}

