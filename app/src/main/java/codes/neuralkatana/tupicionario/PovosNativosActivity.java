package codes.neuralkatana.tupicionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PovosNativosActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povos_nativos);

        String[] arrayPovosNativos = getResources().getStringArray(R.array.array_povos_nativos);
        final String[] arrayPovosNativosDesc = getResources().getStringArray(R.array.array_povos_desc);
        ArrayList<Item> list = new ArrayList();

        for(int i = 0; i<arrayPovosNativos.length;i++){
            String titulo = arrayPovosNativos[i];
            String desc = arrayPovosNativosDesc[i];
            Item item = new Item(titulo,desc,R.drawable.ic_povos_nativos);
            list.add(item);
        }

        ItemAdapter povosNativosAdapter = new ItemAdapter(this,list,R.color.categoria_povos_nativos);
        ListView listView = findViewById(R.id.listview_povos_nativos);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = arrayPovosNativosDesc[position];
                Toast.makeText(PovosNativosActivity.this,desc,Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(povosNativosAdapter);

    }
}
