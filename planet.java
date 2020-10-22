public class planet implements planetInterface{

    private double distance;
    private double angle;
    private double diameter;
    private String col;
    /**
     * 
     * @param distance distance between the planet at the center;
     * @param angle polar bearing angle of the planet to its rotating center;
     * @param diameter diameter of the planet
     * @param col colour of the planet in String
     */

    public planet(double distance, double angle, double diameter, String col){
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
    }
    /**
     * updates the planets distance
     */
    public void setDistance(double n){
        this.distance = n;
    }

    /**
     * updates the planets angle 
     */
    public void setAngle(double n){
        this.angle = n;
    }

    /**
     * updates the planets diameter
     */
    public void setDiameter(double n){
        this.diameter = n;
    }
    
    /**
     * updates the colour
     */
    public void setCol(String colour){
        this.col = colour;
    }

    /**
     * return the planets distance
     */
    public double getDistance(){
        return distance;
    }

    /**
     * return the planets angle
     */
    public double getAngle(){
        return angle;
    }

    /**
     * return the planets diameter
     */
    public double getDiameter(){
        return diameter;
    }

    /**
     * return the planets colour
     */
    public String getColour(){
        return col;
    }
}
