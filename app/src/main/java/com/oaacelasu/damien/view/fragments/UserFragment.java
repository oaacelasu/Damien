package com.oaacelasu.damien.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oaacelasu.damien.R;
import com.oaacelasu.damien.adapter.PictureAdapterRecyclerView;
import com.oaacelasu.damien.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment {


    public UserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        showToolbar("", true, view);

        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureUserRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPictures(), R.layout.cardview_picture, getActivity());

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;
    }

    public void showToolbar(String tittle, boolean upButton, View view){
        android.support.v7.widget.Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://www.10puntos.net//wp-content/uploads/2015/04/perros-populares-google-1.jpg", "Oscar Acelas", "4", "3 Me gusta"));
        pictures.add(new Picture("https://www.10puntos.net//wp-content/uploads/2015/04/perros-populares-google-2.jpg", "Miguel Dominguez", "15", "2 Me gusta"));
        pictures.add(new Picture("https://www.10puntos.net//wp-content/uploads/2015/04/perros-populares-google-3.jpg", "Camila Díaz", "9", "32 Me gusta"));
        pictures.add(new Picture("https://www.10puntos.net//wp-content/uploads/2015/04/perros-populares-google-4.jpg", "Juan Acevedo", "8", "154 Me gusta"));
        pictures.add(new Picture("https://www.10puntos.net//wp-content/uploads/2015/04/perros-populares-google-5.jpg", "Daniel Upegui", "6", "35 Me gusta"));
        pictures.add(new Picture("https://www.10puntos.net//wp-content/uploads/2015/04/perros-populares-google-6.jpg", "Pedro Sabogal", "2", "67 Me gusta"));
        pictures.add(new Picture("https://www.10puntos.net//wp-content/uploads/2015/04/perros-populares-google-7.jpg", "July Nieto", "7", "54 Me gusta"));
        pictures.add(new Picture("https://www.10puntos.net//wp-content/uploads/2015/04/perros-populares-google-8.jpg", "Alfonso Cardenas", "5", "54 Me gusta"));
        pictures.add(new Picture("https://www.10puntos.net//wp-content/uploads/2015/04/perros-populares-google-9.jpg", "Cris Cetina", "3", "26 Me gusta"));
        pictures.add(new Picture("https://www.10puntos.net//wp-content/uploads/2015/04/perros-populares-google-10.jpg", "Karen Macias", "1", "37 Me gusta"));
        return pictures;
    }
}
