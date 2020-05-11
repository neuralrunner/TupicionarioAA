package codes.neuralkatana.tupicionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class PovosNativosActivity extends AppCompatActivity {
    private List<String> listPovosNativos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povos_nativos);

        String[] arrayPovosNativos = getResources().getStringArray(R.array.array_povos_nativos);
        listPovosNativos = Arrays.asList(arrayPovosNativos);

        LinearLayout root = findViewById(R.id.root_povos_nativos);
        for(String povos : listPovosNativos){
            TextView textView = new TextView(this);
            textView.setText(povos);
            root.addView(textView);
        }
    }
}
