package com.lecuong.utils;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Functions {

    private Functions() {
    }

    public static List<String> getAllLinkRealEstate(final String url) throws IOException {
        Document document = Connect.connectToUrl(url);

        List<String> links = new ArrayList<>();

        Elements doc1 = document.getElementsByClass("dv-item");

        for (int i = 0; i < doc1.size(); i++) {
            Elements elementRows = doc1.get(i).getElementsByTag("a");
            for (int j = 0; j < elementRows.size(); j++) {
                String link = elementRows.first().absUrl("href");
                links.add(link);
            }
        }
        return links;
    }

    public static List<String> getAllProductName(final String url) throws IOException {
        Document document = Connect.connectToUrl(url);
        List<String> nameOfProducts = new ArrayList<>();
        Elements elements = document.getElementsByClass("product-title");

        for (int i = 0; i < elements.size(); i++) {
            String nameOfProduct = elements.get(i).text();
            nameOfProducts.add(nameOfProduct);
        }
        return nameOfProducts;
    }
}