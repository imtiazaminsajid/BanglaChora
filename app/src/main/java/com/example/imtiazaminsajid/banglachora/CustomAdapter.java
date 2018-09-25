package com.example.imtiazaminsajid.banglachora;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    String[] choraName;
    String[] choraWritter;
    String[] choraDetails;
    int[] choraPicture;
    int[] choraAudio;
    Context context;
    LayoutInflater inflater;


    public CustomAdapter(Context context,
                         String[] choraName,
                         String[] choraWritter,
                         String[] choraDetails,
                         int[] choraPicture,
                         int[] choraAudio) {

        this.choraName = choraName;
        this.choraWritter = choraWritter;
        this.choraDetails = choraDetails;
        this.choraPicture = choraPicture;
        this.choraAudio = choraAudio;
        this.context = context;
    }

    @Override
    public int getCount() {
        return choraName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.chora_listview,viewGroup,false);
        }
        ImageView imageView = view.findViewById(R.id.choraImageIV);
        TextView ChoraName = view.findViewById(R.id.ChoraNameTV);
        TextView ChoraWritter = view.findViewById(R.id.ChoraWritterTV);

        imageView.setImageResource(choraPicture[i]);
        ChoraName.setText(choraName[i]);
        ChoraWritter.setText(choraWritter[i]);

        return view;
    }
}
