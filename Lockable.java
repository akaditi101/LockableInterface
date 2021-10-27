/**
 * Lockable.java  1/30/2015
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 */

public interface Lockable
{
    void setKey(int k);
    void lock(int key);
    void unlock(int key);
    boolean isLocked();
}