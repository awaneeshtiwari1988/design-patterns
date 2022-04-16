package own.practice.design.patterns.solid.openclosed;

// Abstract Base class - Closed for modification as it is going to be used through out the application.
public abstract class Subscriber {

    protected Long subscriberId;

    protected String address;

    protected Long phoneNumber;

    protected int baseRate;

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    // An abstract method - thus opening for extension.
    public abstract double calculateBill();
}
