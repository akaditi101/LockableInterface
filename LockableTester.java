/**
 * LockableTester.java  09/19/04
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 0000000
 *
 * @author - I received help from ...
 *
 */


public class LockableTester
{
    public static void main(String[] args)
    {
        Coin c = new Coin();
        System.out.println("C is heads: " + c.isHeads());
        c.setKey(100);
        c.lock(100);
    System.out.println("C should be locked, and the Coin is locked: " + c.isLocked());
        c.unlock(300);
        //c.isHeads();
        //c.toString();
        //c.setKey();
        //c.flip();
        System.out.println("C should still be locked, and the Coin is locked: " + c.isLocked());
        //c.toString();
        c.unlock(100);
        System.out.println(c.isHeads());
        c.flip();
        System.out.println(c);
        c.setKey(8938);
        System.out.println("C should be unlocked, and the Coin is locked: " + c.isLocked());
        System.out.println(c);
        c.flip();
        System.out.println(c);
        
    }
}
