package com.day2.classcenter;

import java.util.*;

class CallCenter {

    private Queue<Customer> normalQueue = new LinkedList<>();
    private PriorityQueue<Customer> vipQueue =
            new PriorityQueue<>(Comparator.comparingLong(c -> c.callTime));

    private HashMap<String, Integer> callCountMap = new HashMap<>();

    // Incoming call
    void receiveCall(String customerId, boolean vip) {
        Customer customer = new Customer(customerId, vip);

        if (vip) {
            vipQueue.offer(customer);
        } else {
            normalQueue.offer(customer);
        }

        callCountMap.put(customerId,
                callCountMap.getOrDefault(customerId, 0) + 1);

        System.out.println("Call received from: " + customerId +
                (vip ? " (VIP)" : ""));
    }

    // Handle next call
    void handleCall() {
        Customer next;

        if (!vipQueue.isEmpty()) {
            next = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            next = normalQueue.poll();
        } else {
            System.out.println("No calls to handle");
            return;
        }

        System.out.println("Handling call from: " + next.id);
    }

    // Display call frequency
    void showCallStats() {
        System.out.println("Monthly Call Count:");
        for (String id : callCountMap.keySet()) {
            System.out.println(id + " → " + callCountMap.get(id));
        }
    }
}
