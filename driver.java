import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/**
 * An accurate scale to scale visual representation of the solar system
 */
public class driver {
    public static void main(String[] args){

        int min = 0;
        int max = 360;
        Random rand = new Random();

        SolarSystem Solar = new SolarSystem(1200, 1200); //new Jframe that holds the solar system

            double[] angles = new double[8];  //essencially we have created an array of doubles, randomly generated between 0-360
            for (int i = 0; i < angles.length; i++){
               angles[i] = ThreadLocalRandom.current().nextDouble(min, max);   
            }

            dustParticles[] dustParticles = new dustParticles[300]; //create an array of instances of dustparticles
            double[] dustAngles = new double[300]; //similar to @angles, this will create an array which stored random doubles between 0-360, which is initialized in the for loop underneath
            for (int i = 0; i < 300; i++){ 
                dustParticles[i] = new dustParticles(350 + rand.nextInt(30), dustAngles[i] = ThreadLocalRandom.current().nextDouble(min, max), 1, "WHITE");
            }

            sun sun = new sun(0, 0, 250, "#eb6834");
            mercury mercury = new mercury(150, angles[0], 8, "#a2e8cc");
            venus venus = new venus(170, angles[1], 15, "ORANGE");
            earth earth = new earth(190, angles[2], 12, "BLUE");
            mars mars = new mars(220, angles[3], 8, "#a85832");
            jupiter jupiter = new jupiter(310, angles[4], 80, "#968075");
            saturn saturn = new saturn(410, angles[5], 75, "#ad7153");
            uranus uranus = new uranus(483, angles[6], 30, "#31ebcc");
            neptune neptune = new neptune(558, angles[7], 27, "#0e1ab5");

        while (true){ 

            Solar.drawSolarObject(sun.getDistance(), sun.getAngle(), sun.getDiameter(), sun.getColour());
            Solar.drawSolarObject(mercury.getDistance(), angles[0] += 0.8, mercury.getDiameter(), mercury.getColour());    
            Solar.drawSolarObject(venus.getDistance(), angles[1] += 0.7, venus.getDiameter(), venus.getColour());   
            Solar.drawSolarObject(earth.getDistance(), angles[2] += 0.6, earth.getDiameter(), earth.getColour());    
            Solar.drawSolarObject(mars.getDistance(), angles[3] += 0.5, mars.getDiameter(), mars.getColour());    
            Solar.drawSolarObject(jupiter.getDistance(), angles[4] += 0.4, jupiter.getDiameter(), jupiter.getColour());     
            Solar.drawSolarObject(saturn.getDistance(), angles[5] += 0.3, saturn.getDiameter(), saturn.getColour());    
            Solar.drawSolarObject(uranus.getDistance(), angles[6] += 0.2, uranus.getDiameter(), uranus.getColour());    
            Solar.drawSolarObject(neptune.getDistance(), angles[7] += 0.1, neptune.getDiameter(), neptune.getColour());    

            for(int i = 0; i < 300; i++){
                Solar.drawSolarObject(dustParticles[i].getDistance(), dustAngles[i] += 0.1, dustParticles[i].getDiameter(), dustParticles[i].getColour());    
            }
            Solar.finishedDrawing();
        }
    }
}
