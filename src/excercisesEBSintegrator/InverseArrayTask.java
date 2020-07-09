package excercisesEBSintegrator;

import java.util.Arrays;

public class InverseArrayTask implements ProgrammingTask{

    public void execute() {

        Float[] floatty = {1.2f, 3.14f, 4.5f, 5.697f, 6.1f};

        for (int i = floatty.length - 1; i >= 0; i--) {
            System.out.print(floatty[i] + " ");
        }
    }
}
