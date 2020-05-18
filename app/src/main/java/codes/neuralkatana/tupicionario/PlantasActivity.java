package codes.neuralkatana.tupicionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class PlantasActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantas_);

        String[] arrayPlantas = getResources().getStringArray(R.array.array_plantas);
        final String[] arrayPlantasDesc = getResources().getStringArray(R.array.array_plantas_desc);

        ArrayList<Item> list = new ArrayList();

        for(int i=0; i<arrayPlantas.length; i++){
            String titulo = arrayPlantas[i];
            String desc = arrayPlantasDesc[i];
            Item item = new Item(titulo,desc,R.drawable.ic_plantas);
            list.add(item);
        }

        ItemAdapter itemPlantasAdapter = new ItemAdapter(this,list,R.color.categoria_plantas);

        ListView listView = findViewById(R.id.listview_plantas);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = arrayPlantasDesc[position];
                Toast.makeText(PlantasActivity.this,desc,Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(itemPlantasAdapter);

    }
}
