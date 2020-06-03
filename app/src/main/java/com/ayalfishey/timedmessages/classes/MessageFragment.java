package com.ayalfishey.timedmessages.classes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ayalfishey.timedmessages.R;
import com.ayalfishey.timedmessages.classes.data.MessageDatabase;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessageFragment extends Fragment {

    private MessageFragment() {
        // Required empty public constructor
    }

    public static MessageFragment newInstance(Bundle b){
        MessageFragment fragment = new MessageFragment();
        fragment.setArguments(b);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message, container, false);
    }
}
