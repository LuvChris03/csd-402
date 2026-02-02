public class Fan {
    // Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and Setter for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan is off, color: " + color + ", radius: " + radius;
        }
    }

    // Test code
    public static void main(String[] args) {
        // Create fan using default constructor
        Fan fan1 = new Fan();
        
        // Create fan using argument constructor
        Fan fan2 = new Fan(FAST, true, 10.0, "yellow");

        // Display initial state
        System.out.println("Fan 1 (Default): " + fan1.toString());
        System.out.println("Fan 2 (Custom): " + fan2.toString());

        // Display functionality of setter/getter
        System.out.println("\nModifying Fan 1...");
        fan1.setSpeed(MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8.5);
        fan1.setColor("blue");

        System.out.println("Fan 1 Updated Speed: " + fan1.getSpeed());
        System.out.println("Fan 1 Updated On: " + fan1.isOn());
        System.out.println("Fan 1 Updated Radius: " + fan1.getRadius());
        System.out.println("Fan 1 Updated Color: " + fan1.getColor());
        System.out.println("Fan 1 Final Description: " + fan1.toString());
    }
}
