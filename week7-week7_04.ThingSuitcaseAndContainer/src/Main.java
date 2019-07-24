
public class Main {

    public static void main(String[] args) {
      Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        Thing heaviest = suitcase.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
        
        int brickWeight = 1;
        while(true) {
            Suitcase suitcase = new Suitcase(brickWeight);
            Thing brick = new Thing("brick", brickWeight);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            
            if(brickWeight == 100) {
                break;
            }
            brickWeight += 1;
        }
    }
}
