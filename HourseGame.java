import java.util.ArrayList;

class Horse {

    private static final int[][] MOVES = { { -2, -1 }, { -2, 1 }, { -1, -2 }, { -1, 2 }, { 1, -2 }, { 1, 2 }, { 2, -1 },
            { 2, 1 } };

    private int x;
    private int y;

    public Horse(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ArrayList<int[]> possibleMoves() {
        ArrayList<int[]> possibleMoves = new ArrayList<>();
        for (int[] move : MOVES) {
            int newX = x + move[0];
            int newY = y + move[1];
            if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                possibleMoves.add(new int[] { newX, newY });
            }
        }
        return possibleMoves;
    }

    public static void main(String[] args) {
        Horse horse = new Horse(0, 0);
        ArrayList<int[]> possibleMoves = horse.possibleMoves();
        System.out.println("The possible moves for the horse are:");
        for (int[] move : possibleMoves) {
            System.out.println(move[0] + "," + move[1]);
        }
    }
}