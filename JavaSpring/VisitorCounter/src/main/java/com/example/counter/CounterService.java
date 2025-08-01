package com.example.counter;

import org.springframework.stereotype.Service;

@Service
public class CounterService {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized void incrementByTwo() {
        count += 2;
    }

    public synchronized int getCount() {
        return count;
    }

    public synchronized void reset() {
        count = 0;
    }
}
