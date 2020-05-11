package codes.neuralkatana.tupicionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvBichos;
    private TextView tvCulinaria;
    private TextView tvPlantas;
    private TextView tvPovosNativos;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBichos = findViewById(R.id.tvBichos);
        tvCulinaria = findViewById(R.id.tvCulinaria);
        tvPlantas = findViewById(R.id.tvPlantas);
        tvPovosNativos = findViewById(R.id.tvPovosNativos);
    }
    /*Actions for the TextViews.
    Those are setup at the XML for Cleaner code.*/

    //tvBichos click action
    public void onClickBichos(View view){
        intent = new Intent(MainActivity.this, BichosActivity.class);
        startActivity(intent);
    }

    //tvCulinaria click action
    public void onClickCulinaria(View view){
        intent = new Intent(MainActivity.this, CulinariaActivity.class);
        startActivity(intent);
    }

    //tvPlantas click action
    public void onClickPlantas(View view){
        intent = new Intent(MainActivity.this, PlantasActivity.class);
        startActivity(intent);
    }

    //tvPovosNativos click action
    public void onClickPovosNativos(View view){
        intent = new Intent(MainActivity.this, PovosNativosActivity.class);
        startActivity(intent);
    }
}
