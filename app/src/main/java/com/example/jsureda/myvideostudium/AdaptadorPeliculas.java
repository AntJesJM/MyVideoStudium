package com.example.jsureda.myvideostudium;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by xemy0 on 29/01/2018.
 */

public class AdaptadorPeliculas extends ArrayAdapter {
    Activity act;
    Pelicula[] info;

    AdaptadorPeliculas(Activity act, Pelicula[] info) {
        super(act, R.layout.model_info_peliculas, info);
        this.act = act;
        this.info = info;
    };

    public View getView(int position, View convertView, ViewGroup parent) {

        View item = convertView;
        PeliculaHolder holder;

        if (item == null) {
            LayoutInflater inflater = act.getLayoutInflater();

            item = inflater.inflate(R.layout.model_info_peliculas, null);
            holder = new PeliculaHolder();
            holder.titulo = (TextView) item.findViewById(R.id.lblTitulo);
            holder.anio = (TextView) item.findViewById(R.id.lblAnio);
            holder.nota = (TextView) item.findViewById(R.id.lblNota);
            holder.imagen = (ImageView) item.findViewById(R.id.imgLista) ;
            item.setTag(holder);
        } else {
            holder = (PeliculaHolder) item.getTag();
        }


        holder.titulo.setText(info[position].getTitulo());
        holder.anio.setText(info[position].getAnio());
        holder.nota.setText(String.valueOf(info[position].getNota()));
        holder.imagen.setImageResource(info[position].getImagen());
        return (item);
    }
}
