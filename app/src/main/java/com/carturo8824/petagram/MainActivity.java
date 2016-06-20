package com.carturo8824.petagram;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.carturo8824.petagram.adapter.MascotaAdaptador;
import com.carturo8824.petagram.adapter.PageAdapter;
import com.carturo8824.petagram.fragment.MascotaFragment;
import com.carturo8824.petagram.fragment.PerfilMascotaFragment;
import com.carturo8824.petagram.pojo.Mascota;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolBar;
    private TabLayout tabLayout;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolBar = (Toolbar) findViewById(R.id.toolBar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        setUpViewPager();

        if (toolBar != null){
            setSupportActionBar(toolBar);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mFavoritos:
                Intent intent = new Intent(this,MascotaFavorita.class);
                startActivity(intent);
                break;
            case R.id.action_Contacto:
                Intent intent_contacto = new Intent(this,Contacto.class);
                startActivity(intent_contacto);
                break;
            case R.id.action_Acerca:
                Intent intent_acerca = new Intent(this,Acerca.class);
                startActivity(intent_acerca);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return  true ;

    }
    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new MascotaFragment());
        fragments.add(new PerfilMascotaFragment());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.home_48);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_pets);
    }
}
