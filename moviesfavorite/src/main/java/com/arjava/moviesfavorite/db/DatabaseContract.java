package com.arjava.moviesfavorite.db;

import android.database.Cursor;
import android.net.Uri;
import android.provider.BaseColumns;

/*
 * Created by arjava on 12/13/17.
 */

public class DatabaseContract {

    public static String TABLE_MOVIE_FAVORITE = "favorite_movie";

    public static final class FavoriteColumns implements BaseColumns {

        //favorite id
        public static int ID_SHARE = 0;

        //favorite title
        public static String TITLE = "title";

        //favorite original_title
        public static String ORIGINAL_TITLE = "original_title";

        //favorite overview
        public static String OVERVIEW = "overview";

        //favorite release_date
        public static String RELEASE_DATE = "release_date";

        //favorite poster_path
        public static String POSTER_PATH = "poster_path";

        //favorite backdrop_path
        public static String BACKDROP_PATH = "backdrop_path";

        //favorite vote
        public static String VOTE = "";
    }

    //authority yang dipakai
    public static final String AUTHORITY = "com.arjava.moviefavoritcp";

    //base content yang digunakan untuk akses content provider
    public static final Uri CONTENT_URI = new Uri.Builder().scheme("content")
            .authority(AUTHORITY)
            .appendPath(TABLE_MOVIE_FAVORITE)
            .build();

    //digunakan untuk mempermudah akses data di dalam cursor dengan parameter nama column

    public static String getColumnString(Cursor cursor, String columnName) {
        return cursor.getString(cursor.getColumnIndex(columnName));
    }

    public static double getColumnDouble(Cursor cursor, String columnName) {
        return cursor.getDouble(cursor.getColumnIndex(columnName));
    }

}