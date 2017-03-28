package com.allen.rxjava_gankio.retrofitUtils;

import com.allen.rxjava_gankio.model.GirlData;

import retrofit2.adapter.rxjava.Result;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Allen on 2017/3/27.
 */
public interface GirlApi {

    @GET("data/福利/10/{page}")
    Observable<Result<GirlData>> fetchPrettyGirl(@Path("page") int page);
}
