package HomeworkTwo;

public class MainThree {

    public static void main(String[] args) {

        Car car = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car.brands = "Audi";
        car.colors = new String[]{"blue", "red", "black"};

        System.out.println(car.brands);
        System.out.println(car.colors[0]);

        car2.brands = "BMW";
        car2.colors = new String[]{"orange", "black", "purple"};

        System.out.println(car2.brands);
        System.out.println(car2.colors[1]);

        car3.brands = "KIA";
        car3.colors = new String[]{"yellow", "grey", "white"};

        System.out.println(car3.brands);
        System.out.println(car3.colors[2]);

        for (String def : car2.colors) {
            System.out.println(def);
        }
        System.out.println(car.colors[2].equals("green"));
    }
}
