package org.derryfield.math;

public class Algebra {
    public static double harmonicMean(double x, double y) {
        if (x <= 0 || y <= 0) {
            throw new IllegalArgumentException();
        }
        return 2 * x * y / (x + y);
    }
}
