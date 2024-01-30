package bridge.devices;

public class TV implements Device{

    int volume = 30;
    int channel = 1;
    boolean enabled = false;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println(
            "TV status: " +this.enabled +
            ", volume: " + this.volume +
            ", channel: " + this.channel +
            "."
        );
    }
    
}
