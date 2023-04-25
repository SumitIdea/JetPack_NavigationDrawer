package com.sumit.navigationdrawer

sealed class NavigationItem(var route:String, var Icon:Int,var title:String)
{
    object Home:NavigationItem("home",R.drawable.ic_baseline_home,"Home")
    object Profile:NavigationItem("profile",R.drawable.ic_baseline_person,"Profile")
    object Contact :NavigationItem("contact",R.drawable.ic_baseline_contact_phone,"Contact")
    object Settings:NavigationItem("settings",R.drawable.ic_baseline_settings,"Settings")
    object Share:NavigationItem("share",R.drawable.ic_baseline_share,"Share")
}
