package com.dma.tpfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.dma.tpfinal.entities.Order;
import com.dma.tpfinal.fragment.Jouet;
import com.dma.tpfinal.fragment.Objet;
import com.dma.tpfinal.fragment.Parfum;
import com.dma.tpfinal.modelview.OrderModelView;

public class Commande extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button valider;
    TextView id;
    TextView quantite;
    TextView date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commande);
        btn1=findViewById(R.id.jouet);
        btn2=findViewById(R.id.parfum);
        btn3=findViewById(R.id.objet);
        valider=findViewById(R.id.button);
        quantite=findViewById(R.id.et_qt1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, Jouet.class,null).commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, Parfum.class,null).commit();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, Objet.class,null).commit();
            }
        });
        OrderModelView orderModelView=new ViewModelProvider(this).get(OrderModelView.class);
        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*int count=0;
                count++;
                Intent intent=new Intent(Commande.this,ListeCommande.class);
                intent.putExtra("count",count);
                startActivity(intent);*/
                Order order = new Order();
                orderModelView.addOrder(order);
                Intent intent=new Intent(Commande.this,ListeCommande.class);
                startActivity(intent);
            }
        });
    }
}