package com.tiger;

import com.tiger.item.Item;
import com.tiger.store.Root;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        AuthorizationToken newAuthToken = new AuthorizationToken();
        Root SolsUnderground = StoresParser.parse(newAuthToken, "2195");
        Root Commons = StoresParser.parse(newAuthToken, "2162");
        System.out.println(Commons.getName());
        Item i = StoresParser.getItem(newAuthToken, new String[]{Commons.getMenus().get(0).getCategories().get(0).getItems().get(0)});

    }
}
