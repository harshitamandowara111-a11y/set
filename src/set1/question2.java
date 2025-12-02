package set1;

import java.util.*;

public class question2 {
    public static List<Integer> getRequests(int[] user, int[] time, int k, int t) {
        Map<Integer, List<Integer>> userLogs = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < user.length; i++) {
            int uid = user[i];
            int ts = time[i];

            // Initialize list if user not present
            if (!userLogs.containsKey(uid)) {
                userLogs.put(uid, new ArrayList<>());
            }

            List<Integer> logs = userLogs.get(uid);

            // Manually remove old timestamps
            List<Integer> updatedLogs = new ArrayList<>();
            for (int logTs : logs) {
                if (logTs > ts - t) {
                    updatedLogs.add(logTs);
                }
            }

            logs = updatedLogs;

            if (logs.size() < k) {
                result.add(1); // Allow
                logs.add(ts);
            } else {
                result.add(0); // Reject
            }

            userLogs.put(uid, logs); // Update the map
        }

        return result;
    }

    public static void main(String[] args) {
        int[] user = {1, 1, 1};
        int[] time = {6, 10, 15};
        int k = 2;
        int t = 10;

        List<Integer> output = getRequests(user, time, k, t);
        System.out.println(output); // Output: [1, 1, 0]
    }
}
