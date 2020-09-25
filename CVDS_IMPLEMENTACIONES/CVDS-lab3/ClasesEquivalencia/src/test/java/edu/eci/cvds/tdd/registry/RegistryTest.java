package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResultDeadPerson() {

        Person person = new Person("Ernesto", 1, 21, Gender.MALE, false, false, false);
        
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validateRegistryResultValidPerson() {

        Person person = new Person("Ernesto", 1, 18, Gender.MALE, true, false, false);
        
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void validateRegistryResultInvalidAge() {

        Person person = new Person("Daniela", 1, -1, Gender.UNIDENTIFIED, true, false, false);
        
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void validateRegistryResultUnderAge() {

        Person person = new Person("Daniela", 1, 17, Gender.UNIDENTIFIED, true, false, false);
        
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void validateRegistryResultAlivePerson() {

        Person person = new Person("Ernesto", 1, 19, Gender.MALE, true, false, false);
        
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void validateRegistryResultMilitar() {

        Person person = new Person("Ernesto", 1, 21, Gender.MALE, true, true, false);
        
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.MILITAR, result);
    }
    
    @Test
    public void validateRegistryResultInPrison() {

        Person person = new Person("Daniela", 1, 20, Gender.UNIDENTIFIED, true, false, true);
        
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INPRISON, result);
    }
}