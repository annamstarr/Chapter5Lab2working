public class CompareDriver
{
    public static void main(String[] args) {
        String st1 = new String("hi");
        String st2 = new String("bye");
        
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        
        // compares h to b; returns positive because h is larger; prints hi
        System.out.println(Compare1.largest(st1, st2));
        // compares h to b; returns positive because h is larger; prints hi
        System.out.println(Compare3.largest(st1, st2));
        // compares 1 to 2 and 2 is larger so prints 2
        System.out.println(Compare3.largest(i1, i2));
    }
}
