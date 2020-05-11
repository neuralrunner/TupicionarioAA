package codes.neuralkatana.tupicionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class CulinariaActivity extends AppCompatActivity {
    private List<String> listCulinaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinaria);

        String[] arrayCulinaria = getResources().getStringArray(R.array.array_culinaria);
        listCulinaria = Arrays.asList(arrayCulinaria);

        LinearLayout root = findViewById(R.id.root_culinaria);
        for(String culinaria : listCulinaria){
            TextView textView = new TextView(this);
            textView.setText(culinaria);
            root.addView(textView);
        }
    }
}
