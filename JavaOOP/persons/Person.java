package persons;

public class Person implements CompareObject, Comparable<Person> {
    private String firstName;
    private String lastName;
    
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String toString() {
        return firstName + " " + lastName;
    } 
    
    public int compareTo(CompareObject obj) {
        if(!(obj instanceof Person))
            return -1;
        
        int res = lastName.compareTo(((Person)obj).lastName);
        if(res != 0)
            return res;
        
        return firstName.compareTo(((Person)obj).firstName);
    }

    @Override
    public int compareTo(Person o) {
        int res = lastName.compareTo(o.lastName);
        if(res != 0)
            return res;

        return firstName.compareTo(o.firstName);
    }
}