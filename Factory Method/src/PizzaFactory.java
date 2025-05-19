public class PizzaFactory{
    Pizza pizza;

    public Pizza createPizza(String type) {

        if (type == "cheese") {
            pizza = new CheesePizza();
        } else if (type == "pepperoni") {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }

}
