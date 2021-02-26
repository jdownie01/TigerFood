package com.tiger;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class AuthorizationToken {

    private final String accessToken;
    private final String refreshToken;

    public AuthorizationToken() throws IOException {
        String command =
                "curl -X PUT https://ondemand.rit.edu/api/login/anonymous/1312 --insecure --include";
        ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
        processBuilder.directory(new File("/home/"));
        Process process = processBuilder.start();
        InputStream inputStream = process.getInputStream();
        StringBuilder textBuilder = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader
                (inputStream, Charset.forName(StandardCharsets.UTF_8.name())))) {
            int c = 0;
            while ((c = reader.read()) != -1) {
                textBuilder.append((char) c);
            }
        }
        this.accessToken = textBuilder.toString().split(": ")[5].split("\n")[0];
        this.refreshToken = textBuilder.toString().split(": ")[6].split("\n")[0];
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }
}
