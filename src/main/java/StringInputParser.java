import java.util.Scanner;

public class StringInputParser {
    public int extractHeight(String value) {
        String stripedValue = value.strip();
        Integer qtPos = stripedValue.indexOf("'");
        Integer dblQtPos = stripedValue.indexOf("\"");
        if (qtPos == -1 || dblQtPos == -1) {
            return -1;
        }
        Integer ft = Integer.parseInt(stripedValue.substring(0,qtPos));
        Integer in = Integer.parseInt(stripedValue.substring(qtPos+1, dblQtPos));
        if (in < 0 || in > 11 || ft < 0) {
            return -1;
        }

        return ft*12 + in;
    }

    public static void main(String[] args) {
        StringInputParser obj = new StringInputParser();
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your height in the format ft'in\": ");
            String input = in.nextLine();
            int inches = obj.extractHeight(input);
            System.out.println(inches);
        } catch (Exception e) {
            System.err.println("An error occurred");
            e.printStackTrace();
        }
    }

}
