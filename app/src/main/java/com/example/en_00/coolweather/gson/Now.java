package com.example.en_00.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by en_00 on 2018/1/2.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
