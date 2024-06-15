package oop_home.family_tree;


public class Gender extends Human{

    private String gender;
    
    public Gender(String name, String surname, String gender){
        super(name, surname);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    
    @Override
    public String toString() {
        return super.toString() + "\nПол : " + gender;
    }


}
