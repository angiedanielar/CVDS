package edu.eci.cvds.tdd.registry;

/**
 * Person representation Class
 */
public class Person {

    /**
     * Person's name
     */
    private String name;

    /**
     * A person's identification number
     */
    private int id;

    /**
     * Person's age
     */
    private int age;

    /**
     * Person's gender
     */
    private Gender gender;
    
    /**
     * Flag to specify if a person is alive
     */
    private boolean alive;
    
    /**
     * Flag to specify if a person is an active military member
     */
    private boolean militar;
    
    /**
     * Flag to specify if a person is in prison
     */
    private boolean inPrisoned;

    /**
     * The class' default constructor
     */
    public Person() {
        super();
    }

    /**
     * A person constructor with all the information
     *
     * @param name the name
     * @param id the identification number
     * @param age the age
     * @param gender the gender
     * @param alive if the person is alive
     * @param militar if the person is an active military member
     * @param inPrisoned if the person is in prison
     */
    public Person(String name, int id, int age, Gender gender, boolean alive, boolean militar, boolean inPrisoned) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.alive = alive;
        this.militar= militar;
        this.inPrisoned= inPrisoned;
    }

    /**
     * Returns the person name
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the person identification number
     * 
     * @return the identification Number
     */
    public int getId() {
        return id;
    }

    /**
     * Returns this person's age
     * 
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the gender
     * 
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Returns if the person is alive
     * 
     * @return the alive
     */
    public boolean isAlive() {
        return alive;
    }
    
    /**
     * Returns if the person is an active military member
     * 
     * @return the militar
     */
    public boolean isMilitar() {
        return militar;
    }
    
    /**
     * Returns if the person is in prison
     * 
     * @return the alive
     */
    public boolean isInPrison() {
        return inPrisoned;
    }

    /**
     * Sets the person name
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the person identification number
     * 
     * @param id the identification Number to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the person age
     * 
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the person gender
     * 
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * Sets the flag to specify if this person is alive
     * 
     * @param alive the alive to set
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    /**
     * Returns if the person is an active military member
     * 
     * @return the militar
     */
    public boolean setMilitar(boolean militar) {
        return this.militar= militar;
    }
    
    /**
     * Returns if the person is in prison
     * 
     * @return the alive
     */
    public boolean setInPrison(boolean inPrison) {
        return this.inPrisoned= inPrison;
    }

    /**
     * @{inheritdoc}
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", alive=" + alive + ", militar" + militar + ", in prison" + inPrisoned +"]";
    }

}