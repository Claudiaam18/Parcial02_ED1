package ed.lab;

import java.util.*;

public class E01MeetingRooms {

    public class MeetingInterval {
        public int start;
        public int end;

        public int minMeetingRooms(List<MeetingInterval> meetingIntervals) {
            if (meetingIntervals == null || meetingIntervals.size() == 0) {
                return 0;
            }

            List<Integer> inicios = new ArrayList<>();
            List<Integer> finales = new ArrayList<>();

            for (MeetingInterval m : meetingIntervals) {
                inicios.add(m.start);
                finales.add(m.end);
            }

            Collections.sort(inicios);
            Collections.sort(finales);

            int salas = 0;
            int fin = 0;

            for (int i = 0; i < inicios.size(); i++) {
                if (inicios.get(i) < finales.get(fin)) {
                    salas++;
                } else {
                    fin++;
                }
            }

            return salas;
        }
    }
}