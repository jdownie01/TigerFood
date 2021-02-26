package com.tiger;

import com.tiger.store.Root;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        AuthorizationToken newAuthToken = new AuthorizationToken();
        Root root = StoresParser.parse(newAuthToken);
        root.
    }
}
