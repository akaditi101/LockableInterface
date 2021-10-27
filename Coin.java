/**
 * Coin.java  09/19/04
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id 0000000
 *
 * @author - I received help from ...
 *
 */

//********************************************************************
//  Coin.java       Author: Lewis/Loftus/Cocking
//
//  Represents a coin with two sides that can be flipped.
//
//  IMPORTANT NOTE:  Methods of this class need to throw an
//                   IllegalAccessError exception when a client
//                   tries to execute a locked method.
//                   Use the IllegalAccessError constructor that
//                   specifies a message.  The message should be
//                   "... method is locked" where ... is the actual
//                   method name.
//********************************************************************

public class Coin implements Lockable
{
    private static final int HEADS = 0;
    private static final int TAILS = 1;
    private int key;
    private boolean locked;
    private int face;

    //-----------------------------------------------------------------
    //  Sets up the coin by flipping it initially.
    //-----------------------------------------------------------------
    public Coin()
    {
        flip();
        key = 0;
        locked = false;
    }

    //-----------------------------------------------------------------
    //  Flips the coin by randomly choosing a face value.
    //-----------------------------------------------------------------
    public void flip()
    {
        if (isLocked())
          throw new IllegalAccessError("can't flip - Coin is locked");
        else
          face = (int)(Math.random() * 2);
    }

    //-----------------------------------------------------------------
    //  Returns true if the current face of the coin is heads.
    //-----------------------------------------------------------------
    public boolean isHeads()
    {
        if (isLocked())
          throw new IllegalAccessError("can't determine if coin is facing heads - Coin is locked");
        else
            return face == HEADS;
    }

    //-----------------------------------------------------------------
    //  Returns the current face of the coin as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        if (isLocked())
          throw new IllegalAccessError("can't create a string about the coin - Coin is locked");
        else{
            String faceName;
            if (face == HEADS)
                faceName = "Heads";
            else
                faceName = "Tails";
    
            return faceName;// + "Key: " + key + "\nThis object is Locked:" + locked;
        }
    }
    
    public void setKey(int k)
    {
        if (isLocked())
          throw new IllegalAccessError("can't do set the key - Coin is locked");
        else
          key = k;
    }
    
    public void lock(int k)
    {
        if (key == k)
            locked = true;
    }
    
    public void unlock(int k)
    
    {
        if (key == k)
            locked = false;
        
    }
    
    public boolean isLocked()
    {
        return locked;
    }
}
