package cl.desafiolatam.pruebamoduloandroidjava.cliente;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClienteRetrofit {

    private static Retrofit retrofit = null;
    private static final String BASE_URL="https://akabab.github.io/superhero-api/api/";
    public static Retrofit getInstance(){
        if (retrofit == null){
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}