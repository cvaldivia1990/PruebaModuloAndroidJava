package cl.desafiolatam.pruebamoduloandroidjava.ui;

import static cl.desafiolatam.pruebamoduloandroidjava.BR.superHeroe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.squareup.picasso.Picasso;

import cl.desafiolatam.pruebamoduloandroidjava.HeroeViewModel.HeroeViewModel;
import cl.desafiolatam.pruebamoduloandroidjava.R;
import cl.desafiolatam.pruebamoduloandroidjava.databinding.FragmentDetalleBinding;

public class DetalleFragmento extends Fragment {

    private FragmentDetalleBinding binding;
    private HeroeViewModel modelo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetalleBinding.inflate(inflater,container,false);
        modelo = new ViewModelProvider(getActivity()).get(HeroeViewModel.class);
        ((AppCompatActivity) requireActivity()).getSupportActionBar().setTitle(R.string.title_fragmt_det);
        binding.setLifecycleOwner(getViewLifecycleOwner());
        binding.setSuperHeroe(modelo.getSuperHeroe().getValue());

        modelo.getSuperHeroe().observe(getViewLifecycleOwner(), item -> {
            Picasso.get().load(String.valueOf(item.getImages())).into(binding.ivHeroeItem);
        });

        return binding.getRoot();
    }
}
