//you should always check if the number you want to scan in is a number
while (in.hasNextLine()) {
    String line = in.nextLine();
    Scanner lineScanner = new Scanner(line);
    lineScanner.useDelimiter("[,\\n]+");
    String dept = lineScanner.next();
    String manager = lineScanner.next();
    double expense;
    if (lineScanner.hasNextDouble()) {
        expense = lineScanner.nextDouble();
    } else {
        // skip over the "n/a"
        lineScanner.next();
        expense = 0.0;
    }
    System.out.printf("%-17s | %-10s | $%10.2f%n", dept, manager, expense);
}



//if you need to replace and commas while reading in a long number
String nextWord = lineScanner.next().trim();
nextWord = nextWord.replaceAll(",", "");
double gdp = Double.valueOf(nextWord);
