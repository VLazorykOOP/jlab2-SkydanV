public class Angle {
    private int degrees;
    private int minutes;

    public Angle(int degrees, int minutes) {
        this.degrees = degrees;
        this.minutes = minutes;
        normalize();
    }

    private void normalize() {
        degrees += minutes / 60;
        minutes = minutes % 60;

        if (minutes < 0) {
            minutes += 60;
            degrees--;
        }

        degrees = degrees % 360;
        if (degrees < 0) {
            degrees += 360;
        }
    }

    public double toRadians() {
        double totalDegrees = degrees + minutes / 60.0;
        return Math.toRadians(totalDegrees);
    }

    public void increaseAngle(int deg, int min) {
        this.degrees += deg;
        this.minutes += min;
        normalize();
    }

    public void decreaseAngle(int deg, int min) {
        this.degrees -= deg;
        this.minutes -= min;
        normalize();
    }

    public double getSin() {
        return Math.sin(toRadians());
    }

    public int compareTo(Angle other) {
        if (this.degrees == other.degrees) {
            return Integer.compare(this.minutes, other.minutes);
        }
        return Integer.compare(this.degrees, other.degrees);
    }

    @Override
    public String toString() {
        return degrees + "° " + minutes + "'";
    }

    public static void main(String[] args) {
        Angle angle1 = new Angle(350, 30);
        Angle angle2 = new Angle(10, 15);

        System.out.println("Кут 1: " + angle1);
        System.out.println("Кут 2: " + angle2);

        angle1.increaseAngle(15, 45);
        System.out.println("Кут 1 пiсля збiльшення: " + angle1);

        angle2.decreaseAngle(5, 30);
        System.out.println("Кут 2 пiсля зменшення: " + angle2);

        System.out.println("Синус кута 1: " + angle1.getSin());
        System.out.println("Порiвняння кутiв: " + angle1.compareTo(angle2));
    }
}
