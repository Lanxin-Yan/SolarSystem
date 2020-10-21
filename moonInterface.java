/**
 * moons have already inherited planetinterface by extend a planet.java super class
 * this allows moons to extend all additional required methods
 */

public interface moonInterface {
    void setCentreOfRotationDistance(double n);
    void setCentreOfRotationAngle(double n);

    double getCentreOfRotationDistance();
    double getCentreOfRotationAngle();
}
