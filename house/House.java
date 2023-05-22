package ruangong.house;

public class House extends AbstractHouse {

    // 修建地暖
    public void installFloorHeating() {
        System.out.println("修建地暖");
    }

    // 重写父类的方法，定义建造流程
    @Override
    public void prepareMaterials() {
        super.prepareMaterials();
        System.out.println("准备家居材料");
    }

    // 重写父类的方法，定义建造流程
    @Override
    public void buildRoof() {
        System.out.println("盖瓦");
    }

    // 自定义流程，按顺序执行房子的每个阶段
    public void buildHouse() {
        prepareMaterials();
        layFoundation();
        masonry();
        installFloorHeating();
        buildRoof();
    }
}
