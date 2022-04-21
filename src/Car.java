import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Car {

    int typeCar;
    int liteCar = 100;
    int cuvCar = 150;
    int cargoCar = 200;
    int numberWheel;
    int radiusWheel;
    String car;

    public void setTypeCars() {
        LinkedList<String> cars = new LinkedList<>();
        while (true) {

            Map<Integer, Integer> radiusPriceMap = new HashMap<>();
            {
                radiusPriceMap.put(13, 1200);
                radiusPriceMap.put(14, 1400);
                radiusPriceMap.put(15, 1600);
                radiusPriceMap.put(16, 1800);
                radiusPriceMap.put(17, 2000);
                radiusPriceMap.put(18, 2200);
                radiusPriceMap.put(19, 2300);
                radiusPriceMap.put(20, 2400);
                radiusPriceMap.put(21, 2450);
            }
            System.out.println("Для создания Новово автомобиля введите 1");
            Scanner addList = new Scanner(System.in);
            int inputAddCar = addList.nextInt();
            if (inputAddCar == 1) {


                System.out.println("Задайте тип автомобиля. 1 - Легковой. 2 - Паркетник. 3 - Грузовой");
                int inputTypeCar = addList.nextInt();
                {
                    if (inputTypeCar == 1) typeCar = liteCar;
                    else if (inputTypeCar == 2) typeCar = cuvCar;
                    else if (inputTypeCar == 3) typeCar = cargoCar;

                    System.out.println("Укажите кол-во колёс");
                    int inputNumberWheel = addList.nextInt();
                    {
                         if (inputNumberWheel >= 1) numberWheel = inputNumberWheel;

                    }
                    System.out.println("Укажите радиус колёс от 13 до 21");
                    int inputRadiusWheel = addList.nextInt();{

                        if (inputRadiusWheel >= 13 && inputRadiusWheel <= 21) radiusWheel = inputRadiusWheel;
                        car = String.valueOf(typeCar + numberWheel * radiusPriceMap.get(radiusWheel));
                        cars.add(car);
                        System.out.println(cars);
                    }
                }
            }
                if (inputAddCar == 9)
                    break;
        }
    }
}
