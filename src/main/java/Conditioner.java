public class Conditioner {
    private int currentTemperature;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int newCarrentTemperature) {
        if (newCarrentTemperature < 0) {
            return;
        }
        if (newCarrentTemperature > 30) {
            return;
        }
        currentTemperature = newCarrentTemperature;
    }

    public void increaseTemp50p() {
        int target = currentTemperature * 3 / 2;
        setCurrentTemperature(target);
    }
    public void setToMaxTemp() {
        currentTemperature = 30;
    }
}
