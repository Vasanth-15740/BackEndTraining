package Day20;

import java.time.Duration;
import java.time.LocalDateTime;

public class Events {
    public String name;
    public Duration duration;
    public LocalDateTime dateandTime;

    public Events(String name, Duration duration, LocalDateTime dateandTime) {
        this.name = name;
        this.duration = duration;
        this.dateandTime = dateandTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public LocalDateTime getDateandTime() {
        return dateandTime;
    }

    public void setDateandTime(LocalDateTime dateandTime) {
        this.dateandTime = dateandTime;
    }

    @Override
    public String toString() {
        return "Events{" + "name='" + name + '\'' + ", duration=" + duration + ", dateandTime=" + dateandTime + '}';
    }
}
