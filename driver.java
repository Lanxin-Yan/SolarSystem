import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/**
 * An accurate scale to scale visual representation of the solar system
 * 
 * Essencially I have created an interface (planetInterface.java) with all the required methods for planets, and a super class planet.java that inherites
 * from this interface. 
 * planet.java an abstract class for different planets, it contains all the methods and constructors needed for a planet object.
 * 
 * I have also created another super class for moons (moon.java), as moon includes the methods and variables that planets have, I will just make moon a sub 
 * class of planets, and create a interface that contains the methods for moons which planets didnt have. So this class extends from planet and implements 
 * moonInterface.
 */
public class driver {
    public static void main(String[] args){

        int min = 0; //@min and @max are limit holders for a random operation, which generate a number between 0-360
        int max = 360;
       
        double earthMoonAngle = 0; 

        Random rand = new Random();

        SolarSystem Solar = new SolarSystem(1200, 1200); //new Jframe that holds the solar system

            double[] angles = new double[8];  //essencially we have created an array of doubles, will act as a polar angular number for planets, randomly generated between 0-360
            for (int i = 0; i < angles.length; i++){
               angles[i] = ThreadLocalRandom.current().nextDouble(min, max);   
            }

            dustParticles[] dustParticles = new dustParticles[300]; //create an array of instances of dustparticles.
            double[] dustAngles = new double[300]; //similar to @angles, this will create an array of 300 doubles, between 0-360
            for (int i = 0; i < 300; i++){ 
                dustParticles[i] = new dustParticles(320 + rand.nextInt(30), dustAngles[i] = ThreadLocalRandom.current().nextDouble(min, max), 1, "WHITE");
            }

            

            sun sun = new sun(0, 0, 250, "#eb6834"); //creating instances of diffrent planets 
            mercury mercury = new mercury(150, angles[0], 8, "#a2e8cc");
            venus venus = new venus(170, angles[1], 15, "ORANGE");
            earth earth = new earth(190, angles[2], 12, "BLUE");
            mars mars = new mars(220, angles[3], 8, "#a85832");
            jupiter jupiter = new jupiter(260, angles[4], 80, "#968075");
            saturn saturn = new saturn(410, angles[5], 75, "#ad7153");
            uranus uranus = new uranus(483, angles[6], 30, "#31ebcc");
            neptune neptune = new neptune(558, angles[7], 27, "#0e1ab5");

            earthMoon earthMoon = new earthMoon(10, angles[2], 3, "GREY", earth.getDistance(), earth.getAngle()); //creating instances for earth's moon
            
            saturnMoon[] saturnMoons = new saturnMoon[82]; //because jupiter has 82 moons
            double[] saturnMoonAngles = new double[82];
            for (int i = 0; i < 82; i++){
                saturnMoons[i] = new saturnMoon(50, saturnMoonAngles[i] = ThreadLocalRandom.current().nextDouble(min, max), 2, "YELLOW", saturn.getDistance(), saturn.getAngle());
            }

        while (true){ 

            Solar.drawSolarObject(sun.getDistance(), sun.getAngle(), sun.getDiameter(), sun.getColour()); //So now we can easily fill in the parameter for the method, simply use class.get();.
            Solar.drawSolarObject(mercury.getDistance(), angles[0] += 0.8, mercury.getDiameter(), mercury.getColour());    
            Solar.drawSolarObject(venus.getDistance(), angles[1] += 0.7, venus.getDiameter(), venus.getColour());   
            Solar.drawSolarObject(earth.getDistance(), angles[2] += 0.6, earth.getDiameter(), earth.getColour());  
            Solar.drawSolarObject(mars.getDistance(), angles[3] += 0.5, mars.getDiameter(), mars.getColour());    
            Solar.drawSolarObject(jupiter.getDistance(), angles[4] += 0.4, jupiter.getDiameter(), jupiter.getColour());     
            Solar.drawSolarObject(saturn.getDistance(), angles[5] += 0.3, saturn.getDiameter(), saturn.getColour());    
            Solar.drawSolarObject(uranus.getDistance(), angles[6] += 0.2, uranus.getDiameter(), uranus.getColour());    
            Solar.drawSolarObject(neptune.getDistance(), angles[7] += 0.1, neptune.getDiameter(), neptune.getColour());    

            Solar.drawSolarObjectAbout(earthMoon.getDistance(), earthMoonAngle += 4, earthMoon.getDiameter(), earthMoon.getColour(), earthMoon.getCentreOfRotationDistance(), angles[2]); //draw earth's moon
            
            for(int i = 0; i < 82; i++){
                Solar.drawSolarObjectAbout(saturnMoons[i].getDistance(), saturnMoonAngles[i] += 3, saturnMoons[i].getDiameter(), saturnMoons[i].getColour(), saturnMoons[i].getCentreOfRotationDistance(), angles[5]); //draw dust ring
            }

            for(int i = 0; i < 300; i++){
                Solar.drawSolarObject(dustParticles[i].getDistance(), dustAngles[i] += 0.1, dustParticles[i].getDiameter(), dustParticles[i].getColour()); //draw Jupiter's moon
            }
            Solar.finishedDrawing(); 
        }
    }
}
