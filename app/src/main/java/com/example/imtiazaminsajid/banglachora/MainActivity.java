package com.example.imtiazaminsajid.banglachora;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String [] choraName;
    String [] choraWritter;
    String [] choraDetails;
    int choraPicture[] = {R.drawable.baburam_sapure,
            R.drawable.mamar_bari,
            R.drawable.aam_pata_jora_jora,
            R.drawable.noton_noton_payra,
            R.drawable.oi_dekha_jay_tal_gach,
            R.drawable.ital_bital,
            R.drawable.honhon_ponpon,
            R.drawable.bhor_holo_dor_kholo,
            R.drawable.megher_kole_rod,

    };
    int[] choraAudio  = {R.raw.baburam_sapure,
            R.raw.mamar_bari,
            R.raw.aam_pata_jora_jora,
            R.raw.noton_noton_payra,
            R.raw.oi_dekha_jay_tal_gach,
            R.raw.itala_bitala,
            R.raw.honhon_ponpon,
            R.raw.bhor_holo_dor_kholo,
            R.raw.megher_kole_rod
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.choraList);
        choraName = getResources().getStringArray(R.array.ChoraName);
        choraWritter = getResources().getStringArray(R.array.ChoraWritter);
        choraDetails = getResources().getStringArray(R.array.Chora);

        CustomAdapter adapter = new CustomAdapter(choraName,choraWritter, choraPicture,this);
        listView.setAdapter(adapter);
    }
}
