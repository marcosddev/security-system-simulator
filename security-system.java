public class Main {

    public static void main(String[] args) {

        boolean motionDetected = true;

        boolean doorOpen = false;

        boolean windowOpen = true;

        boolean systemArmed = true;

      //condições

        boolean alarmTrigger1 = systemArmed && (motionDetected || doorOpen);

        boolean alarmTrigger2 = systemArmed && windowOpen && !doorOpen;

        boolean alarmTrigger3 = !systemArmed /*false*/ || (!motionDetected && !windowOpen);

      

        System.out.println("Security System Status:");

        System.out.println("---------------------");

        System.out.println("Alarm Trigger 1: " + alarmTrigger1);

        System.out.println("Alarm Trigger 2: " + alarmTrigger2);

        System.out.println("Alarm Trigger 3: " + alarmTrigger3);

    }

}

