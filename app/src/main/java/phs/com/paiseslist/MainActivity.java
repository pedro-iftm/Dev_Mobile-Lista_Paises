package phs.com.paiseslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    List<Pais> paises;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView = new ListView(this);
        setContentView(listView);
        paises = new ArrayList<Pais>();

        paises.add(new Pais("China", 1, 355445334, R.drawable.china));
        paises.add(new Pais("Canada", 2, 456367456, R.drawable.canada));
        paises.add(new Pais("Japão", 3, 654678932, R.drawable.japao));

        listView.setAdapter(new Adapter(this,paises));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}