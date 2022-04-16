package own.practice.design.patterns.solid.openclosed;

import own.practice.design.patterns.solid.openclosed.util.CallHistory;

import java.util.List;

public class PhoneSubscriber extends Subscriber {
    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }
}
