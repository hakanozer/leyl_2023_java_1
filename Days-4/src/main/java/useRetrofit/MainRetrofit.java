package useRetrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import useRetrofit.props.DummyProduct;
import useRetrofit.props.UserLogin;
import useRetrofit.props.UserRequest;

public class MainRetrofit {
    public static void main(String[] args) {

        UserLogin login = new UserLogin();
        login.setUsername("kminchelle");
        login.setPassword("0lelplR");

        DummyService dummyService = Api.client().create(DummyService.class);
        dummyService.login(login).enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<UserRequest> call, Response<UserRequest> response) {
                if (response.isSuccessful() ) {
                    UserRequest userRequest = response.body();
                    System.out.println( userRequest );
                }
            }

            @Override
            public void onFailure(Call<UserRequest> call, Throwable throwable) {
                System.err.println("Login Error: " + throwable);
            }
        });

        dummyService.allProduct().enqueue(new Callback<DummyProduct>() {
            @Override
            public void onResponse(Call<DummyProduct> call, Response<DummyProduct> response) {
                if(response.isSuccessful()) {
                    DummyProduct product = response.body();
                    product.getProducts().forEach( item -> {
                        System.out.println( item.getTitle() );
                    });
                }
            }

            @Override
            public void onFailure(Call<DummyProduct> call, Throwable throwable) {

            }
        });

    }
}
