package com.example.sos.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sos.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContactosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactosFragment extends Fragment {

    public ContactosFragment() {
        // Required empty public constructor
    }
    public static ContactosFragment newInstance() {
        ContactosFragment fragment = new ContactosFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contactos, container, false);
    }
}