package by.epam_training.lesson1.task1.entity;

public class DateEmulator {
    private int year;
    private int month;

    public DateEmulator() {

    }

    public DateEmulator(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DateEmulator that = (DateEmulator) o;

        if (year != that.year) return false;
        return month == that.month;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + month;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DateEmulator{");
        sb.append("year=").append(year);
        sb.append(", month=").append(month);
        sb.append('}');
        return sb.toString();
    }
}
