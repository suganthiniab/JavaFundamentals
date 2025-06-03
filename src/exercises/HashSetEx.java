package exercises;

import java.util.HashSet;

public class HashSetEx {

    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<String>();
        departments.add("Development");
        departments.add("Admin");
        departments.add("Testing");
        departments.add("Testing");

        System.out.println(departments);
    }
}
