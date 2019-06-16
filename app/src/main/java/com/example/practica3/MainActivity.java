package com.example.practica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<DataInfo> arrayList;
    private MyAdapter adapter;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadComponets();
    }

    private void loadComponets() {
        listView = findViewById(R.id.listView);
        arrayList = new ArrayList<>();

        adapter = new MyAdapter(this, arrayList);

        listView.setOnItemClickListener(this);
    }
    /*
    * lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final int pos = position;
                //CODIGO AQUI

            }
        });
    * */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = this.getMenuInflater();
        inflate.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.cherry:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.cereza);
                info.setName("CEREZA");
                info.setDescription("Coco: description");
                info.setQuantity(1); //
                arrayList.add(info);
                break;
            }
            case R.id.coconut:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.coco);
                info.setName("COCO");
                info.setDescription("Coco: description");
                info.setQuantity(1); //
                arrayList.add(info);
                break;
            }
            case R.id.raspberry:{
                DataInfo info = new DataInfo();
                arrayList.remove(arrayList.size()-1);
                break;
            }
            case R.id.strawberry:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.fresa);
                info.setName("FRESA");
                info.setDescription("Fresa: description");
                info.setQuantity(1); //
                arrayList.add(info);
                break;
            }
            case R.id.orange:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.naranja);
                info.setName("NARANJA");
                info.setDescription("Naranja: description");
                info.setQuantity(1); //
                arrayList.add(info);
                break;
            }
            case R.id.pineapple:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.pina);
                info.setName("PIÑA");
                info.setDescription("Piña: description");
                info.setQuantity(1); //
                arrayList.add(info);
                break;
            }
            case R.id.watermelon:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.sandia);
                info.setName("SANDÍA");
                info.setDescription("Sandía: description");
                info.setQuantity(1); //
                arrayList.add(info);
                break;
            }
            case R.id.grapes:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.uvas);
                info.setName("Uva");
                info.setDescription("Uva: description");
                info.setQuantity(1); //
                arrayList.add(info);
                break;
            }
        }
        listView.setAdapter(adapter);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        //String s = arrayList.get(position).getName();
        //registerForContextMenu(view);
        /*arrayList.get(position).setQuantity(arrayList.get(position).getQuantity()+1);
        listView.setAdapter(adapter);*/
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.item_menu, menu);
    }
}
