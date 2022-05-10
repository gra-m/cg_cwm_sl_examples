package _01designpatterns._01VaskaranSarcarVScwm._09facade_S;

public class RobotFacade {
    RobotColour rColour;
    RobotHands rHands;
    RobotBody rBody;

    public RobotFacade() {
        rColour = new RobotColour();
        rHands = new RobotHands();
        rBody = new RobotBody();
    }

    //MILANO CREATE
    public void constructMilanoRobot() {
        RobotBody.createRobot();
        System.out.println("Creation of a Milano Robot has begun.");
        rColour.setDefaultColour();
        rHands.setMilanoHands();
        rBody.createHands();
        rBody.createRemainingParts();
        System.out.println(" Milano Robot Creation End\n");
    }


    //ROBONAUT CREATE
    public void constructRobonautRobot() {
        RobotBody.createRobot();
        System.out.println("Creation of a Robonaut Robot has begun");
        rColour.setGreenColour();
        rHands.setRobonautHands();
        rBody.createHands();
        rBody.createRemainingParts();
        System.out.println(" Robonaut Robot Creation End\n");
    }

    //MILANO DESTROY
    public void destroyAMilanoRobot() {
        RobotBody.destroyRobot();
        System.out.println(" Milano robot's destruction process has begun");
        rHands.resetMilanoHands();
        rBody.destroyHands();
        rBody.destroyRemainingParts();
        System.out.println(" Milano Robot Destruction End\n");
    }
    //ROBONAUT DESTROY
    public void destroyARobonautRobot() {
            RobotBody.destroyRobot();
            System.out.println(" Robonaut robot's destruction process has begun");
            rHands.resetRobonautHands();
            rBody.destroyHands();
            rBody.destroyRemainingParts();
            System.out.println(" Robonaut Robot Destruction End\n");
    }
}
