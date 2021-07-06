package sfr.com.tasker.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import sfr.com.tasker.PageFragment;

/**
 * Created by sfr
 */

public class MyFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private final int PAGE_COUNT = 3;
    private String[] tabTitles = new String[] {"Inbox", "Today", "Next 7 days"};  // titles for 3 tabs

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return PageFragment.newInstance(0);
            case 1: return PageFragment.newInstance(1);
            case 2: return PageFragment.newInstance(2);
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }


}
