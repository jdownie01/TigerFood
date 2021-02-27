package com.tiger;

import com.tiger.store.Category;
import com.tiger.store.Root;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        AuthorizationToken newAuthToken = new AuthorizationToken();
        Root SolsUnderground = StoresParser.parse(newAuthToken,"2195");
        Root Commons = StoresParser.parse(newAuthToken,"2162");
        System.out.println(Commons.getName());
        for (Category c : Commons.getMenus().get(0).getCategories()){
            System.out.println(c.getName());
            System.out.println(c.getItems());
        }

    }
}
