package com.estimote.notification;

import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Field;
import java.util.List;
import retrofit2.Call;

public interface RegistroService {

    @POST("Registro")
    @FormUrlEncoded
    Call<Registro> insertRegistro(@Field("becons") String becons, @Field("estado") String estado, @Field("userId") Integer userId);
}
