public class InputHelper {
    public static int readInt(int min, int max, String errorMessage) {
        while (true) {
            try {
                int choice = Integer.parseInt(System.console().readLine());
                if (choice < min || choice > max) {
                    throw new NumberFormatException();
                }
                return choice;
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }
}