package by.itacademy.tasks16.lecture16.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by yslabko on 029 29 2015.
 */
public class Pool<T> {
    public static final int MAX_AVAILABLE = 3;
    private final Semaphore available = new Semaphore(MAX_AVAILABLE, true);
    protected boolean[] used = new boolean[MAX_AVAILABLE];
    // Структура данных для демонстрации
    protected T[] items = null; //не зависит от типов управляемых элементов

    private Pool(T[] items) {
        this.items = items;
    }

    public static <T> Pool<T> build(T[] pool) {
        return new Pool<>(pool);
    }

    public T getItem() throws InterruptedException {
        available.acquire();
        return getNextAvailableItem();
    }

    public void putItem(T x) {
        if (markAsUnused(x))
            available.release();
    }

    protected synchronized T getNextAvailableItem() {
        for (int i = 0; i < MAX_AVAILABLE; ++i) {
            if (!used[i]) {
                used[i] = true;
                return items[i];
            }
        }
        return null; // not reached
    }

    protected synchronized boolean markAsUnused(Object item) {
        for (int i = 0; i < MAX_AVAILABLE; ++i) {
            if (item == items[i]) {
                if (used[i]) {
                    used[i] = false;
                    return true;
                } else
                    return false;
            }
        }
        return false;
    }
}
