package ruangong.classe;

public class CourseWithoutCheck extends AbstractCourse {
    @Override
    public boolean needCheck() {
        return false;
    }

    @Override
    public void check() {
        // do nothing
    }
}
