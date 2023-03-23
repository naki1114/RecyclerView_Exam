package com.example.recyclerview_exam;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

class ViewHolder extends RecyclerView.ViewHolder{
    public TextView textView;
    public Button button;

    ViewHoler(Context context, View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.textViewExam);
        button = itemView.findViewById(R.id.buttonExam);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String strText = textView.getText().toString();
                Toast.makeText(context, strText, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
