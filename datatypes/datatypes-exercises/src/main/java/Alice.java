import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {

        String paragraph = """
                Alice was beginning to get very tired of sitting by her sister on the bank, and of having
                nothing to do: once or twice she had peeped into the book her sister was reading,
                but it had no pictures or conversations in it, ‘and what is the use of a book,’
                thought Alice ‘without pictures or conversation?’
                """;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word or phrase to search.");

        String subString = input.nextLine();
        String lowerPara = paragraph.toLowerCase();
        String lowerSubstring = subString.toLowerCase();
        Integer index = lowerPara.indexOf(lowerSubstring);
        Integer length = subString.length();
        String newSentence = paragraph.substring(0, index).concat(paragraph.substring(index + length));

        System.out.println(lowerPara.contains(lowerSubstring));
        System.out.printf("""
                        %s can be found at index %s and is %s characters long.
                        
                            Let's cut your search term out and see how the paragraph looks.
                            
                        """, subString, index, length);
        System.out.println(newSentence);
        input.close();

    }

}
