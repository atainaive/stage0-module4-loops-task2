package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        boolean flag = true;

        if (printToInclusive == 0 || printToInclusive == 1) {
            return;
        }

        System.out.println(i);
        i = 3;
        while (i <= printToInclusive) {
            for (int j = 2; j <= Math.sqrt(i); ++j) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                System.out.println(i);
            }

            flag = true;
            ++i;
        }
    }
}
