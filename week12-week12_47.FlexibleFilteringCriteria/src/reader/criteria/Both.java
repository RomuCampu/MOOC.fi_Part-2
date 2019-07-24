package reader.criteria;

public class Both implements Criterion {

    private Criterion obj1;
    private Criterion obj2;

    public Both(Criterion obj1, Criterion obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public boolean complies(String line) {
        return obj1.complies(line) && obj2.complies(line);
    }
}
