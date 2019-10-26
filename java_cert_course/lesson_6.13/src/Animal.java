public class Animal {

    public String name;
    public String gender;
    public String animalType;
    public String food;
    public int ageInYears;
    public int weightInPounds;
    public String speak;
    public String move;

    public Animal(String name,String gender,String animalType,String food,int ageInYears,int weightInPounds,String speak, String move){
        this.name = name;
        this.gender = gender;
        this.animalType = animalType;
        this.food = food;
        this.ageInYears = ageInYears;
        this.weightInPounds = weightInPounds;
        this.speak = speak;
        this.move = move;
    }
    public void eat(){
        System.out.println(name + ", the " + animalType + " ate some " + food);
    }


    public void sleep(){
        System.out.println("The " + weightInPounds + " pound " + animalType + " named " + name + " goes to sleep.");
    }


    public void info(){
        System.out.println(name + ", is a  " + ageInYears + "year old" + gender + " " + animalType);
    }

    public void moves() {
        System.out.println(name + " " + move);
    }

    public void speaks() {
        System.out.println(name + " " + speak);
    }

}
