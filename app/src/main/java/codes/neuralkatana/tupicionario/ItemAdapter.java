package codes.neuralkatana.tupicionario;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    private int backgroundColor;

    //Activity, ArrayList de Items e Cor de Fundo para o LinearLayout do ArrayList
    public ItemAdapter(Context context, ArrayList<Item> list, int backgroundColor){
        //0 é o ID do rescurso
        super(context,0,list);
        this.backgroundColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Item item = getItem(position);

        //Criando para o ArrayList os seus elementos
        TextView titulo = convertView.findViewById(R.id.item_titulo);
        TextView descricao = convertView.findViewById(R.id.item_descricao);
        ImageView icone = convertView.findViewById(R.id.item_icone);

        //Settando as informações dos elementos
        titulo.setText(item.getTitulo());
        descricao.setText(item.getDescricao());
        icone.setImageResource(item.getImagem());

        //Settando a cor do LinearLayout responsavel pelo ArrayList
        LinearLayout layoutTextos = convertView.findViewById(R.id.item_layout_textos);

        //retorna um ID inteiro da Cor
        int cor = ContextCompat.getColor(getContext(),backgroundColor);
        layoutTextos.setBackgroundColor(cor);

        return convertView;
    }
}
