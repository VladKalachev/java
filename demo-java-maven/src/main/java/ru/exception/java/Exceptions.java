package ru.exception.java;

import ru.exception.java.Person;

public class Exceptions {

    private Person getPerson() {
        Person p = new Person("Ivan");
        return p;
    }

    private Person getPerson2() {
        Person p = null;
        return p;
    }

    private void print(Person p) {
        System.out.println(p.toString());
    }

    class PersonNotFoundException extends Exception {

    }

    private void processPerson(Person p) throws PersonNotFoundException {
        if(p == null){
            throw new PersonNotFoundException();
        }
    }

    private void doProcessing() throws PersonNotFoundException {
        Person p = getPerson();
        processPerson(p);
    }

    public static void main(String[] args) {
        Exceptions e = new Exceptions();

        e.print(e.getPerson());
        // e.print(e.getPerson2());

        try {
            e.doProcessing();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
