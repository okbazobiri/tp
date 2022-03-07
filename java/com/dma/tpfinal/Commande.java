package com.dma.tpfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.dma.tpfinal.databinding.ActivityCommandeBinding;
import com.dma.tpfinal.databinding.FragmentObjetBinding;
import com.dma.tpfinal.entities.Order;
import com.dma.tpfinal.entities.Product;
import com.dma.tpfinal.modelview.OrderModelView;
import com.dma.tpfinal.modelview.ProductModelView;
import com.google.android.material.tabs.TabItem;

public class Commande extends AppCompatActivity {
    public static final String EXTRA_NUMBER=".com.dma.tpfinal.EXTRA_NUMBER";
    ActivityCommandeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCommandeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.jouet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,Jouet.class,null).commit();
            }
        });
        binding.parfum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,Parfum.class,null).commit();
            }
        });
        binding.objet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,Objet.class,null).commit();
            }
        });
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*int count=0;
                count++;
                Intent intent=new Intent(Commande.this,ListeCommande.class);
                intent.putExtra("count",count);
                startActivity(intent);*/
                Intent intent=new Intent(Commande.this,ListeCommande.class);
                startActivity(intent);
            }
        });
    }
}