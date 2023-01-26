package com.example.shoestoreapp.databinding;
import com.example.shoestoreapp.R;
import com.example.shoestoreapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentShoeDetailsBindingImpl extends FragmentShoeDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.shoe_detail_title, 1);
        sViewsWithIds.put(R.id.shoe_name_title, 2);
        sViewsWithIds.put(R.id.shoe_name_EditText, 3);
        sViewsWithIds.put(R.id.shoe_colour_title, 4);
        sViewsWithIds.put(R.id.shoe_colour_EditText, 5);
        sViewsWithIds.put(R.id.shoe_maker_title, 6);
        sViewsWithIds.put(R.id.shoe_maker_editText, 7);
        sViewsWithIds.put(R.id.shoe_size_title, 8);
        sViewsWithIds.put(R.id.shoe_size_editText, 9);
        sViewsWithIds.put(R.id.save_button_shoe_details, 10);
        sViewsWithIds.put(R.id.cancel_button_shoe_details, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentShoeDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentShoeDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[10]
            , (android.widget.EditText) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.EditText) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.EditText) bindings[9]
            , (android.widget.TextView) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.shoestoreapp.viewmodel.ShoeListingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.shoestoreapp.viewmodel.ShoeListingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}