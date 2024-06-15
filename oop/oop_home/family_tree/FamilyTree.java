package oop_home.family_tree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private long humansId;
    private List<Human> humanList;

    public FamilyTree(){this(new ArrayList<>());}

    public FamilyTree(List<Human> humanList){this.humanList = humanList;}

    public boolean add(Human human){
        if(human==null){
            return false;
        }
        if(!humanList.contains(human)){
            humanList.add(human);
            human.setId(humansId++);


            addToParents(human);
            addToChildren(human);

            return true;
        }
        return false;
    }

    private void addToParents(Human human){
        for(Human parent:human.getParents()){
            parent.addChild(human);
        }
    }

    private void addToChildren(Human human){
        for(Human child:human.getChildren()){
            child.addParent(human);
        }
    }

    public List<Human> getSiblings(int id){
        Human human = getById(id);
        if(human==null){
            return null;
        }
        List<Human> res = new ArrayList<>();
        for(Human parent:human.getParents()){
            for(Human child:parent.getChildren()){
                if(!child.equals(human)){
                    res.add(child);
                }
            }
        }
        return res;
    }

    public List<Human> getByName(String name){
        List<Human> res = new ArrayList<>();
        for(Human human:humanList){
            if(human.getName().equals(name)){
                res.add(human);
            }
        }
        return res;
    }

    public boolean setWeddibg(long humanId1,long humanId2){
        if(checkId(humanId1)&& checkId(humanId2)){
            Human human1 = getById(humanId1);
            Human human2 = getById(humanId2);
            if(human1.getSpouse()==null && human2.getSpouse()==null){
                human1.setSpouse(human2);
                human2.setSpouse(human1);
            } else {
                return false;
            }

        }
        return false;
    }

    public boolean setDivorce(long humanId2, long humanId2){
        if(checkId(humanId1)&& checkId(humanId2)){
            Human human1 = getById(humanId1);
            Human human2 = getById(humanId2);
            if(human1.getSpouse()!=null && human2.getSpouse()!=null){
                human1.setSpouse(null);
                human2.setSpouse(null);
            } else  {
                return false;
            }
        }
        return false;
    }

    public boolean remove(long humansId){
        if(checkId(humansId)){
            Human human = getById(humansId);
            return humanList.remove(human);
        }
        return false;
    }

    private boolean checkId(long id){
        return id < humansId && id >=0;
    }

    public Human getById(long id){
        for(Human human : humanList){
            if(human.getId()==id){
                return human;
            }
        }
        return null;
    }

    @Override
    public String toString(){return getInfo();}

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("В древе ");
        sb.append(humanList.size());
        sb.append("объектов : \n");
        for (Human human : humanList){
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }
}





    // private List<Human> humanList;

    // public FamilyTree(){
    //     humanList=new ArrayList<>();
    // }

    // public void addHuman(Human human){
    //     humanList.add(human);
    // }

    // public Human findHumanByName(String nameHuman){
    //     for(Human human : humanList){
    //         if(human.getName().equalsIgnoreCase(nameHuman)){
    //             return human;
    //         }
    //     }
    //     return null;
    }


    @Override
    public String toString() {
        return "  <<< Семейное дерево >>> \n<<< Список родственников >>>\n" + humanList + "";
    }

    

}