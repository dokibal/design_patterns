package bridge.devices;

public class Radio implements Device{

    int volume = 0;
    int channel = 0;
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
        if (volume > 100){
            this.volume = 100;
        }
        else if (volume < 0){
            this.volume = 0;
        }
        else{
            this.volume = volume;
        }
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
            "Radio status: " +this.enabled +
            ", volume: " + this.volume +
            ", channel: " + this.channel +
            "."
        );
    }
    
}