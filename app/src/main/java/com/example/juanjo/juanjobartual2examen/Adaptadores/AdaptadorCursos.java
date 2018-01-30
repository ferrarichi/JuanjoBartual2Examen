package com.example.juanjo.juanjobartual2examen.Adaptadores;

import android.content.DialogInterface;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.juanjo.juanjobartual2examen.Objetos.Clase;
import com.example.juanjo.juanjobartual2examen.R;

import java.util.ArrayList;

/**
 * Created by Juanjo on 30/1/18.
 */

import com.example.juanjo.juanjobartual2examen.Objetos.Clase;
import com.example.juanjo.juanjobartual2examen.R;

public class AdaptadorCursos extends RecyclerView.Adapter<AdaptadorCursos.ProductViewHolder>{



    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView classCurso;
        TextView classgrado;
        TextView classFecha;
        TextView classAlumnos;
        ImageView imagen;

        ProductViewHolder(View itemView) {
            super(itemView);
            classCurso = itemView.findViewById(R.id.item_curso);
            classgrado = itemView.findViewById(R.id.item_grado);
            classFecha = itemView.findViewById(R.id.item_fecha);
            classAlumnos = itemView.findViewById(R.id.item_alumnos);
            imagen = itemView.findViewById(R.id.imageView2);
        }




    }
    ArrayList<Clase> clases;


    public AdaptadorCursos(ArrayList<Clase> clases){
        this.clases = clases;
    }

    @Override
    public int getItemCount() {

        return clases.size();
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_curso, parent, false);
        ProductViewHolder pvh = new ProductViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder productViewHolder, final int i) {

        productViewHolder.classCurso.setText(clases.get(i).getCurso());
        productViewHolder.classgrado.setText(clases.get(i).getGrado());
        productViewHolder.classFecha.setText(clases.get(i).getFecha());
        productViewHolder.classAlumnos.setText(clases.get(i).getAlumnos());
        productViewHolder.imagen.setImageResource(clases.get(i).getImagen());

    }





}
