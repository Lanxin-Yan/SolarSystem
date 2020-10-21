public class planet implements planetInterface{

    private double distance;
    private double angle;
    private double diameter;
    private String col;
    

    public planet(double distance, double angle, double diameter, String col){
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
    }

    public void setDistance(double n){
        this.distance = n;
    }

    public void setAngle(double n){
        this.angle = n;
    }

    public void setDiameter(double n){
        this.diameter = n;
    }

    public void setCol(String colour){
        this.col = colour;
    }

    public double getDistance(){
        return distance;
    }

    public double getAngle(){
        return angle;
    }

    public double getDiameter(){
        return diameter;
    }

    public String getColour(){
        return col;
    }
}
