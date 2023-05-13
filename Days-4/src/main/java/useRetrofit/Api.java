package useRetrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    private static final String base_url = "https://dummyjson.com/";
    private static Retrofit retrofit = null;

    public static Retrofit client() {
        if ( retrofit == null ) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}
