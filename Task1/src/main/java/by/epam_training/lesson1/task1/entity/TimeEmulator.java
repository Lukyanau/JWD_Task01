package by.epam_training.lesson1.task1.entity;

public class TimeEmulator {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeEmulator() {

    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeEmulator time = (TimeEmulator) o;

        if (hours != time.hours) return false;
        if (minutes != time.minutes) return false;
        return seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        int result = hours;
        result = 31 * result + minutes;
        result = 31 * result + seconds;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Time{");
        sb.append(hours);
        sb.append(":").append(minutes);
        sb.append(":").append(seconds);
        sb.append(" }");
        return sb.toString();
    }
}
