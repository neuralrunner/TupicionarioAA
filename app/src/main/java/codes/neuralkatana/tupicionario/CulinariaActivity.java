package codes.neuralkatana.tupicionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class CulinariaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinaria);

        String[] arrayCulinaria = getResources().getStringArray(R.array.array_culinaria);
        final String[] arrayCulinariaDesc = getResources().getStringArray(R.array.array_culinaria_desc);

        ArrayList<Item> list = new ArrayList<>();

        for(int i=0; i<arrayCulinaria.length;i++){
            String titulo = arrayCulinaria[i];
            String desc = arrayCulinariaDesc[i];
            Item item = new Item(titulo,desc,R.drawable.ic_culinaria);
            list.add(item);
        }
        ItemAdapter itemsCulinariaAdapter = new ItemAdapter(this,list,R.color.categoria_culinaria);

        ListView listView = findViewById(R.id.listview_culinaria);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = arrayCulinariaDesc[position];
                Toast.makeText(CulinariaActivity.this,desc,Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(itemsCulinariaAdapter);
    }
}
