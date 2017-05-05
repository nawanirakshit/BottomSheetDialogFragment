package com.example.ushya.bottomsheetexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.ushya.bottomsheetexample.bottomsheets.ItemListDialogFragment;

public class MainActivity extends AppCompatActivity implements ItemListDialogFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemClicked(int position) {
        Toast.makeText(MainActivity.this, "position selected in Activity is " + position, Toast.LENGTH_SHORT).show();
    }


    /**
     * Click on the FAB will open a Fragment
     *
     * @param v View
     */
    public void addFragment(View v) {
        BlankFragment blankFragment = BlankFragment.newInstance("", "");
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, blankFragment, BlankFragment.class.getName()).addToBackStack(BlankFragment.class.getName()).commit();

    }

    /**
     * View Click to open bottom Sheet
     *
     * @param v View
     */
    public void openBottomSheet(View v) {
        ItemListDialogFragment.newInstance(10).show(getSupportFragmentManager(), ItemListDialogFragment.class.getName());
    }
}
