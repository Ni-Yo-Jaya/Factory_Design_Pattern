import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    ArrayList toppings = new ArrayList();
    String sauce;

    void prepare(){

        System.out.println("Preparing "+ name);
        System.out.println("Tossing dough "+ dough);
        System.out.println("Adding Toppings...");

        for(int i =0; i < toppings.size(); i++){
            System.out.println(" "+toppings.get(i));
        }

    }

   
    public void bake(){
        System.out.println("Bake for 30 min in 350 degrees");
    }

    public String getName(){
        return name;
    }

}
