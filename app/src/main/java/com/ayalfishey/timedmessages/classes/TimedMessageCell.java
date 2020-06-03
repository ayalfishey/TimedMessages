package com.ayalfishey.timedmessages.classes;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.ayalfishey.timedmessages.R;

import org.w3c.dom.Text;

public class TimedMessageCell extends ConstraintLayout {
    TextView timedMessage, date;
    ImageButton delete;

    public TimedMessageCell(Context context) {
        super(context);
        init();
    }

    public TimedMessageCell(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TimedMessageCell(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        ((LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.timed_message_cell, this,true);
        timedMessage = findViewById(R.id.message_list);
        date = findViewById(R.id.send_date);
        delete = findViewById(R.id.delete_message);
        delete.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO make delete button work
            }
        });
    }
    public void setData(int data){


    }
}
