package com.example.imtiazaminsajid.banglachora;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChoraDetails extends AppCompatActivity {

    ImageView detailsImage;
    TextView detailsChoraName, detailsChoraWritter, detailsChora;
    Button detailsAudio;
    MediaPlayer mediaPlayer;
    boolean isPlaying = false;
    int currentRyhme = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chora_details);

        detailsImage = findViewById(R.id.detailsImage);
        detailsChoraName = findViewById(R.id.detailsChoraName);
        detailsChoraWritter = findViewById(R.id.detailsChorawritter);
        detailsChora = findViewById(R.id.detailsChora);
        detailsAudio = findViewById(R.id.detailsAudioButton);

        Bundle bundle = getIntent().getExtras();

        if (bundle!=null) {
            detailsImage.setImageResource(bundle.getInt("ChoraPic"));
            detailsChoraName.setText(bundle.getString("ChoraName"));
            detailsChoraWritter.setText(bundle.getString("ChoraWritter"));
            detailsChora.setText(bundle.getString("ChoraDetails"));
            detailsAudio.setBackgroundResource(bundle.getInt("ChoraAudio"));

            currentRyhme =  bundle.getInt("ChoraAudio");

            mediaPlayer = new MediaPlayer();

            detailsAudio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (!isPlaying){
                        mediaPlayer.reset();
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), currentRyhme);
                        mediaPlayer.start();
                        isPlaying = true;
                    } else {
                        mediaPlayer.stop();
                        mediaPlayer.reset();
                        isPlaying=false;
                    }

                }
            });

//            detailsAudio.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    if(!isPlaying){
//
//                    mediaPlayer.reset();
//
//                    switch (detailsAudio){
//                        case 0:
//                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.baburam_sapure);
//                            isPlaying = true;
//                            break;
//                        case 1:
//                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mamar_bari);
//                            isPlaying = true;
//                            break;
//
//                        case 2:
//                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.aam_pata_jora_jora);
//                            isPlaying = true;
//                            break;
//
//                        case 3:
//                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.noton_noton_payra);
//                            isPlaying = true;
//                            break;
//
//                        case 4:
//                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.oi_dekha_jay_tal_gach);
//                            isPlaying = true;
//                            break;
//
//                        case 5:
//                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.itala_bitala);
//                            isPlaying = true;
//                            break;
//
//                        case 6:
//                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.honhon_ponpon);
//                            isPlaying = true;
//                            break;
//                        case 7:
//                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bhor_holo_dor_kholo);
//                            isPlaying = true;
//                            break;
//
//                        case 8:
//                            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.megher_kole_rod);
//                            isPlaying = true;
//                            break;
//                    }
//
//                    mediaPlayer.start();
//
//                } else {
//                        mediaPlayer.stop();
//                        mediaPlayer.reset();
//                        isPlaying = false;
//                }
//
//                }
//            });
//
        }


    }

    @Override
    protected void onPause() {
        mediaPlayer.release();
        super.onPause();
    }
}
