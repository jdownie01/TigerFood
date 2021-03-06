package com.tiger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tiger.item.Item;
import com.tiger.store.Root;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class StoresParser {

    public static Root parse(AuthorizationToken token, String storeID) throws IOException {
        try {
            String[] command = new String[]{"curl", "--insecure", "https://ondemand.rit.edu/api/sites/1312/dc9df36d-8a64-42cf-b7c1-fa041f5f3cfd/concepts/" + storeID, "-H", "User-Agent: Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:85.0) Gecko/20100101 Firefox/85.0", "-H",
                    "Accept: application/json, text/plain, */*", "-H", "Accept-Language: en-US,en;q=0.5", "--compressed", "-H", "X-NewRelic-ID: UQAOVVJQGwEIU1daAAgEXw==", "-H", "Authorization: Bearer" + token.getAccessToken().split("\r")[0], "-H", "client_time: 2021-02-25T17:04:02-05:00", "-H", "Connection: keep-alive", "-H", "Referer: https://ondemand.rit.edu/", "-H", "Cookie: _ga_DY6XXZS0V2=GS1.1.1614231329.15.1.1614232850.0; _ga=GA1.1.1943111319.1613585552; __utmzz=utmcsr=google|utmccn=(organic)|utmcmd=organic|utmctr=(not%20provided); _fbp=fb.1.1613585553254.882945265; _scid=5b609afa-8ab5-4fad-9755-66a84d592e2e; nmstat=a5921877-762f-cc4d-1d20-afde426e973a; _sctr=1|1614142800000; __stripe_mid=acbb2e3c-a51c-4f49-b7f9-37a76fd91026bc6b1a; __utma=242358273.1943111319.1613585552.1614225105.1614232825.7; __utmz=242358273.1614232825.7.4.utmcsr=google|utmccn=(organic)|utmcmd=organic|utmctr=(not%20provided);", "_gid=GA1.2.738278359.1614140121; ADRUM=s=1614233490831&r=https%3A%2F%2Fmycourses.rit.edu%2Fd2l%2Fle%2Fcontent%2F878610%2FviewContent%2F6993368%2FView%3F0; __utmc=242358273; __utmzzses=1; __stripe_sid=000cd995-eec0-4cbb-ba78-0a1a65c65bf90c3a13", "--data-raw", "{\"scheduledDay\":0}"};
            System.out.println(Arrays.toString(command));

            Process process = Runtime.getRuntime().exec(command);
            InputStream inputStream = process.getInputStream();
            String output = new String(inputStream.readAllBytes());
            String jsonString = output.replaceAll("^.|.$", "");
            System.out.println(jsonString);
            JSONObject obj = new JSONObject(jsonString);
            ObjectMapper om = new ObjectMapper();
            Root root = om.readValue(output.replaceAll("^.|.$", "").replaceAll("/n", ""), Root.class);
            return root;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error!");
        }
        return null;
    }

    public static Item getItem(AuthorizationToken token, String[] itemIds) throws IOException {
        Type listType = new TypeToken<ArrayList<Item>>() {
        }.getType();

        String itemstring = "{\"conceptId\":\"4126\",\"itemIds\":[";
        String endstring = "],\"storePriceLevel\":\"1\",\"currencyUnit\":\"USD\"}";
        for (String id : itemIds) {
            itemstring += "\"" + id + "\"";
        }
        itemstring += endstring;

        String[] command = new String[]{"curl", "--insecure", "https://ondemand.rit.edu/api/sites/1312/dc9df36d-8a64-42cf-b7c1-fa041f5f3cfd/kiosk-items/get-items", "-H", "User-Agent: Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:85.0) Gecko/20100101 Firefox/85.0", "-H",
                "Accept: application/json, text/plain, */*", "-H", "Accept-Language: en-US,en;q=0.5", "--compressed", "-H", "X-NewRelic-ID: UQAOVVJQGwEIU1daAAgEXw==", "-H", "Authorization: Bearer" + token.getAccessToken().split("\r")[0], "-H", "client_time: 2021-02-25T17:04:02-05:00", "-H", "Connection: keep-alive", "-H", "Referer: https://ondemand.rit.edu/", "-H", "Cookie: _ga_DY6XXZS0V2=GS1.1.1614231329.15.1.1614232850.0; _ga=GA1.1.1943111319.1613585552; __utmzz=utmcsr=google|utmccn=(organic)|utmcmd=organic|utmctr=(not%20provided); _fbp=fb.1.1613585553254.882945265; _scid=5b609afa-8ab5-4fad-9755-66a84d592e2e; nmstat=a5921877-762f-cc4d-1d20-afde426e973a; _sctr=1|1614142800000; __stripe_mid=acbb2e3c-a51c-4f49-b7f9-37a76fd91026bc6b1a; __utma=242358273.1943111319.1613585552.1614225105.1614232825.7; __utmz=242358273.1614232825.7.4.utmcsr=google|utmccn=(organic)|utmcmd=organic|utmctr=(not%20provided);", "_gid=GA1.2.738278359.1614140121; ADRUM=s=1614233490831&r=https%3A%2F%2Fmycourses.rit.edu%2Fd2l%2Fle%2Fcontent%2F878610%2FviewContent%2F6993368%2FView%3F0; __utmc=242358273; __utmzzses=1; __stripe_sid=000cd995-eec0-4cbb-ba78-0a1a65c65bf90c3a13",
                "--data-raw", itemstring};
        System.out.println(Arrays.toString(command));
        Process process = Runtime.getRuntime().exec(command);
        InputStream inputStream = process.getInputStream();
        String output = new String(inputStream.readAllBytes());
        Object jsonE = new Gson().fromJson(output, listType);
        System.out.println(jsonE);
        return null;
    }

    public static Root getAccountInfo(AuthorizationToken token, String UID) throws IOException {
        try {
            String[] command = new String[]{"curl", "--insecure", "https://ondemand.rit.edu/api/atrium/accountInquiry", "-H", "User-Agent: Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:85.0) Gecko/20100101 Firefox/85.0", "-H",
                    "Accept: application/json, text/plain, */*", "-H", "Accept-Language: en-US,en;q=0.5", "--compressed", "-H", "X-NewRelic-ID: UQAOVVJQGwEIU1daAAgEXw==", "-H", "Authorization: Bearer" + token.getAccessToken().split("\r")[0], "-H", "client_time: 2021-02-25T17:04:02-05:00", "-H", "Connection: keep-alive", "-H", "Referer: https://ondemand.rit.edu/", "-H", "Cookie: _ga_DY6XXZS0V2=GS1.1.1614231329.15.1.1614232850.0; _ga=GA1.1.1943111319.1613585552; __utmzz=utmcsr=google|utmccn=(organic)|utmcmd=organic|utmctr=(not%20provided); _fbp=fb.1.1613585553254.882945265; _scid=5b609afa-8ab5-4fad-9755-66a84d592e2e; nmstat=a5921877-762f-cc4d-1d20-afde426e973a; _sctr=1|1614142800000; __stripe_mid=acbb2e3c-a51c-4f49-b7f9-37a76fd91026bc6b1a; __utma=242358273.1943111319.1613585552.1614225105.1614232825.7; __utmz=242358273.1614232825.7.4.utmcsr=google|utmccn=(organic)|utmcmd=organic|utmctr=(not%20provided);", "_gid=GA1.2.738278359.1614140121; ADRUM=s=1614233490831&r=https%3A%2F%2Fmycourses.rit.edu%2Fd2l%2Fle%2Fcontent%2F878610%2FviewContent%2F6993368%2FView%3F0; __utmc=242358273; __utmzzses=1; __stripe_sid=000cd995-eec0-4cbb-ba78-0a1a65c65bf90c3a13", "--data-raw", "[{\"tenderId\":\"9\",\"data\":{\"tenantId\":\"1312\",\"contextId\":\"dc9df36d-8a64-42cf-b7c1-fa041f5f3cfd\",\"tenderId\":\"1\",\"atriumTerminal\":{\"terminalId\":1715},\"customer\":{\"customerType\":\"campusid\",\"id\":\"" + UID + "\"}}},{\"tenderId\":\"16\",\"data\":{\"tenantId\":\"1312\",\"contextId\":\"dc9df36d-8a64-42cf-b7c1-fa041f5f3cfd\",\"tenderId\":\"4\",\"atriumTerminal\":{\"terminalId\":1715},\"customer\":{\"customerType\":\"campusid\",\"id\":\"" + UID + "\"}}}]"};
            System.out.println(Arrays.toString(command));

            Process process = Runtime.getRuntime().exec(command);
            InputStream inputStream = process.getInputStream();
            String output = new String(inputStream.readAllBytes());
            String jsonString = output.replaceAll("^.|.$", "");
            System.out.println(jsonString);
            JSONObject obj = new JSONObject(jsonString);
            ObjectMapper om = new ObjectMapper();
            Root root = om.readValue(output.replaceAll("^.|.$", "").replaceAll("/n", ""), Root.class);
            return root;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error!");
        }
        return null;
    }
}
