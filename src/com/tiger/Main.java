package com.tiger;

import com.tiger.store.Root;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        AuthorizationToken newAuthToken = new AuthorizationToken();
        Root root = StoresParser.parse(newAuthToken,"2195");
        root.toString();
        root.toString();
    }
}
