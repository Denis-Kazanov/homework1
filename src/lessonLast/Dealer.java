package lesson16;

public class Dealer extends Player {
    @Override
    public String needsCard() {
        int sum = 0;
        for(Card c:hand){
            sum = sum + c.getValue();
        }
        if(sum <= 19){
            return  "да";
        }
        else {
            return "нет";
        }
    }
}
