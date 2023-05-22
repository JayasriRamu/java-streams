class A<T1,T2>{

    private T1 obj1;
    private T2 obj2;

    public void set(T1 obj1, T2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print() {
        System.out.println(obj1 + "  Obj 2 " + obj2);
    }

    A() {

    }

    public void show(T1 t1, T2 t2) {
        System.out.println("From show " + t1 + "  t " + t2);
    }
}

class Example<T> {
    private T obj;

    public void set(T t) {
        this.obj = t;
    }

    public T get() {
        return obj;
    }

}


 class Example1
{
    public <T> void printData(T data)
    {
        System.out.println("Data is = "+ data);
    }
    public <T> T checkData(T data)
    {
        return data;
    }
}
public class TestGeneric {
    public static void main(String args[]) {
        Example1 ex1=new Example1();

        Integer i=Integer.valueOf(10);
        ex1.printData(i);
        ex1.printData(20);

        ex1.printData("hello");




        // A<Float, String> a = new A<Float,String>();
        // a.show(10f, "hello");
        // // a.show("hello");
        // A<String, Float> b = new A<String, Float>();
        // b.show("hello", 76.34f);

        // Example<Integer> example = new Example<Integer>();
        // example.set(1);
        // // example.set("JavaGoal"); //Compile time error
        // System.out.println(example.get());

    }
}
