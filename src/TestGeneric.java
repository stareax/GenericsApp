public class TestGeneric<T, R, Q> {
    private T obj;
    private R objR;
    private Q objQ;

    public TestGeneric(T оbj) {

    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void showType() {
        System.out.println("Тип T: " + obj.getClass().getName());
    }

}
