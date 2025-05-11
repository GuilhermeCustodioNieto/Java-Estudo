package aula01;

import aula01.domain.Person;
import aula01.service.PersonService;

public class Aula01 {
    public static void main(String[] args) {
        Person person = new Person(15);

        PersonService personService = new PersonService();
        System.out.println("Is adult? " + (personService.isAdult(person) ? "true" : "false"));
    }
}
