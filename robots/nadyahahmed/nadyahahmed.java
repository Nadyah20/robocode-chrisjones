package nadyahahmed;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.HitWallEvent;
import robocode.HitByBulletEvent;

import java.awt.Color;
import java.util.Random;

public class nadyahahmed extends Robot {
    
    //my robot's strat is to be as random as possible  
    //because patterns in movement can cause it to be a target.
    //Using a random number generator stops this predictability.
    //I found that it works best against robots the also move around
    //a lor, but is less effective against more stationary bots


    public void run (){
        //two sections

        //first, setup
        //handle spawn randomness
        //setting the body of the bot blue and the gun pink
        setBodyColor(Color.blue);
        setGunColor(Color.pink);

        while(true){
            // this code will run forever until you die
            //generates random number to input into the movement
            //since having non predictable movement can be an advantage, 
            //I wanted my robot to move randomly

            //Random numebers generated to be inputed and control
            //the direction the robot goes and how far it goes
            Random randNumAhead = new Random();
            int randomNum = randNumAhead.nextInt(1000);
            Random randNumBack = new Random();
            int randomNumTwo = randNumBack.nextInt(1000);
            Random randNumRight = new Random();
            int randomRight = randNumRight.nextInt(270);
            Random randNumLeft = new Random();
            int randomLeft = randNumLeft.nextInt(270);


            turnGunLeft(360);
            turnRight(randomRight);
            ahead(randomNum);
            

            turnGunLeft(360);
            
            
            turnLeft(randomLeft);
            back(randomNumTwo);
            turnGunLeft(360);

           
            
            

            //COMMAND BANK:

            //turnLeft(90);
            //turnRight(90);
            //stop();
            //turnGunLeft(90);
            //turnGunRight(90);
            //fire(power);
            //more power, more cooldown time
            //turnRadarLeft(90);
            //turnRadarRight(90);
            //onScannedRobot(ScannedRobotEvent);
            //ohBulletHit(event);
            //onHitRobot(event);
            //onHitWall(event)
            //onWin(event);

        }



    }

    public void onScannedRobot(ScannedRobotEvent e){
        //this code will run when we see a robot on radar
        //after trial and error I noticed that firing twice
        //worked better than firing with more power
        fire(1);
        fire(1);
    }
    
    /*
     * This method changes the direction that the robot is going 
     * once it hits a wall and chooses a new random one
     */

    public void onHitWall(HitWallEvent e){
        
        Random random = new Random();
        int randomDirection = random.nextInt(180);
        turnRight(randomDirection);
        ahead(1000);

        
    }

    /*
     * This method makes the robot move out of the way after
     * it gets hit by a bullet
     */

    public void onHitByBullet(HitByBulletEvent e){
        turnRight(90);
        ahead(100);
    }





}
