package en.comparing;

public class ComparingStrings {

    private static final String SCREWDRIVER = "SCREWDRIVER";

    private static final String HAMMER = "HAMMER";

    private static final String CALIPER = "CALIPER";

    private static final String METRIC_TAPE = "METRIC_TAPE";

    public static void main(String[] args) {
        if(SCREWDRIVER == SCREWDRIVER) {
            System.out.println("Same tools");
        } else {
            System.out.println("Different tools");
        }

        if(isScrewdriver(CALIPER)) {
            System.out.println("It's a screwdriver");
        } else {
            System.out.println("Not a screwdriver");
        }

        if(isScrewdriver(SCREWDRIVER)) {
            System.out.println("It's a screwdriver");
        } else {
            System.out.println("Not a screwdriver");
        }

        if(compareTools(HAMMER, HAMMER)) {
            System.out.println("Same tools");
        } else {
            System.out.println("Different tools");
        }

        if(compareTools(HAMMER, METRIC_TAPE)) {
            System.out.println("Same tools");
        } else {
            System.out.println("Different tools");
        }
    }

    public static boolean compareTools(String tool1, String tool2) {
        return tool1 == tool2;
    }

    public static boolean isScrewdriver(String tool) {
        return tool == SCREWDRIVER;
    }
}
