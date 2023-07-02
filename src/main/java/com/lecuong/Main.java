package com.lecuong;

import com.lecuong.entity.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static com.lecuong.utils.Functions.getAllProductName;

public class Main {

    private static final String URL = "https://4menshop.com/";

    public static void main(String[] args) throws IOException {

        List<String> links = new ArrayList<>(getAllProductName(URL));
        System.out.println(links);
    }


}
