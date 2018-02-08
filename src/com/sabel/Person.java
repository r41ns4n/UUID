package com.sabel;

public class Person extends Datensatz{

    // DATA FIELDS
    private String vorname;
    private String nachname;

    // CONSTRUCTORS
    public Person() {
        super();
    }

    public Person(String vorname, String nachname) {
        super();
        this.vorname = vorname;
        this.nachname = nachname;
    } // END CONSTRUCTORS

    // GETTER & SETTER
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    // toString
    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }

} // END CLASS PERSON
