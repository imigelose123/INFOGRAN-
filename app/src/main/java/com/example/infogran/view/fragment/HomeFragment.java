package com.example.infogran.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.infogran.R;
import com.example.infogran.adapter.CardViewAdapter;
import com.example.infogran.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //toolbar
        showToolBar(getString(R.string.title_gome_fragment), false, view);

        //recyclearview

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        //layout manager

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //el adapter
        CardViewAdapter cardViewAdapter = new CardViewAdapter(buidImages(), R.layout.cardview_image, getActivity());
        recyclerView.setAdapter(cardViewAdapter);

        return view;
    }

    public void showToolBar(String titulo, boolean botomSubir, View view) {
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botomSubir);

    }

    //creamso la lsita de imagenes
    public ArrayList<Image> buidImages() {
        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image("", "Carlos Valvidia", "1 dias", "1 me gusta"));
        images.add(new Image("", "juan Valvidia", "3 dias", "4 me gusta"));
        images.add(new Image("", "pedro Valvidia", "4 dias", "6 me gusta"));
        images.add(new Image("", "juna Valvidia", "21 dias", "2 me gusta"));
        images.add(new Image("", "ale Valvidia", "12 dias", "4 me gusta"));
        images.add(new Image("", "dani Valvidia", "0 dias", "6 me gusta"));
        images.add(new Image("", "roberto Valvidia", "8 dias", "8 me gusta"));
        images.add(new Image("", "lupe Valvidia", "2 dias", "5 me gusta"));
        images.add(new Image("", "ariel Valvidia", "5 dias", "1 me gusta"));
        images.add(new Image("", "chamo Valvidia", "5 dias", "9 me gusta"));

    }
}


