public class moon extends planet implements moonInterface{

    private double centreOfRotationAngle;
    private double centreOfRotationDistance;

    /**
     * 
     * @param distance distance between the moon and its orbital object
     * @param angle polar angle bearing the moon to its orbital object
     * @param diameter  diameter of the moon
     * @param col   colour of the moon in String
     * @param centreOfRotationDistance  it's orbital object's distance 
     * @param centreOfRotationAngle it's orbital object's polar angle bearing
     */
    public moon(double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle){

        super(distance, angle, diameter, col);
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;
        
    }

    /**
     * update its orbital object's distance
     */
    public void setCentreOfRotationDistance(double n){
        this.centreOfRotationDistance = n;
    }

    /**
     * update its orbital object's polar angle bearing
     */
    public void setCentreOfRotationAngle(double n){
        this.centreOfRotationAngle = n;
    }

    /**
     * return the orbital object's distance as a double
     */
    public double getCentreOfRotationDistance(){
        return centreOfRotationDistance;
    }

    /**
     * return the orbital object's polar bearing angle as a double
     */
    public double getCentreOfRotationAngle(){
        return centreOfRotationAngle;
    }
}