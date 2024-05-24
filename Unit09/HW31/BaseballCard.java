public class BaseballCard {
    String name; // the name of the player on the card.
    int year; // the year the card was issued.

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        String s;
        s = this.getClass().getName() + ": [name: " + name + ", year: " + year + "]";
        return s;
        // ask mr. eng about the tostring method again lol
    }

    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) { // is the object a baseball card? every object has a get class
            return false;
        }
        BaseballCard otherCard = (BaseballCard) obj; // cast object as a baseball card
        if (this.name.equals(otherCard.name) && this.year == otherCard.getYear()) { // name of the card versus the name
                                                                                    // of the card being passed as an
                                                                                    // argument
            return true;
        } else {
            return false;
        }
    }
}