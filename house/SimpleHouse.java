package ruangong.house;

public class SimpleHouse extends AbstractHouse {

    // 重载抽象类的方法，自定义流程
    @Override
    public void buildRoof() {
        System.out.println("盖铁皮");
    }

    // 自定义流程，按顺序执行房子的每个阶段
    public void buildHouse() {
        prepareMaterials();
        layFoundation();
        masonry();
        buildRoof();
    }
}
