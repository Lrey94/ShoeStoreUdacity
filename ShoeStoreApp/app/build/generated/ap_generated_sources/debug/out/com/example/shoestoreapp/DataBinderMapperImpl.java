package com.example.shoestoreapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.shoestoreapp.databinding.ActivityMainBindingImpl;
import com.example.shoestoreapp.databinding.FragmentLoginBindingImpl;
import com.example.shoestoreapp.databinding.FragmentOnboardingBindingImpl;
import com.example.shoestoreapp.databinding.FragmentOnboardingInstructionsBindingImpl;
import com.example.shoestoreapp.databinding.FragmentShoeDetailsBindingImpl;
import com.example.shoestoreapp.databinding.FragmentShoeListingsBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTLOGIN = 2;

  private static final int LAYOUT_FRAGMENTONBOARDING = 3;

  private static final int LAYOUT_FRAGMENTONBOARDINGINSTRUCTIONS = 4;

  private static final int LAYOUT_FRAGMENTSHOEDETAILS = 5;

  private static final int LAYOUT_FRAGMENTSHOELISTINGS = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.shoestoreapp.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.shoestoreapp.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.shoestoreapp.R.layout.fragment_onboarding, LAYOUT_FRAGMENTONBOARDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.shoestoreapp.R.layout.fragment_onboarding_instructions, LAYOUT_FRAGMENTONBOARDINGINSTRUCTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.shoestoreapp.R.layout.fragment_shoe_details, LAYOUT_FRAGMENTSHOEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.shoestoreapp.R.layout.fragment_shoe_listings, LAYOUT_FRAGMENTSHOELISTINGS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARDING: {
          if ("layout/fragment_onboarding_0".equals(tag)) {
            return new FragmentOnboardingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboarding is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARDINGINSTRUCTIONS: {
          if ("layout/fragment_onboarding_instructions_0".equals(tag)) {
            return new FragmentOnboardingInstructionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboarding_instructions is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOEDETAILS: {
          if ("layout/fragment_shoe_details_0".equals(tag)) {
            return new FragmentShoeDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_shoe_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOELISTINGS: {
          if ("layout/fragment_shoe_listings_0".equals(tag)) {
            return new FragmentShoeListingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_shoe_listings is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_main_0", com.example.shoestoreapp.R.layout.activity_main);
      sKeys.put("layout/fragment_login_0", com.example.shoestoreapp.R.layout.fragment_login);
      sKeys.put("layout/fragment_onboarding_0", com.example.shoestoreapp.R.layout.fragment_onboarding);
      sKeys.put("layout/fragment_onboarding_instructions_0", com.example.shoestoreapp.R.layout.fragment_onboarding_instructions);
      sKeys.put("layout/fragment_shoe_details_0", com.example.shoestoreapp.R.layout.fragment_shoe_details);
      sKeys.put("layout/fragment_shoe_listings_0", com.example.shoestoreapp.R.layout.fragment_shoe_listings);
    }
  }
}
