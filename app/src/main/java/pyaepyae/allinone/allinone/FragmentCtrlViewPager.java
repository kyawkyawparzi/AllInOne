package pyaepyae.allinone.allinone;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

public class FragmentCtrlViewPager extends FragmentPagerAdapter {
    public FragmentCtrlViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fg=null;
        switch (position){
            case 0:
                fg=new FragmentViewPager();
                break;
            case 1:
                fg=new FragmentViewPagerOne();
                break;
            case 2:
                fg=new FragmentViewPagerTwo();
                break;
        }
        return fg;
    }

    @Override
    public int getCount() {
        return 3;
    }


    public CharSequence getPageTitle(int position) {
        String[] title = {"One","Two","Three"};
        return title[position];
    }
}
