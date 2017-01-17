package es.vcarmen.restemployeevolley.Views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Lolo on 17/01/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter{
    int numberOfTabs;

    public PagerAdapter(FragmentManager fm, int numberOfTabs){
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                TabFragmentDepartment tabDept = new TabFragmentDepartment();
                return tabDept;
            case 1:
                TabFragmentEmployee tabEmpl = new TabFragmentEmployee();
                return tabEmpl;
            case 2:
                TabFragmentProject tabProj = new TabFragmentProject();
                return tabProj;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
