package es.antoniomb.utils;

import java.text.SimpleDateFormat;

/**
 * Created by amiranda on 18/9/16.
 */
public class FAUtils {

    public static SimpleDateFormat MONTH_FORMAT = new SimpleDateFormat("MMM");

    public enum URLS {
        HOME("http://www.filmaffinity.com/en/main.php"),
        FILM("http://www.filmaffinity.com/en/film"),
        FILM_SUFIX(".html"),
        LOGIN("http://www.filmaffinity.com/en/login.php"),
        LOGIN_POST("https://filmaffinity.com/en/account.ajax.php?action=login"),
        VOTES("http://www.filmaffinity.com/en/myvotes.php"),
        VOTES_PREFIX("http://www.filmaffinity.com/en/myvotes.php?p="),
        VOTES_SUFIX("&orderby="),
        RATINGS("http://www.filmaffinity.com/en/userratings.php?user_id="),
        PAGE_PREFIX("&p=");

        String url;

        URLS(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }
}
