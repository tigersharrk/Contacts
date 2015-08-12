package com.sartainstudios.contacts;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;

import com.sartainstudios.contacts.FirstTimePreference;


public class MyContacts extends AppCompatActivity {


    //int versionCode = BuildConfig.VERSION_CODE;
    //int previousVersionCode = BuildConfig.VERSION_CODE - 1;

    /*FirstTimePreference();

    FirstTimePreference();
    public void jjaJJ() {
        if (String versionCode != previousVersionCode){

    AlertDialog.Builder builder = new AlertDialog.Builder(MyContacts.this);
            builder.setTitle("Here is whats new in this version")
                    .setMessage(R.string.abc_search_hint)
                    .setNeutralButton(R.string.new_in_this_version, null);

            AlertDialog dialog = builder.create();
            dialog.show();.show();

        }

 }
    */
    //String versionName = context.getPackageManager()
    //      .getPackageInfo(context.getPackageName(), 0).versionName;

    // starts and shows activity_my_contacts
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_contacts);

        // On button click starts AddContacts activity
        Button addContact = (Button) findViewById(R.id.add_contact_button);
        addContact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyContacts.this, AddContact.class);
                startActivity(intent);
            }
        });


    }

    // Default onCreateOptionsMenu
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_contacts, menu);
        return true;
    }
    */


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_my_contacts, menu);
        // Action View
        //MenuItem searchItem = menu.findItem(R.id.action_search);
        //SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        // Configure the search info and add any event listeners
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    // Determines if Action bar item was selected. If true then do corresponding action.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //handle presses on the action bar items
        switch (item.getItemId()) {

            case R.id.action_add_contact:
                startActivity(new Intent(this, AddContact.class));
                return true;

            case R.id.action_about:
                startActivity(new Intent(this, AboutContacts.class));
                return true;

            case R.id.action_settings:
                startActivity(new Intent(this, ContactsSettings.class));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
