package ruangong.classe;

public abstract class AbstractCourse {
    public final void createCourse() {
        deliver();
        ppt();
        video();
        uploadHomework();
        assign();
        if (needCheck()) {
            check();
        }
    }

    public void deliver() {
        System.out.println("发布资料");
    }

    public void ppt() {
        System.out.println("制作课件");
    }

    public void video() {
        System.out.println("在线直播");
    }

    public void uploadHomework() {
        System.out.println("上传作业");
    }

    public void assign() {
        System.out.println("布置作业");
    }

    public boolean needCheck() {
        return true;
    }

    public abstract void check();
}

