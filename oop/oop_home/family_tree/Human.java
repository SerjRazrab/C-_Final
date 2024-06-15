package oop_home.family_tree;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Human{
    private long id;
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private List<Human> parents ;
    private List<Human> children;



    public Human(String name, String surname,Gender gender,LocalDate birthDate,LocalDate deathDate,Human father,Human mother){
        id = -1;
        this.name=name;
        this.surname=surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        parents = new ArrayList<>();{
            if(father!=null){
                parents.add(father);
            }
            if(mother!=null){
                parents.add(mother);
            }
            children = new ArrayList<>();
        }
    
    }

    

    public Human(String name,String surname, Gender gender, LocalDate birthDate){
        
    }

    public Human(String name, String surname,Gender gender,LocalDate birDate,Human father,Human mother){
        

    }

    public boolean addChild(Human child){
        if(!children.contains(child)){
            children.add(child);
            return true;
        }
        return false;
    }

    public boolean addParent(Human parent){
        if(!parent.contains(parent)){
            parent.add(parent);
            return true;
        }
        return false;
    }

    public Human getFather(){
        for(Human parent:parents){
            if(parent.getGender()== Gender.Male){
                return parent;
            }
        }
        return null;
    }

    public Human getMother() {
        for (Human parent : parents) {
            if (parent.getGender() == Gender.Female) {
                return parent;
            }
        }
        return null;
    }

    public int getAge(){
        if(deathDate==null){
            return getPeriod(birthDate,LocalDate.now());
        } else {
            return getPeriod(birthDate,deathDate);
        }
    }

    private int getPeriod(LocalDate birthDate,LocalDate deathDate){
        Period diff = Period.between(birthDate,deathDate);
        return diff.getYears();
    }

    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public LocalDate getDeathDate(){
    return deathDate;
    }

    public  List<Human> getParents(){
        return parents;
    }

    public List<Human> getChildren(){
        return children;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    // @Override
    // public String toString() {
    //     return "Имя : " + name + ", Фамилия : " + surname ;
    // }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("id : ");
        sb.append(id);
        sb.append(", Имя : ");
        sb.append(name);
        sb.append(", Пол : ");
        sb.append(name);
        sb.append(", Возраст : ");
        sb.append(getAge());
        sb.append(", ");
        sb.append(getMotherInfo());
        sb.append(", ");
        sb.append(getFatherInfo());
        sb.append(", ");
        sb.append(getChildrenInfo());
        return sb.toString();
    }

    public String getMotherInfo(){
        String res = "Мама : ";
        Human mother = getMother();
        if(mother !=null){
            res+=mother.getName();
        }else{
            res+= "Неизвестна";
        }
        return res;
    }

    public String getFatherInfo() {
        String res = "Папа : ";
        Human father = getFather();
        if (father != null) {
            res += father.getName();
        } else {
            res += "Неизвестна";
        }
        return res;
    }

    public String getChildrenInfo() {
        StringBuilder res = new StringBuilder();
        res.append("Дети : ");
        if(children.size()!=0){
            res.append(children.get(0).getName());
            for(int i = 0;i < children.size();i++){
                res.append(", ");
                res.append(children.get(i).getName());
            } else {
                res.append("Отсутствуют : ");
            }
            return res.toString();
        }

        @Override
        public boolean equals(Object obj){
            if(this == obj){
                return true;
            }
            if(!(obj instanceof Human)){
                return false;
            }
            Human human = (Human) obj;
            return human.getId()==getId();
        }
    }
}


