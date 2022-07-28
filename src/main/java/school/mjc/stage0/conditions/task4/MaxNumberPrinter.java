package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greatest = first;
        if(greatest < second)
            greatest = second;
        if(greatest < third)
            greatest = third;

        System.out.println(greatest);
    }
}
