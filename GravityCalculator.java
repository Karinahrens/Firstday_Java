package uk.ac.gre.comp1549.examples;

public class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = gravity * fallingTime;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    /** Change the main method of GravityCalculator class so that it computes the position of an
        object after falling for 10 seconds, outputting the position in meters. The formula in Math
        notation is:
        x(t) = 0.5 × at2 + vit + xi */
        
        double acceleration = -9.81;
        double time = 10;
        double formula = 0.5;
        double finalPosition2 = formula * acceleration * time * time;
        System.out.println("The object's position after " + time +
                " seconds is " + finalPosition2 + " m.");
    
    
    }
}