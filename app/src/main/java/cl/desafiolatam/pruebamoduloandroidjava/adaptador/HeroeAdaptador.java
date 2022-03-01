package cl.desafiolatam.pruebamoduloandroidjava.adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.pruebamoduloandroidjava.R;
import cl.desafiolatam.pruebamoduloandroidjava.databinding.ItemLayoutBinding;
import cl.desafiolatam.pruebamoduloandroidjava.modelo.HeroeItem;

public class HeroeAdaptador extends RecyclerView.Adapter<HeroeAdaptador.CustomViewHolder> {


    private List<HeroeItem> lista;
    private OnClickListener listener;

    public HeroeAdaptador() {
        lista = new ArrayList<>();
    }

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void setLista(List<HeroeItem> lista) {
        this.lista = lista;
        notifyDataSetChanged();
    }

    public interface OnClickListener {
        void onClickListener(HeroeItem item);
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new CustomViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.bindData(lista.get(position));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        private ItemLayoutBinding binding;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemLayoutBinding.bind(itemView);
        }

        public void bindData(HeroeItem item) {
            Picasso.get().load(String.valueOf(item.getImages())).resize(400, 600)
                    .into(binding.ivHeroe);
            itemView.setOnClickListener(v -> {
                listener.onClickListener(item);
            });
        }
    }
}
