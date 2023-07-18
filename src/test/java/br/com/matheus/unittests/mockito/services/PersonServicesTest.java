package br.com.matheus.unittests.mockito.services;

import br.com.matheus.model.Person;
import br.com.matheus.repository.PersonRepository;
import br.com.matheus.services.PersonServices;
import br.com.matheus.unittests.mapper.mocks.MockPerson;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@ExtendWith(MockitoExtension.class)
class PersonServicesTest {

    MockPerson input;

    @InjectMocks
    private PersonServices service;
    @Mock
    PersonRepository repository;

    @BeforeEach
    void setUpMocks() throws Exception{
        input = new MockPerson();
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindById() {
        Person person = input.mockEntity(1);
        person.setId(1L);

        when(repository.findById(1L)).thenReturn(Optional.of(person));

        var result = service.findById(1L);
        assertNotNull(result);
        assertNotNull(result.getKey());
        assertNotNull(result.getLinks());
        assertTrue(result.toString().contains("links: [</api/person/v1/1>;rel=\"self\"]"));
        assertEquals("First Name Test1", result.getFirstName());
        assertEquals("Last Name Test1", result.getLastName());
        assertEquals("Addres Test1", result.getAddress());
        assertEquals("Female", result.getGender());
    }

    @Test
    void findAll() {
        fail("Fail");
    }


    @Test
    void create() {
        fail("Fail");
    }

    @Test
    void update() {
        fail("Fail");
    }

    @Test
    void delete() {
        fail("Fail");
    }
}