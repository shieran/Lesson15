public class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "BoxPrinter{" +
                "val=" + val +
                '}';
    }

//    public static void main(String[] args) {
//        BoxPrinter<Integer> v1 = new BoxPrinter<Integer>(10);
//        System.out.println(v1);
//        Integer intValue = (Integer)v1.getVal();
//        BoxPrinter<String> v2 = new BoxPrinter<String>("Hello World");
//        System.out.println(v2);
////        Integer intValue2 = (Integer)v2.getVal();
//    }
}
