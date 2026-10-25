public class Bingo
{
    private char letter;
    private int number;

    public Bingo()
    {
        int column = (int)(Math.random() * 5);

        if (column == 0)
        {
            letter = 'B';
            number = (int)(Math.random() * 15) + 1;
        }
        else if (column == 1)
        {
            letter = 'I';
            number = (int)(Math.random() * 15) + 16;
        }
        else if (column == 2)
        {
            letter = 'N';
            number = (int)(Math.random() * 15) + 31;
        }
        else if (column == 3)
        {
            letter = 'G';
            number = (int)(Math.random() * 15) + 46;
        }
        else
        {
            letter = 'O';
            number = (int)(Math.random() * 15) + 61;
        }
    }

    public Bingo(char newLetter, int newNumber)
    {
        if (isValid(newLetter, newNumber))
        {
            letter = Character.toUpperCase(newLetter);
            number = newNumber;
        }
        else
        {
            letter = 'N';
            number = 0;
        }
    }

    public char getLetter()
    {
        return letter;
    }

    public int getNumber()
    {
        return number;
    }

    public void setLetter(char newLetter)
    {
        if (isValid(newLetter, number))
        {
            letter = Character.toUpperCase(newLetter);
        }
        else
        {
            letter = 'N';
            number = 0;
        }
    }

    public void setNumber(int newNumber)
    {
        if (isValid(letter, newNumber))
        {
            number = newNumber;
        }
        else
        {
            letter = 'N';
            number = 0;
        }
    }

    private boolean isValid(char testLetter, int testNumber)
    {
        testLetter = Character.toUpperCase(testLetter);

        if (testLetter == 'B')
            return testNumber >= 1 && testNumber <= 15;

        else if (testLetter == 'I')
            return testNumber >= 16 && testNumber <= 30;

        else if (testLetter == 'N')
            return testNumber >= 31 && testNumber <= 45;

        else if (testLetter == 'G')
            return testNumber >= 46 && testNumber <= 60;

        else if (testLetter == 'O')
            return testNumber >= 61 && testNumber <= 75;

        return false;
    }

    public String toString()
    {
        if (letter == 'N' && number == 0)
        {
            return "N, FREE";
        }

        return letter + ", " + number;
    }
}