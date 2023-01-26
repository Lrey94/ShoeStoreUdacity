// Generated by data binding compiler. Do not edit!
package com.example.shoestoreapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.shoestoreapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final EditText editTextTextPersonName;

  @NonNull
  public final EditText editTextTextPersonName2;

  @NonNull
  public final ConstraintLayout gameLayout;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final Button registerButton;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  protected FragmentLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText editTextTextPersonName, EditText editTextTextPersonName2,
      ConstraintLayout gameLayout, Button loginButton, Button registerButton, TextView textView,
      TextView textView2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.editTextTextPersonName = editTextTextPersonName;
    this.editTextTextPersonName2 = editTextTextPersonName2;
    this.gameLayout = gameLayout;
    this.loginButton = loginButton;
    this.registerButton = registerButton;
    this.textView = textView;
    this.textView2 = textView2;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLoginBinding)bind(component, view, R.layout.fragment_login);
  }
}