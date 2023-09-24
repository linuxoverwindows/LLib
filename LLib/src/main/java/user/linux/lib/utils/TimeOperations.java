package user.linux.lib.utils;

import java.time.Instant;
import java.util.Timer;
import java.util.TimerTask;

public class TimeOperations {
    public static Instant getCurrentTime() {
        return Instant.now();
    }

    public static long timeElapsed(Instant startTime) {
        return Instant.now().getEpochSecond() - startTime.getEpochSecond();
    }

    public static long timeRemaining(Instant endTime) {
        return endTime.getEpochSecond() - Instant.now().getEpochSecond();
    }

    public static Timer countdownTimer(int seconds, Runnable callback) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int remainingSeconds = seconds;

            @Override
            public void run() {
                if (remainingSeconds <= 0) {
                    timer.cancel();
                    callback.run();
                }
                remainingSeconds--;
            }
        }, 0, 1000);
        return timer;
    }

    public static class Stopwatch {
        private Instant startTime;

        public void start() {
            this.startTime = Instant.now();
        }

        public long stop() {
            return timeElapsed(startTime);
        }
    }
}