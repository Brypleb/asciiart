import java.util.Scanner;

public class asciiart {

    // art patterns for each character (3x5)
    private static String[][] asciiArtPatterns = {
        {"  A  ", " A A ", "AAAAA", "A   A", "A   A"},  
        {"BBBB ", "B   B", "BBBB ", "B   B", "BBBB "},  
        {" CCC ", "C    ", "C    ", "C    ", " CCC "},  
        {"DDDD ", "D   D", "D   D", "D   D", "DDDD "},  
        {"EEEEE", "E    ", "EEE  ", "E    ", "EEEEE"},  
        {"FFFFF", "F    ", "FFF  ", "F    ", "F    "}, 
        {" GGG ", "G    ", "G  GG", "G   G", " GGG "},  
        {"H   H", "H   H", "HHHHH", "H   H", "H   H"},  
        {" III ", "  I  ", "  I  ", "  I  ", " III "},  
        {"   J ", "    J", "    J", "J   J", " JJJ "},  
        {"K   K", "K  K ", "KKK  ", "K  K ", "K   K"},  
        {"L    ", "L    ", "L    ", "L    ", "LLLLL"},  
        {"M   M", "MM MM", "M M M", "M   M", "M   M"},  
        {"N   N", "NN  N", "N N N", "N  NN", "N   N"},  
        {" OOO ", "O   O", "O   O", "O   O", " OOO "},  
        {"PPPP ", "P   P", "PPPP ", "P    ", "P    "},  
        {" QQQ ", "Q   Q", "Q   Q", "Q  Q ", " QQQQ"},  
        {"RRRR ", "R   R", "RRRR ", "R  R ", "R   R"},  
        {" SSS ", "S    ", " SSS ", "    S", " SSS "},  
        {"TTTTT", "  T  ", "  T  ", "  T  ", "  T  "},  
        {"U   U", "U   U", "U   U", "U   U", " UUU "},  
        {"V   V", "V   V", "V   V", " V V ", "  V  "},  
        {"W   W", "W   W", "W W W", "WW WW", "W   W"},  
        {"X   X", " X X ", "  X  ", " X X ", "X   X"},  
        {"Y   Y", " Y Y ", "  Y  ", "  Y  ", "  Y  "},  
        {"ZZZZZ", "   Z ", "  Z  ", " Z   ", "ZZZZZ"},  
        {"     ", "     ", "     ", "     ", "     "}   
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string:");
        String input = scanner.nextLine().toUpperCase();

        // print each line
        for (int i = 0; i < 5; i++) {  // print each row
            for (char c : input.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    System.out.print(asciiArtPatterns[c - 'A'][i] + " ");
                } else if (c == ' ') {
                    System.out.print(asciiArtPatterns[26][i] + " ");  
                } else {
                    System.out.print("????? ");
                }
            }
            System.out.println(); // New line after row
        }
    }
}
