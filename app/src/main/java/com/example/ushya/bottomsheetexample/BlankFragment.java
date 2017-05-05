package com.example.ushya.bottomsheetexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ushya.bottomsheetexample.bottomsheets.ItemListDialogFragment2;

public class BlankFragment extends Fragment implements ItemListDialogFragment2.Listener {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;


    public BlankFragment() {
        // Required empty public constructor
    }

    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    /**
     * View Click to open bottom Sheet
     *
     * @param v View
     */
    public void openBottomSheet(View v) {
        ItemListDialogFragment2.newInstance(5).show(getChildFragmentManager(), ItemListDialogFragment2.class.getName());
    }

    @Override
    public void onItemClicked(int position) {
        Toast.makeText(getActivity(), "position selected in Fragment is " + position, Toast.LENGTH_SHORT).show();
    }
}
