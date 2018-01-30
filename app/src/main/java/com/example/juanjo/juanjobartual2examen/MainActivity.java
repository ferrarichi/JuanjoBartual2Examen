package com.example.juanjo.juanjobartual2examen;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.DatePicker;
import android.widget.Toast;

import com.example.juanjo.juanjobartual2examen.Adaptadores.AdaptadorCursos;
import com.example.juanjo.juanjobartual2examen.Objetos.Clase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerView recycler_clase;

    DatePickerDialog dialogoFecha;

    AlertDialog.Builder alert;


    ArrayList<Clase> lista_clases;

    AdaptadorCursos pa = new AdaptadorCursos(lista_clases);

    String fecha = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recycler_clase = (RecyclerView) findViewById(R.id.recycled_cursos);

        lista_clases = new ArrayList<>();

        recycler_clase.setLayoutManager(new LinearLayoutManager(MainActivity.this));
       //clases.add(" e", "e ", "e ", " e");

        llenarListaPersonajes();

        AdaptadorCursos adapter=new AdaptadorCursos(lista_clases);
        recycler_clase.setAdapter(adapter);


        dialogoFecha = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                Toast.makeText(MainActivity.this,"FECHA: "+ day + "/" + (month+1) + "/" + year , Toast.LENGTH_SHORT).show();

            }
        },  2015,  2,  11);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        alert = new AlertDialog.Builder(MainActivity.this);
        alert.setMessage("Juanjo Bartual || Juanjo29698@gmail.com") .setNegativeButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    private void llenarListaPersonajes() {

        lista_clases.add(new Clase("2n", "DAM",
                "Curso 17-18", "27 Alumnos", R.drawable.disappointment));

        lista_clases.add(new Clase("2n", "DAM",
                "Curso 16-17", "25 Alumnos",R.drawable.disappointment));

        lista_clases.add(new Clase("1r", "DAM",
                "Curso 17-18", "30 Alumnos",R.drawable.sad));

        lista_clases.add(new Clase("1r", "DAM",
                "Curso 16-17", "32 Alumnos",R.drawable.sad));

        lista_clases.add(new Clase("2n", "DAW",
                "Curso 17-18", "20 Alumnos",R.drawable.anger));

        lista_clases.add(new Clase("2n", "DAW",
                "Curso 16-17", "23 Alumnos",R.drawable.anger));

        lista_clases.add(new Clase("1r", "DAW",
                "Curso 17-18", "30 Alumnos",R.drawable.cute));

        lista_clases.add(new Clase("1r", "DAW",
                "Curso 16-17", "29 Alumnos",R.drawable.cute));
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_Fecha) {
            // Handle the camera action

            dialogoFecha.show();

        } else if (id == R.id.nav_informacion) {


             alert.show();


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
