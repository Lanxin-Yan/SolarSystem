public class moon extends planet implements moonInterface{

    private double centreOfRotationAngle;
    private double centreOfRotationDistance;

    public moon(double distance, double angle, double diameter, String col, double centreOfRotationDistance, double centreOfRotationAngle){

        super(distance, angle, diameter, col);
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.centreOfRotationAngle = centreOfRotationAngle;
        
    }

    public void setCentreOfRotationDistance(double n){
        this.centreOfRotationDistance = n;
    }

    public void setCentreOfRotationAngle(double n){
        this.centreOfRotationAngle = n;
    }

    public double getCentreOfRotationDistance(){
        return centreOfRotationDistance;
    }

    public double getCentreOfRotationAngle(){
        return centreOfRotationAngle;
    }
}