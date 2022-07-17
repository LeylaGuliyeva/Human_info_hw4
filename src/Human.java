public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String schedule[][];
    public void greetPet(){
        System.out.println("Hello, "+pet.nickname);
    }
    public void describePet(){
        System.out.print(" I have a "+pet.species+", he is "+pet.age+" years old, he is ");
        if(pet.trickLevel>50){
        System.out.println("very sly");
    }
        else if(pet.trickLevel<50){
            System.out.println("almost non sly");
        }
        }
    public String toString(){
        return String.format("Human{name=$s, surname=%s, year=%d, iq=%d, mother=%s, father=$s, %s}",
                this.name, this.surname, this.year, this.iq, this.mother.name + " " + this.mother.surname, this.father.name + " " + this.father.surname, this.pet.toString());
    }


    Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    Human(String name, String surname, int year, byte iq, Pet pet, Human mother, Human father, String schedule[][]) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    Human() {

    }

}
