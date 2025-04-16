package rio.task_tgl_15_apr;

public class CounterSync_rio {
    private int count = 0;

    public synchronized void increment() { count++; }
    public synchronized int getCount() { return count; }

}