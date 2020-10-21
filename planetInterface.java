/**
 * interface which contains all methods that all planets require
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