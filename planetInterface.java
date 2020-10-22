/**
 * interface which contains all methods that all planets require, this interface will be inherited to the planet.java class
 */
public interface planetInterface{
    void setDistance(double n);
    void setAngle(double n);
    void setDiameter(double n);
    void setCol(String col);

    double getDistance();
    double getAngle();
    double getDiameter();
    String getColour();

}