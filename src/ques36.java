public class ques36 {
    public static void main(String[] args) {

        String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j]) ) {
                    System.out.println(names[i] + " and " + names[j] + " are duplicate ");
                }
            }
        }

    }
}
