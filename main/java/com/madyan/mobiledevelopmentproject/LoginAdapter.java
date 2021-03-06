package com.madyan.mobiledevelopmentproject;

import android.content.Context;
import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter
{
    private Context context;
    int totalTabs;

    public LoginAdapter(FragmentManager fm, Context context, int totalTabs)
    {
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public Fragment getItem(int fragment)
    {
         switch (fragment)
         {
             case 0:
                 LoginTabFragment loginTabFragment = new LoginTabFragment();
                 return loginTabFragment;
             case 1:
                 SignUpTabFragment signupTabFragment = new SignUpTabFragment();
                 return signupTabFragment;
             default:
                 return null;
         }
    }
}
