//Autor: Greimel David
//Klasse 2a APC | Lehrgang 1 | 12.09.2023
public class Person {
    // Private Attribute zur Speicherung von Nachname, Vorname und Alter
    private String name;
    private String firstName;
    public int age;

    // Konstruktor um Nachname und Vorname beim Erstellen einer Person festzulegen
    public Person(String ln, String fn) {
        this.name = ln;
        this.firstName = fn;
    }

    // Standardkonstruktor um eine leere Person mit 0 Alter zu erstellen
    public Person() {
        this.name = "";
        this.firstName = "";
        this.age = 0;
    }

    // Private Methode zur Aktualisierung von Nachname und Vorname
    private void setName(String ln, String fn) {
        this.name = ln;
        this.firstName = fn;
    }

    // Methode zur Rückgabe vom fullName
    public String fullName() {
        return firstName + " " + name;
    }
}
