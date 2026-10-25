public class BingoDriver
{
    public static void main(String[] args)
    {
        // Display a heading for the random Bingo calls
        System.out.println("20 Random Bingo Calls");
        System.out.println("---------------------");

        // Create and display 20 random Bingo calls
        // The default constructor is used each time
        for (int i = 1; i <= 20; i++)
        {
            Bingo call = new Bingo();
            System.out.println(call);
        }

        // Display a heading for valid constructor tests
        System.out.println();
        System.out.println("Valid Constructor Tests");
        System.out.println("-----------------------");

        // Test the B column using the lowest, middle,
        // and highest valid values
        System.out.println(new Bingo('B', 1));
        System.out.println(new Bingo('B', 7));
        System.out.println(new Bingo('B', 15));

        // Test the I column
        System.out.println(new Bingo('I', 16));
        System.out.println(new Bingo('I', 23));
        System.out.println(new Bingo('I', 30));

        // Test the N column
        System.out.println(new Bingo('N', 31));
        System.out.println(new Bingo('N', 38));
        System.out.println(new Bingo('N', 45));

        // Test the G column
        System.out.println(new Bingo('G', 46));
        System.out.println(new Bingo('G', 53));
        System.out.println(new Bingo('G', 60));

        // Test the O column
        System.out.println(new Bingo('O', 61));
        System.out.println(new Bingo('O', 68));
        System.out.println(new Bingo('O', 75));

        // Display a heading for invalid constructor tests
        System.out.println();
        System.out.println("Invalid Constructor Tests");
        System.out.println("-------------------------");

        // Test an invalid letter
        // Invalid values should default to N, FREE
        System.out.println(new Bingo('X', 10));

        // Test an invalid number for each valid letter
        System.out.println(new Bingo('B', 42));
        System.out.println(new Bingo('I', 11));
        System.out.println(new Bingo('N', 60));
        System.out.println(new Bingo('G', 20));
        System.out.println(new Bingo('O', 10));
    }
}