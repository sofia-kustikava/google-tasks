import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmail = new HashSet<>();

        int i;
        for (String email : emails) {
            char[] tempEmail = email.toCharArray();
            StringBuilder newEmail = new StringBuilder();
            for (i = 0; tempEmail[i] != '@'; i++) {
                if (tempEmail[i] == '+') {
                    break;
                } else if (tempEmail[i] != '.') {
                    newEmail.append(tempEmail[i]);
                }
            }
            while (tempEmail[i] != '@') {
                i++;
            }
            while (i < email.length()) {
                newEmail.append(tempEmail[i]);
                i++;
            }
            uniqueEmail.add(newEmail.toString());
        }

        return uniqueEmail.size();
    }

}
