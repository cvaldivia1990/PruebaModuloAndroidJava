package cl.desafiolatam.pruebamoduloandroidjava.HeroeViewModel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


import cl.desafiolatam.pruebamoduloandroidjava.cliente.ClienteRetrofit;
import cl.desafiolatam.pruebamoduloandroidjava.modelo.Heroe;
import cl.desafiolatam.pruebamoduloandroidjava.modelo.HeroeItem;
import cl.desafiolatam.pruebamoduloandroidjava.servicio.HeroeServicio;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HeroeViewModel extends ViewModel {

    private MutableLiveData<Heroe> heroe;
    private MutableLiveData<HeroeItem> superHeroe;

    public HeroeViewModel() {
        load();
        superHeroe = new MutableLiveData<>();
    }

    public void cargarHeroe(HeroeItem item){
        superHeroe.setValue(item);
    }

    private void load(){

        heroe = new MutableLiveData<>();
        HeroeServicio servicio = ClienteRetrofit.getInstance().create(HeroeServicio.class);
        Call<Heroe> call = servicio.getHeroe();
        call.enqueue(new Callback<Heroe>() {
            @Override
            public void onResponse(Call<Heroe> call, Response<Heroe> response) {
                Heroe h = response.body();
                heroe.postValue(h);
                Log.i("Conexion","Esta conectado");
            }

            @Override
            public void onFailure(Call<Heroe> call, Throwable t) {
                Log.i("Conexion","No esta conectado");

            }
        });
    }

    public MutableLiveData<Heroe> getHeroe() { return heroe; }
    public MutableLiveData<HeroeItem> getSuperHeroe() {
        return superHeroe;
    }


}
