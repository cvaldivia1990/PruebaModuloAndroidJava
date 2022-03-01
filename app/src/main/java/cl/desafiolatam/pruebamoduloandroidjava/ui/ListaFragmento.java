package cl.desafiolatam.pruebamoduloandroidjava.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import cl.desafiolatam.pruebamoduloandroidjava.HeroeViewModel.HeroeViewModel;
import cl.desafiolatam.pruebamoduloandroidjava.R;
import cl.desafiolatam.pruebamoduloandroidjava.adaptador.HeroeAdaptador;
import cl.desafiolatam.pruebamoduloandroidjava.databinding.FragmentListaBinding;

public class ListaFragmento extends Fragment {

    private FragmentListaBinding binding;
    private HeroeViewModel modelo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentListaBinding.inflate(inflater, container, false);
        modelo = new ViewModelProvider(getActivity()).get(HeroeViewModel.class);
        HeroeAdaptador adapter = new HeroeAdaptador();
        ((AppCompatActivity) requireActivity()).getSupportActionBar().setTitle(R.string.title_frag_list);
//        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
        binding.rvLista.setAdapter(adapter);
        binding.rvLista.setLayoutManager(gridLayoutManager);

        adapter.setListener(item -> {
            modelo.cargarHeroe(item);
            Navigation.findNavController(getView()).navigate(R.id.action_listaFragment_to_detalleFragment);
        });

        modelo.getHeroe().observe(getViewLifecycleOwner(), heroe -> {
            adapter.setLista(heroe.getHeroe());
        });

        return binding.getRoot();
    }
}