package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CancionesViewHolder> {
    private int canciones;

    public RecyclerAdapter(int numCanciones){
        canciones = numCanciones;
    }

    @NonNull
    @Override
    public CancionesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layoutIdParaListItem = R.layout.lista_canciones_row;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        boolean attach = false;

        View view = inflater.inflate(layoutIdParaListItem, parent, attach);

        CancionesViewHolder viewHolder = new CancionesViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull CancionesViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return canciones;
    }

    public class CancionesViewHolder extends RecyclerView.ViewHolder{
        TextView tvListaCancionesItem;
        public CancionesViewHolder(@NonNull View itemView){
            super(itemView);
            tvListaCancionesItem = itemView.findViewById(R.id.ListaItemCancion);
            ImageView imagenCheck = itemView.findViewById(R.id.imagenCheck);
            tvListaCancionesItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    imagenCheck.setVisibility(View.VISIBLE);
                    tvListaCancionesItem.setText("Clicado " + getAdapterPosition());
                }
            });
        }
        void bind (int listaIndex) {
            tvListaCancionesItem.setText(String.valueOf(listaIndex));
        }
    }



}
