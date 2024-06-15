package oop_home.family_tree;

import javax.imageio.spi.ServiceRegistry;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        //Human human1 = new Human("Сергей", "Кокшаров");
        Human human2 = new Gender("Сергей", "Кокшаров", "Муж");





        //familyTree.addHuman(human1);
        familyTree.addHuman(human2);
        System.out.println(familyTree);
    }
}
