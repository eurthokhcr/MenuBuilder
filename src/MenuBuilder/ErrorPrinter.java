package MenuBuilder;

public abstract class ErrorPrinter {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    void printBadInput() {
        System.out.println();
        System.out.println(ANSI_RED + "NonExistingOptionError: Input must be an existing option" + ANSI_RESET);
        System.out.println();
    }
    abstract void printUnMatchedInput();
}
