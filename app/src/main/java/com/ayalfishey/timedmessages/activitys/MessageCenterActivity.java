package com.ayalfishey.timedmessages.activitys;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.FrameLayout;

import com.ayalfishey.timedmessages.R;
import com.ayalfishey.timedmessages.classes.MessageAdapter;
import com.ayalfishey.timedmessages.classes.MessageFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MessageCenterActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FloatingActionButton newMessageBtn;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_center);
        frameLayout = findViewById(R.id.message_fragment);
        newMessageBtn = findViewById(R.id.newMessageBtn);
        setupMessageBtn();
        recyclerView = findViewById(R.id.message_list);
        recyclerView.setAdapter(new MessageAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));
    }

    private void setupMessageBtn(){
        newMessageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                frameLayout.setVisibility(View.VISIBLE);
                MessageFragment messageFragment = MessageFragment.newInstance(new Bundle());
                fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right)
                        .add(R.id.message_fragment, messageFragment,"newMessage")
                        .addToBackStack("newMessageFrag")
                        .commit();
            }
        });
    }
}
