package unit11;

// 2019 FRQ #2
// https://apcentral.collegeboard.org/media/pdf/ap19-frq-computer-science-a.pdf#page=7
public class StepTracker {
    int minSteps;
    int totalSteps = 0;
    int days = 0;
    int actDays = 0;
    public StepTracker(int minSteps){
        this.minSteps = minSteps;
    }

    public void addDailySteps(int steps){
        totalSteps+=steps;
        days++;
        if(steps>=minSteps){
            actDays++;
        }

    }

    public int activeDays(){
        return actDays;
    }

    public double averageSteps(){
        if(days==0){
            return 0;
        }
        else
        return ((double)totalSteps/days);
    }


    // TODO implement me!

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("bad panda");
    }

    public static void main(String[] args) {
        // uncomment the following lines to test your code
         StepTracker tr = new StepTracker(10000);
         check(tr.activeDays() == 0);
         check(tr.averageSteps() == 0.0);
         tr.addDailySteps(9000);
         tr.addDailySteps(5000);
         check(tr.activeDays() == 0);
         check(tr.averageSteps() == 7000.0);
         tr.addDailySteps(13000);
         check(tr.activeDays() == 1);
         check(tr.averageSteps() == 9000.0);
         tr.addDailySteps(23000);
         tr.addDailySteps(1111);
         check(tr.activeDays() == 2);
         check(tr.averageSteps() == 10222.2);
         System.out.println("Happy Panda! \uD83D\uDC3C");
    }
}
