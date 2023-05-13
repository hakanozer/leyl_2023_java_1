package useRetrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import useRetrofit.props.DummyProduct;
import useRetrofit.props.UserLogin;
import useRetrofit.props.UserRequest;

public interface DummyService {

    @POST("auth/login")
    Call<UserRequest> login(@Body UserLogin userLogin);

    @GET("products")
    Call<DummyProduct> allProduct();

}
