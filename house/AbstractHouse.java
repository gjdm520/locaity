package ruangong.house;

public abstract class AbstractHouse {

    // 准备材料
    public void prepareMaterials(){
        System.out.println("准备材料");
    }

    // 打地基
    public void layFoundation(){
        System.out.println("打地基");
    }

    // 砌墙
    public void masonry(){
        System.out.println("砌墙");
    }

    // 盖屋顶
    public void buildRoof(){
        System.out.println("盖屋顶");
    }

}
