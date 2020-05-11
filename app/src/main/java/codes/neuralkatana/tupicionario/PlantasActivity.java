package codes.neuralkatana.tupicionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class PlantasActivity extends AppCompatActivity {
    List<String> listPlantas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantas_);

        String[] arrayPlantas = getResources().getStringArray(R.array.array_plantas);
        listPlantas = Arrays.asList(arrayPlantas);

        LinearLayout root = findViewById(R.id.root_plantas);
        for(String plantas : listPlantas){
            TextView textView = new TextView(this);
            textView.setText(plantas);
            root.addView(textView);
        }
    }
}
