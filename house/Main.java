package ruangong.house;

public class Main {

    public static void main(String[] args) {
        // 使用 House 建造者造房子
        House house = new House();
        house.buildHouse();

        System.out.println("--------------------");

        // 使用 SimpleHouse 建造者造房子
        SimpleHouse simpleHouse = new SimpleHouse();
        simpleHouse.buildHouse();
    }

}
