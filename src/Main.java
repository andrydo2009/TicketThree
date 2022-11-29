public class Main {
    public static void main(String[] args) {

        String stringTicket="HelloCoach";
        final int middleString = stringTicket.length() / 2;
        String[] parts = {stringTicket.substring(0, middleString),stringTicket.substring(middleString)};
        System.out.print(parts[0]+" ");
        System.out.println(parts[1]);

        }

    }
