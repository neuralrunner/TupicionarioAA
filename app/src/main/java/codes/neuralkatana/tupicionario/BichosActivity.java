package codes.neuralkatana.tupicionario;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class BichosActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bichos);

        final String[] arrayBichos = getResources().getStringArray(R.array.array_bichos);
        final String[] arrayBichosDesc = getResources().getStringArray(R.array.array_bichos_desc);

        ArrayList<Item> list = new ArrayList<>();
        for(int i=0; i<arrayBichos.length; i++){
            String titulo = arrayBichos[i];
            String desc = arrayBichosDesc[i];
            Item item = new Item(titulo, desc, R.drawable.ic_bichos);
            list.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, list, R.color.categoria_bichos);

        ListView listView = findViewById(R.id.listview_bichos);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = arrayBichosDesc[position];
                Toast.makeText(BichosActivity.this,desc,Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(adapter);
    }
}
