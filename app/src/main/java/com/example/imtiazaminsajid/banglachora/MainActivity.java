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
    int choraPicture[] = {R.drawable.mamar_bari,
            R.drawable.mamar_bari,
            R.drawable.mamar_bari,
            R.drawable.mamar_bari,
            R.drawable.mamar_bari,
            R.drawable.mamar_bari,
            R.drawable.mamar_bari,
            R.drawable.mamar_bari,
            R.drawable.mamar_bari,  

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
    }
}
