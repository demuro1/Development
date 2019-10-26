import sun.awt.HeadlessToolkit;

public class Zoo {
    public static void main (String args[]){

        Animal monkey = new Animal("Marvin","male","monkey","bananas",14,182,"Ooo ooo ahh ahh","climbs");
        Animal hippo = new Animal("Jane","female","hippopatamus","vegetation",58,583,"bellows","swims");
//        Bird crow = new Bird("Corvo","male","Bird","nuts and berries",3,12,"Cah's");
//        Bird toucan = new Bird("Sam","female","Bird","nuts and berries",6,42,"Cooooo");
//        Fish shark = new Fish("Bruce","male","fish","anything",56,380);
//        Fish swordfish = new Fish("Marlin","male","fish","other fish",16,175);

        monkey.eat();
        monkey.sleep();
        monkey.info();
        monkey.moves();
        monkey.speaks();

        hippo.eat();
        hippo.sleep();
        hippo.info();
        hippo.moves();
        hippo.speaks();

//        crow.eat();
//        crow.sleep();
//        crow.info();
//        crow.moves();
//        crow.speaks();
//
//        toucan.eat();
//        toucan.sleep();
//        toucan.info();
//        toucan.moves();
//        toucan.speaks();
//
//        shark.eat();
//        shark.sleep();
//        shark.info();
//        shark.moves();
//        shark.speaks();
//
//        swordfish.eat();
//        swordfish.sleep();
//        swordfish.info();
//        swordfish.moves();
//        swordfish.speaks();
    }
}
