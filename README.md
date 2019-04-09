**_Calling a Bottom Sheet Dialog Fragment from Activity_**


    ItemListDialogFragment.newInstance(10).show(getSupportFragmentManager(), ItemListDialogFragment.class.getName()); 


**_Calling a Bottom Sheet from a Fragment_**


    ItemListDialogFragment.newInstance(10).show(getChildFragmentManager(), ItemListDialogFragment.class.getName());


While calling a Bottom sheet from fragment we need to create a function passing the getParentFragment()

    public void onAttachToParentFragment(Fragment fragment) {
    try {
        mListener = (Listener) fragment;
    } catch (ClassCastException e) {
        throw new ClassCastException(fragment.toString() + " must implement OnPlayerSelectionSetListener");
    }
    }


  
This will help in getting the Interface call back to the fragment/activity.

and finally we need to implement the interface in the activity/fragment

**_ItemListDialogFragment.Listener_**

It will implement the required method for getting the data from the interface.
