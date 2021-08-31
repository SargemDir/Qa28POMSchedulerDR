package dto;

public class EventCreateModel {
    String titelEC;
    String typeEC;
    int breakEC;
    int wageEC;

    public EventCreateModel withTitelEC(String titelEC) {
        if (titelEC != null) {
            this.titelEC = titelEC;
        }
        return this;
    }

    public EventCreateModel withTypeEC(String typeEC) {
        if (typeEC != null) {
            this.typeEC = typeEC;
        }
        return this;
    }

    public EventCreateModel withBreakEC(int breakEC) {
        if (breakEC > 0 && breakEC <= 4) {
            this.breakEC = breakEC;
        }
        return this;
    }

    public EventCreateModel withWageEC(int wageEC) {
        if (wageEC >= 0) {
            this.wageEC = wageEC;
        }
        return this;
    }

    public String getTitelEC() {
        return titelEC;
    }

    public String getTypeEC() {
        return typeEC;
    }

    public int getBreakEC() {
        return breakEC;
    }

    public int getWageEC() {
        return wageEC;
    }
}
