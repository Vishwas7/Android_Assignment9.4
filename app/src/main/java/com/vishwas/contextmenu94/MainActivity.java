package com.vishwas.contextmenu94;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // declare variable
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // casting variable
        button = (Button) findViewById(R.id.press_btn);
        //registering view for using Context menu.
        registerForContextMenu(button);
    }
    /**
     * This method is triggered when the screen is long
     * pressed and context menu view is being built menu
     **/

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_option, menu);
    }

    /**
     * This method is called whenever an item in the context menu is selected
     * and the interface MenuItem provides necessary details on the selected item
     * @param item
     * @return
     */

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        //find out which menu item was pressed
        switch (item.getItemId()) {
            case R.id.option1:
                Toast.makeText(this, "You've clicked on Action 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.option2:
                Toast.makeText(this, "You've clicked on Action 2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.option3:
                Toast.makeText(this, "You've clicked on Action 3", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return false;
        }
    }
}


