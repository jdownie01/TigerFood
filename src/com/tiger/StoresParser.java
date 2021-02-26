package com.tiger;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tiger.store.Root;


public class StoresParser {
    public static Root parse(AuthorizationToken token) throws IOException{
        try {
            String command =
                    "curl --insecure 'https://ondemand.rit.edu/api/sites/1312' " +
                            "-H 'User-Agent: Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:85.0) Gecko/20100101 Firefox/85.0' " +
                            "-H 'Accept: application/json, text/plain, */*' " +
                            "-H 'Accept-Language: en-US,en;q=0.5' --compressed " +
                            "-H 'X-NewRelic-ID: UQAOVVJQGwEIU1daAAgEXw==' " +
                            "-H 'Authorization: Bearer "+token.getAccessToken()+
                            "-H 'client_time: 2021-02-25T17:04:02-05:00' " +
                            "-H 'Connection: keep-alive' " +
                            "-H 'Referer: https://ondemand.rit.edu/' " +
                            "-H 'Cookie: _ga_DY6XXZS0V2=GS1.1.1614231329.15.1.1614232850.0; _ga=GA1.1.1943111319.1613585552; __utmzz=utmcsr=google|utmccn=(organic)|utmcmd=organic|utmctr=(not%20provided); _fbp=fb.1.1613585553254.882945265; _scid=5b609afa-8ab5-4fad-9755-66a84d592e2e; nmstat=a5921877-762f-cc4d-1d20-afde426e973a; _sctr=1|1614142800000; __stripe_mid=acbb2e3c-a51c-4f49-b7f9-37a76fd91026bc6b1a; __utma=242358273.1943111319.1613585552.1614225105.1614232825.7; __utmz=242358273.1614232825.7.4.utmcsr=google|utmccn=(organic)|utmcmd=organic|utmctr=(not%20provided); _gid=GA1.2.738278359.1614140121; ADRUM=s=1614233490831&r=https%3A%2F%2Fmycourses.rit.edu%2Fd2l%2Fle%2Fcontent%2F878610%2FviewContent%2F6993368%2FView%3F0; __utmc=242358273; __utmzzses=1; __stripe_sid=000cd995-eec0-4cbb-ba78-0a1a65c65bf90c3a13'";
            ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));
            processBuilder.directory(new File("/home/"));
            Process process = processBuilder.start();
            InputStream inputStream = process.getInputStream();
            ObjectMapper om = new ObjectMapper();
            Root root = om.readValue(inputStream.readAllBytes(),Root.class);
            return root;
        } catch (Exception e){
            System.out.println("error!");
        }
        return null;
    }

}
