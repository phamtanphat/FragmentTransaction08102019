package com.example.fragmenttransaction08102019;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AndroidFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("BBB","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BBB","onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("BBB","onCreateView");
        return inflater.inflate(R.layout.fragment_android, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("BBB","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("BBB","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("BBB","onResume");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("BBB","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("BBB","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("BBB","onDetach");
    }
}
