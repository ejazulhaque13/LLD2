package LLD2_4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class dbconn {
    private dbconn(){
    }
    private static dbconn inst;
    public static Lock lock = new ReentrantLock();
    public static dbconn getInstance(){
        if(inst==null){
            lock.lock();
            if(inst==null){
                inst=new dbconn();
            }
            lock.unlock();
        }
        return inst;
    }
}
