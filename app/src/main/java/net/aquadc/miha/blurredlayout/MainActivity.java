package net.aquadc.miha.blurredlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import net.aquadc.widgets.BlurredLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arr = new String[30];
        for (int i = 0; i < 30; i++)
            arr[i] = "Sample item " + (i+1);

        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);

        ListView lv = (ListView) findViewById(android.R.id.list);
        lv.setAdapter(adapter);

        BlurredLayout layout = (BlurredLayout) findViewById(R.id.blurred);
        layout.setBlurRadius(0, 4);
        layout.setBlurRadius(1, 24);
    }
}
