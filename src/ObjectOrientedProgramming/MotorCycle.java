package ObjectOrientedProgramming;

public class MotorCycle extends BiCycle {

    @Override
    public String defineMe() {
        return "a cycle with an engine.";
    }

    public MotorCycle() {
        System.out.printf("Hello I am a motorcycle, I am %s\n", defineMe());

        String temp = super.defineMe();

		System.out.printf("My ancestor is a cycle who is %s\n", temp);
    }
}
