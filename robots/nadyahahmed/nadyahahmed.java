package nadyahahmed;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.HitWallEvent;

import java.awt.Color;
import java.util.Random;

public class nadyahahmed extends Robot {
    
    public void run (){
        //two sections

        //first, setup
        //handle spawn randomness
        setBodyColor(Color.blue);
        setGunColor(Color.pink);

        while(true){
            // this code will run forever until you die
            //generates random number to input into the movement
            //since having non predictable movement can be an advantage, 
            //I wanted my robot to move randomly
            Random randNumAhead = new Random();
            int randomNum = randNumAhead.nextInt(1000);
            Random randNumBack = new Random();
            int randomNumTwo = randNumBack.nextInt(1000);
            Random randNumRight = new Random();
            int randomRight = randNumRight.nextInt(270);
            Random randNumLeft = new Random();
            int randomLeft = randNumLeft.nextInt(270);

            
            turnRight(randomRight);
            ahead(randomNum);
            

            //maybe try using a random number generator variable for how much to move
            
            turnLeft(randomLeft);
            back(randomNumTwo);
            turnGunLeft(180);

           
            
            

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
        
        fire(1);
    }
    
    public void onHitWall(HitWallEvent e){
        Random random = new Random();
        int randomDirection = random.nextInt(180);
        turnRight(randomDirection);
        ahead(2000);

        
    }





}
