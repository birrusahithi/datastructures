import java.util.Arrays;

public class MeetingRooms {
        public boolean canAttendMeetings(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            int left = 0;
            int count = 1;
            while (left < intervals.length - 1) {
                if (intervals[left][1] <= intervals[left + 1][0])
                    count++;
                left++;
            }
            if (count == intervals.length || intervals.length == 0) {
                return true;
            }
            return false;
        }
    }
