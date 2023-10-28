package j110.lab2.university;

public enum Gender {

    M("He", "His"),
    F("She", "Her");

    private String pronoun;
    private String pronounPrit;

    Gender(String pronoun, String pronounPrit) {
        this.pronoun = pronoun;
        this.pronounPrit = pronounPrit;
    }

    public String getPronoun() { return pronoun; }
    public String getPronounPrit() { return pronounPrit; }
}