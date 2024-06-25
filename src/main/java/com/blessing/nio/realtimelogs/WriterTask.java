package com.blessing.nio.realtimelogs;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class WriterTask {

    public static void main(String[] args) throws IOException {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                final Path path = Paths.get("bpe.log");
                final String now = LocalDateTime.now().toString();
                try {
                    Files.write(path, List.of(now), StandardCharsets.UTF_8,
                            Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);

                    System.out.println(now);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 10000);
    }
}
