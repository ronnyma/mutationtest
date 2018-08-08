package no.transfinite;

public class Refrigerator {
    public void setTemperature(int temperature) {
        if (temperature < min || temperature > max) {
            throw new IllegalArgumentException();
        }
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    protected boolean calibrate() {
        int d = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = min; j < max; j++) {
                temperature = j;
                int c = i / temperature;
                d += c;
            }
        }
        return d == 49; //49 is the magic number
    }

    private int min = 2;
    private int max = 7;
    private int temperature;
}
