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
  @Override
    public String toString(){
        return "Human{name='" + this.name + "', surname='" + this.surname + "', year=" + this.year + ", iq=" + this.iq + ", mother='" + (this.mother != null ? this.mother.name + " " + this.mother.surname : "null") + "', father='" + (this.father != null ? this.father.name + " " + this.father.surname : "null") +"', pet=" + this.pet + "}";
    }


    Human() {

    }
    Human(String nm, String snm, int yr) {
        this.name = nm;
        this.surname = snm;
        this.year = yr;
    }
    Human(String nm, String snm, int yr, Human mr, Human fr) {
        this.name = nm;
        this.surname = snm;
        this.year = yr;
        this.mother = mr;
        this.father = fr;
    }

    Human(String nm, String snm, int yr, byte iq, Pet pet, Human mr, Human fr, String sdle[][]) {
        this.name = nm;
        this.surname = snm;
        this.year = yr;
        this.mother = mr;
        this.father = fr;
        this.iq=iq;
        this.pet=pet;
        this.schedule=sdle;
    }

}
