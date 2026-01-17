package factory;

public class Main {

    static void main() {
        Developer b1= DeveloperFactory.getDeveloper("back");
        Developer f1= DeveloperFactory.getDeveloper("front");

        System.out.println(b1.getClass());
        System.out.println(f1.getClass());

    }
}
