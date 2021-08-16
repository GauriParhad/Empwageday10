public class Employeewage {
    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int IS_PART_TIME=1;
    public static final int NUM_OF_WORKING_DAYS=2;
    public static final int MAX_HR_IN_MONTH=10;

    public static int Computeemployeewage() {
        //variables

        int emphrs = 0;
        int totalemphrs = 0;
        int totalworkingdays = 0;


        //Computation
        while (totalemphrs <= MAX_HR_IN_MONTH && totalworkingdays < NUM_OF_WORKING_DAYS) {
            totalworkingdays++;
        }
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empcheck) {
            case 1:
                IS_PART_TIME:
                System.out.println("Employee Part time present");
                emphrs = 4;
                break;
            case IS_FULL_TIME:
                System.out.println("Employee Full time present");
                emphrs = 8;
                break;
            default:
                System.out.println("Employee Absent");
                emphrs = 0;
                break;
        }
        totalemphrs += emphrs;
        System.out.println("Day#: " + totalworkingdays + "Emp Hr:" + emphrs);

            int totalempwage= totalemphrs * EMP_RATE_PER_HOUR;
            System.out.println("Total employee wage " +totalempwage);
            return totalempwage;
        }
        public static void main(String[] args) {
        Computeemployeewage();
    }
}

    