package com.example.textgs;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    private TextView tvCounter;
    private CounterViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout, container, false);

        tvCounter = view.findViewById(R.id.search_bar_text_view);
        viewModel = new ViewModelProvider(requireActivity()).get(CounterViewModel.class);


        tvCounter.setText(String.valueOf(viewModel.getCounterValue()));

        return view;
    }
}
