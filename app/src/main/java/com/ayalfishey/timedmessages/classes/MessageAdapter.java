package com.ayalfishey.timedmessages.classes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ayalfishey.timedmessages.R;
import com.ayalfishey.timedmessages.classes.data.MessageDao;
import com.ayalfishey.timedmessages.classes.data.MessageDatabase;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageHolder> {
    MessageDao database;
    public MessageAdapter() {
        database = MessageDatabase.getInstance().getMessageDao();
    }

    @NonNull
    @Override
    public MessageHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.time_message_layout, viewGroup, false);
        return new MessageHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageHolder messageHolder, int i) {
        messageHolder.timedMessageCell.setData(i);
    }

    @Override
    public int getItemCount() {
        return database.getAll().size();
    }
    class MessageHolder extends RecyclerView.ViewHolder{

        TimedMessageCell timedMessageCell;

        public MessageHolder(@NonNull View itemView) {
            super(itemView);
            timedMessageCell = itemView.findViewById(R.id.timed_message_layout);
        }
    }
}
