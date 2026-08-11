// Last updated: 8/11/2026, 3:58:30 PM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int startSeconds = timeToSeconds(startTime);
        int endSeconds = timeToSeconds(endTime);
        return endSeconds - startSeconds;
    }
    private int timeToSeconds(String time){
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        return (hours*3600)+(minutes*60)+seconds;
    }
}