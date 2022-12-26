package ss03_array_and_mothod_array.exercise;

public class kututrongchuoi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sentence = "I am the most handsome man in the world!!!";
        String[] toArray = sentence.split("");
        int count = 0;
        System.out.println("Enter the word you want to count : ");
        String word = scanner.nextLine();
        for (int i = 0; i < toArray.length; ++i) {
            if (toArray[i].equals(word)) {
                count++;
            }
        }
        System.out.println(sentence);
        System.out.println("The times of " + word + " is : " + count);
    }

}
