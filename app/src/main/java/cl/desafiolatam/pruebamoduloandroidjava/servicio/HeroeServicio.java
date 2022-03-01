package cl.desafiolatam.pruebamoduloandroidjava.servicio;

import cl.desafiolatam.pruebamoduloandroidjava.modelo.Heroe;
import cl.desafiolatam.pruebamoduloandroidjava.modelo.HeroeItem;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface HeroeServicio {

    @GET("all.json")
    Call<Heroe> getHeroe();
    @GET("id/{sid}.json")
    Call<HeroeItem> getSuperhero(@Path("sid") String id);
}



