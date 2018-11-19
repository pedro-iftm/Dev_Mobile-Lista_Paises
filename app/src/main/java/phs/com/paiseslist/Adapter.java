package phs.com.paiseslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    Context context;
    List<Pais> paises;
    TextView rank;
    TextView nome;
    TextView populacao;
    ImageView bandeira;

    public Adapter(Context context, List<Pais> paises) {
        this.context = context;
        this.paises = paises;
    }
    @Override
    public int getCount() {
        return paises.size();
    }
    @Override
    public Object getItem(int position) {
        return paises.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = LayoutInflater.from(context).inflate(R.layout.activity_main, null);
        Pais pais = paises.get(position);

        rank = item.findViewById(R.id.tv_rank);
        nome = item.findViewById(R.id.texto);
        populacao = item.findViewById(R.id.tv_populacao);
        bandeira = item.findViewById(R.id.iv_bandeira);

        rank.setText("Ranking: " + pais.getRanking());
        nome.setText("País: " + pais.getNome());
        populacao.setText("População: " + pais.getPopulacao());
        bandeira.setImageResource(pais.getBandeira());
        return item;
    }
}