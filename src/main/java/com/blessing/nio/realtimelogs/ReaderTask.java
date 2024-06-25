package com.blessing.nio.realtimelogs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class ReaderTask {

    public static void main(String[] args) throws IOException, InterruptedException {
        final BufferedReader br = new BufferedReader(new FileReader("bpe.log"));
        String line;
        while (true) {
            line = br.readLine();
            if (line == null) {
                //wait until there is more of the file for us to read
                Thread.sleep(10);
                //System.out.println(line);
            }
            else {
                //do something interesting with the line
                System.out.println(line);
            }
        }
    }
}
