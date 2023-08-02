package com.example.sos.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sos.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EmergenciaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EmergenciaFragment extends Fragment {
    public EmergenciaFragment() {
        // Required empty public constructor
    }

    public static EmergenciaFragment newInstance() {
        EmergenciaFragment fragment = new EmergenciaFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_emergencia, container, false);
    }
}