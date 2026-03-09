public class AutoService {

    // You can set the standard service charge to any value you need
    private static final double STANDARD_SERVICE_CHARGE = 100.00;

    // 1. No parameters - Returns standard service charge
    public static double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }

    // 2. One parameter - Returns standard service charge + oil change fee
    public static double yearlyService(double oilChangeFee) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee;
    }

    // 3. Two parameters - Returns standard service charge + oil change fee + tire rotation charge
    public static double yearlyService(double oilChangeFee, double tireRotationCharge) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationCharge;
    }

    // 4. Three parameters - Returns standard service charge + oil change fee + tire rotation charge - coupon amount
    public static double yearlyService(double oilChangeFee, double tireRotationCharge, double couponAmount) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationCharge - couponAmount;
    }

    public static void main(String[] args) {
        // Test values
        double oilChange = 45.50;
        double tireRotation = 25.00;
        double coupon = 15.00;

        // Testing all four methods
        System.out.println("1. Standard Service Cost: $" + yearlyService());
        
        System.out.println("2. Service + Oil Change: $" + yearlyService(oilChange));
        
        System.out.println("3. Service + Oil Change + Tire Rotation: $" + 
                           yearlyService(oilChange, tireRotation));
        
        System.out.println("4. Service + Oil Change + Tire Rotation - Coupon: $" + 
                           yearlyService(oilChange, tireRotation, coupon));
    }
}