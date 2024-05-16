package lec7_kjs;

public class Jobber {
    String firstName;
    String lastName;
    int salary;
    int id;
    
    @Override
    public String toString() {
        return String.format("id:%d fn: %s ln:%s s:%d ",id,firstName,lastName, salary);
        
    }
    @Override
    public boolean equals(Object o) {
        Jobber t = (Jobber) o;
        return id ==t.id && firstName == t.firstName;
    }
    @Override
    public int hashCode() {
        return id;
    }
    }
    

