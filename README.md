tfTabs
======

A clone of `ActionBarTabs` in Android but is compatible with `Toolbar`

You need to copy the following files from the given example code into your project:

    src/com.tf.library.tabs.Tabs.java
    res/layout/tab.xml
    
Add it in your layout xml file:

    <com.tf.library.tabs.Tabs
        android:id="@+id/tabs"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

Add a few lines in your activity code:

    // Set up the tabs
    final Tabs tabs = (Tabs) findViewById(R.id.tabs);
    tabs.setViewPager(mViewPager);
    
    // Optionally setup the colors
    tabs.setBackgroundColor(getResources().getColor(R.color.primary_material_light));
    tabs.setTitleColor(getResources().getColor(android.R.color.black));
    tabs.setSelectionColor(getResources().getColor(R.color.primary_material_dark));


    // When swiping between different sections, select the corresponding
    // tab.
    mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
	@Override
	public void onPageSelected(int position) {
	    tabs.setCurrentTab(position);
	}
    });
    
And you're done!

**Note**: Before `tabs.setViewPager(mViewPager);` you must have your `FragmentPagerAdapter` in your `ViewPager`