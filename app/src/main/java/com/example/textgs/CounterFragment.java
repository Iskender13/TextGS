package com.example.textgs;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CounterFragment extends Fragment {

    private TextView tvCounter;
    private CounterViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout, container, false);

        tvCounter = view.findViewById(R.id.search_bar_text_view);
        Button btnAdd = view.findViewById(R.id.buttonPlusOne);
        Button btnSubtract = view.findViewById(R.id.buttonMinusOne);

        viewModel = new ViewModelProvider(requireActivity()).get(CounterViewModel.class);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setCounterValue(viewModel.getCounterValue() + 1);
                updateCounter();
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setCounterValue(viewModel.getCounterValue() - 1);
                updateCounter();
            }
        });

        return view;
    }

    private void updateCounter() {
        tvCounter.setText(String.valueOf(viewModel.getCounterValue()));
    }
}



