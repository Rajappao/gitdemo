class Singleton {
    private static Singleton single_instance = null;

    private Singleton()
    {
        System.out.println("Instance created");
    }
 
    public static synchronized Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
 
        return single_instance;
    }
}
 
class singleTonTest {
    public static void main(String args[])
    {
        Singleton x = Singleton.getInstance();
 
        Singleton y = Singleton.getInstance();
 
        Singleton z = Singleton.getInstance();

        System.out.println("x object hash code"
                           + x.hashCode());
        System.out.println("y object hash code"
                           + y.hashCode());
        System.out.println("z object hash code"
                           + z.hashCode());
 
        if (x == y && y == z) {
 
            System.out.println(
                "All ojects created pointing to the same memory location");
        }
 
        else {
            System.out.println(
                "Objects are not pointing to the same location");
        }
    }
}