package com.ayalfishey.timedmessages.classes;

import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.ConversationActions;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageHolder> {
    @NonNull
    @Override
    public MessageHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MessageHolder messageHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    class MessageHolder extends RecyclerView.ViewHolder{

        public MessageHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
