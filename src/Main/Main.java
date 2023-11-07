public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        Member[] member = new Member[2];
        member[0] = new Member("Ahil", "Khan", "ahil_khan@gmail.com",
                "2356784521", "145623");
        member[1] = new Member("Aiza", "Kureshi", "aiza_kureshi@gmail.com",
                "3356784521", "146623");
        Staff[] staff = new Staff[2];
        staff[0] = new Staff("Rida", "Sheikh", "rida_sheikh@gmail.com",
                "9945623567", "1234506789", "Librarian", "Management");
        staff[1] = new Staff("zayaan", "Sheikh", "rida_sheikh@gmail.com",
                "9935623567", "1234606789", "Manager", "Management");
        Librarian librarian = new Librarian("Rida", "Sheikh", "rida_sheikh@gmail.com",
                "9945623567", "1234506789", "Librarian", "admin");
        Manager manager = new Manager("zayaan", "Sheikh", "rida_sheikh@gmail.com",
                "9945623567", "1234506789", "Librarian", "admin");
        Item[] item = new Item[5];
        Book[] book = new Book[2];
        book[0] = new Book("Drink the Northeast : the ultimate guide to breweries, distilleries," +
                "and wineries in the Northeast", "112345", "33934004428331", "DeVito, Carlo",
                "travel", "New York : Simon & Schuste");
        book[1] = new Book("Reasons not to worry : how to be Stoic in chaotic times", "122134",
                "33934004674165", "Delaney, Brigid,",
                "Self-help Publications", " New York : Harper, an imprint of HarperCollins Publishers");
        Magazine[] magazine = new Magazine[2];
        magazine[0] = new Magazine("Northshore Magazine. 2022", "339340048",
                "Andover, Mass.", "Social life and customs");
        magazine[1] = new Magazine("Babybug. 2022", "235648723",
                "Peru, Ill.", "Children's literature");
        Newspaper[] newspaper = new Newspaper[1];
        newspaper[0] = new Newspaper("Times Now", -2012);
        Library library = new Library("njh", "nds", "", "");
    }
}