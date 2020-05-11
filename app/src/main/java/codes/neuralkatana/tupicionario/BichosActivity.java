package codes.neuralkatana.tupicionario;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class BichosActivity extends AppCompatActivity {
    private List<String> listBichos;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bichos);

        String[] arrayBichos = getResources().getStringArray(R.array.array_bichos);
        listBichos = Arrays.asList(arrayBichos);

        LinearLayout root = findViewById(R.id.root_bichos);
        for(String bicho : listBichos){
            TextView textView = new TextView(this);
            textView.setText(bicho);
            root.addView(textView);
        }
    }
}
