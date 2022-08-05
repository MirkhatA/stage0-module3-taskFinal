package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number);

        System.out.println(stringBuilder.reverse());
    }
}
