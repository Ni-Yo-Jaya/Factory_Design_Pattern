public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type){

        if(type == "cheese"){
            return new NYStyleCheesePizza();
        }

        // else if................
        // else if................

        return null;
    }


}
