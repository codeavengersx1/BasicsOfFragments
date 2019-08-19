package in.itechvalley.fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
{
    @BindView(R.id.bottom_nav)
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Attach ButterKnife to this Activity
        * */
        ButterKnife.bind(this);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                int selectedItemId = menuItem.getItemId();

                switch (selectedItemId)
                {
                    case R.id.nav_chats:
                    {
                        ChatsFragment chatsFragment = new ChatsFragment();

                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container, chatsFragment)
                                .commit();

                        return true;
                    }

                    case R.id.nav_status:
                    {
                        StatusFragment statusFragment = new StatusFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,statusFragment)
                                .commit();
                        return true;
                    }

                    case R.id.nav_calls:
                    {
                        CallsFragment callsFragment = new CallsFragment();

                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,callsFragment)
                                .commit();

                        return true;
                    }
                    case R.id.nav_profile:
                    {
                        ProfileFragment profileFragment=new ProfileFragment();

                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,profileFragment)
                                .commit();

                        return true;
                    }

                    case R.id.nav_settings:
                    {
                        SettingsFragment  settingsFragment=new SettingsFragment();

                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,settingsFragment)
                                .commit();

                        return true;
                    }


                }

                return false;
            }
        });

        /*
        * Activities are always full screen. (StatusBar + NavBar)
        *
        * 1. One Java File which extends AppCompatActivity
        * 2. XML File
        * 3. Manifest
        * */

        /*
        * Fragments are Sub Activity which can be of any size.
        *
        * 1. One Java File which extends Fragment
        * 2. XML File
        * */

        /*
        * What if we want an Activity of our size?
        * */
    }
}
