package aula01.service;

import aula01.domain.Person;
import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private  PersonService personService;
    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18(){
        Assertions.assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult when age is greater or equal than 18")
    void isAdult_ReturnFalse_WhenAgeIsGreaterOrEqualsThan18(){
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void isAdult_ThrowException_WhenPersonIsNull(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.isAdult(null));
    }

    @Test
    @DisplayName("Should return list with only adult")
    void filterRemovingNotAdult_ReturnListWithAdultOnlu_WhenListOfPersonWithAdultIsPassed(){
        Person person1 = new Person(17);
        Person person2 = new Person(18);
        Person person3 = new Person(21);

        List<Person> persons = List.of(person1, person2, person3);

        Assertions.assertEquals(2, personService.filterRemovingNotAdult(persons).size());

    }
}