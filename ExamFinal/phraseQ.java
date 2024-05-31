public class phraseQ {

    public static void main(String[] args) {

        String phrase = "Derryfield";

        for (int i = 0; i < phrase.length() - 2; i++) {
            System.out.print(phrase.charAt(i) + " | ");
        }
        System.out.println(phrase.charAt(phrase.length() - 1));
        System.out.println("is the best!");

    }
}
