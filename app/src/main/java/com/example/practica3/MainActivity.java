package com.example.practica3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataInfo> arrayList;
    private MyAdapter adapter;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        loadComponets();
    }

    private void loadComponets() {
        listView = findViewById(R.id.listView);
        arrayList = new ArrayList<>();

        adapter = new MyAdapter(this, arrayList);
        registerForContextMenu(listView);
    }

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
                info.setQuantity(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getName().equals("CEREZA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La fruta ya existe", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.coconut:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.coco);
                info.setName("COCO");
                info.setDescription("Coco: description");
                info.setQuantity(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getName().equals("COCO"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La fruta ya existe", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.raspberry:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.frambuesa);
                info.setName("FRAMBUESA");
                info.setDescription("Frambuesa: description");
                info.setQuantity(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getName().equals("FRAMBUESA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La fruta ya existe", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.strawberry:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.fresa);
                info.setName("FRESA");
                info.setDescription("Fresa: description");
                info.setQuantity(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getName().equals("FRESA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La fruta ya existe", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.orange:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.naranja);
                info.setName("NARANJA");
                info.setDescription("Naranja: description");
                info.setQuantity(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getName().equals("NARANJA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La fruta ya existe", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.pineapple:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.pina);
                info.setName("PIÑA");
                info.setDescription("Piña: description");
                info.setQuantity(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getName().equals("PIÑA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La fruta ya existe", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.watermelon:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.sandia);
                info.setName("SANDÍA");
                info.setDescription("Sandía: description");
                info.setQuantity(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getName().equals("SANDÍA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La fruta ya existe", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.grapes:{
                DataInfo info = new DataInfo();
                info.setImg(R.drawable.uvas);
                info.setName("UVA");
                info.setDescription("Uva: description");
                info.setQuantity(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getName().equals("UVA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La fruta ya existe", Toast.LENGTH_SHORT).show();
                }
                break;
            }
        }
        listView.setAdapter(adapter);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;

        getMenuInflater().inflate(R.menu.item_menu, menu);
        menu.setHeaderTitle(arrayList.get(info.position).getName());

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.item_reset: {
                arrayList.get(info.position).setQuantity(0);
                listView.setAdapter(adapter);
                break;
            }
            case R.id.item_delete: {
                arrayList.remove(info.position);
                listView.setAdapter(adapter);
                break;
            }
            default:
                Toast.makeText(this, "Jhonattan Joel", Toast.LENGTH_SHORT).show(); break;
        }

        return true;
    }

}