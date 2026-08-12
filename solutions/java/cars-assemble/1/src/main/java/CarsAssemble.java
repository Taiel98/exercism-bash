public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double productionRate = 221 * speed;
        if (speed > 0 && speed < 5) {
            return productionRate;
        }else if (speed > 4 && speed < 9) {
            return productionRate * 0.9;
        }else if (speed > 8 && speed < 10) {
            return productionRate * 0.8;
        }else if (speed >= 10) {
            return productionRate * 0.77;
        }
        return speed;
    }

    public int workingItemsPerMinute(int speed) {
        double itemsPerMinute = 221 * speed / 60;
        double result = 0;
        if (speed > 0 && speed < 5) {
            result = itemsPerMinute;
        }else if (speed > 4 && speed < 9) {
            result = itemsPerMinute * 90 / 100;
        }else if (speed > 8 && speed < 10) {
            result = itemsPerMinute * 80 / 100;
        }else if (speed >= 10) {
            result = itemsPerMinute * 77 / 100;
        }
        return (int) Math.round(result);
    }
}