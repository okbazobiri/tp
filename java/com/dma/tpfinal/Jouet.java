package com.dma.tpfinal;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dma.tpfinal.databinding.FragmentJouetBinding;
import com.dma.tpfinal.databinding.FragmentObjetBinding;

public class Jouet extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentJouetBinding binding = FragmentJouetBinding.inflate(inflater,container,false
        );
        binding.btnPlus1.setOnClickListener(new Controller(binding.etQt1,true));
        binding.btnPlus2.setOnClickListener(new Controller(binding.etQt2,true));
        binding.btnPlus3.setOnClickListener(new Controller(binding.etQt3,true));
        binding.btnPlus4.setOnClickListener(new Controller(binding.etQt4,true));
        binding.btnPlus5.setOnClickListener(new Controller(binding.etQt5,true));
        binding.btnPlus6.setOnClickListener(new Controller(binding.etQt6,true));
        binding.btnPlus7.setOnClickListener(new Controller(binding.etQt7,true));
        binding.btnMoin1.setOnClickListener(new Controller(binding.etQt1,false));
        binding.btnMoin2.setOnClickListener(new Controller(binding.etQt2,false));
        binding.btnMoin3.setOnClickListener(new Controller(binding.etQt3,false));
        binding.btnMoin4.setOnClickListener(new Controller(binding.etQt4,false));
        binding.btnMoin5.setOnClickListener(new Controller(binding.etQt5,false));
        binding.btnMoin6.setOnClickListener(new Controller(binding.etQt6,false));
        binding.btnMoin7.setOnClickListener(new Controller(binding.etQt7,false));
        return binding.getRoot();
    }

}