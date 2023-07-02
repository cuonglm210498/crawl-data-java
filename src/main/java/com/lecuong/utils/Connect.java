package com.lecuong.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Connect {

    private Connect() {}

    public static Document connectToUrl(final String url) throws IOException {
        return Jsoup.connect(url).get();
    }
}
