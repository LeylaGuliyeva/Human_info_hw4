public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String habits[];
    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.println("Hello, owner. I am "+nickname+". I miss you");
    }
    public void foul(){
        System.out.println("I need to cover it up.");
    }
    public String toString() {
        return String.format("%s{nickname=%s, age=5, trickLevel=%d, habits=%s}",
                this.species, this.nickname, this.trickLevel, this.habits);
    }
    Pet(){
    }
    Pet(String sp,String nnm){
        this.species=sp;
        this.nickname=nnm;

    }
    Pet(String sp,String nnm,int a,int tl,String hbt[]){
        this.species=sp;
        this.nickname=nnm;
        this.age=a;
        this.trickLevel=tl;
        this.habits=hbt;
    }


}
