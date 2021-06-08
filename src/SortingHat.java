import java.util.*;

public class SortingHat {

    public static void main(String[] args) {

        Set<Integer> students = new HashSet<>();

        List<Integer> AV = new ArrayList<>();
        List<Integer> ANV = new ArrayList<>();
        List<Integer> BV = new ArrayList<>();
        List<Integer> BNV = new ArrayList<>();
        List<Integer> NA = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int capacity = 0;
        while (sc.hasNextLine()) {

            String line = sc.nextLine();

            String[] tokens = line.split(" ");

            if (tokens.length > 0) {

                String action = tokens[0];

                switch (action) {

                    case "init":
                        capacity = tokens.length > 1 ? Integer.parseInt(tokens[1]) : 0;
                        break;
                    case "reg":

                        int rollNo = Integer.parseInt(tokens[1]);
                        String batch = tokens[2];
                        String foodPref = tokens[3];

                        if (students.size() < capacity && !students.contains(rollNo)) {

                            students.add(rollNo);

                            if ("A".equalsIgnoreCase(batch)) {

                                if ("V".equalsIgnoreCase(foodPref)) {
                                    AV.add(rollNo);
                                } else if ("NV".equalsIgnoreCase(foodPref)) {
                                    ANV.add(rollNo);
                                }

                            } else if ("B".equalsIgnoreCase(batch)) {

                                if ("V".equalsIgnoreCase(foodPref)) {
                                    BV.add(rollNo);
                                } else if ("NV".equalsIgnoreCase(foodPref)) {
                                    BNV.add(rollNo);
                                }
                            }
                        } else if (students.size() >= capacity) {
                            NA.add(rollNo);
                        }

                        break;
                    case "fin":
                        break;
                }
            }

        }

        System.out.print("AV : [");
        for (int i = 0; i < AV.size(); i++) {
            System.out.print(AV.get(i) + ", ");
        }
        System.out.print(AV.get((AV.size() - 1)) + "]");

        System.out.print("ANV : [");
        for (int i = 0; i < ANV.size(); i++) {
            System.out.print(ANV.get(i) + ", ");
        }
        System.out.print(ANV.get((ANV.size() - 1)) + "]");

        System.out.print("BV : [");
        for (int i = 0; i < BV.size(); i++) {
            System.out.print(BV.get(i) + ", ");
        }
        System.out.print(BV.get((BV.size() - 1)) + "]");

        System.out.print("BNV : [");
        for (int i = 0; i < BNV.size(); i++) {
            System.out.print(BNV.get(i) + ", ");
        }
        System.out.print(BNV.get((BNV.size() - 1)) + "]");

    }

}
