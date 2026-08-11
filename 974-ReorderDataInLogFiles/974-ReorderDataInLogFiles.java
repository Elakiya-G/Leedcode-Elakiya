// Last updated: 8/11/2026, 4:00:29 PM

import java.util.*;

class Solution {
    public String[] reorderLogFiles(String[] logs) {

        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();

        // Step 1: Separate logs
        for (String log : logs) {
            String[] parts = log.split(" ", 2);
            String identifier = parts[0];
            String content = parts[1];

            if (Character.isDigit(content.charAt(0))) {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }

        // Step 2: Sort letter logs
        Collections.sort(letterLogs, new Comparator<String>() {
            public int compare(String a, String b) {

                String[] aParts = a.split(" ", 2);
                String[] bParts = b.split(" ", 2);

                String aId = aParts[0];
                String aCon = aParts[1];

                String bId = bParts[0];
                String bCon = bParts[1];

                // compare content first
                if (!aCon.equals(bCon)) {
                    return aCon.compareTo(bCon);
                }

                // if same content, compare identifier
                return aId.compareTo(bId);
            }
        });

        // Step 3: Merge result
        String[] result = new String[logs.length];
        int i = 0;

        for (String log : letterLogs) {
            result[i++] = log;
        }

        for (String log : digitLogs) {
            result[i++] = log;
        }

        return result;
    }
}