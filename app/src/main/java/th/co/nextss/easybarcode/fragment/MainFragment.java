package th.co.nextss.easybarcode.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import th.co.nextss.easybarcode.R;

/**
 * Created by nextdev on 18-Dec-17.
 */

public class MainFragment extends Fragment{
    private TextView textView;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Initial TextView
        initialTextView();
//        For Special
        forSpecial();


    }   // Main Method

    private void initialTextView() {
        textView = getView().findViewById(R.id.txtDisplay);
    }

    private void forSpecial() {
        EditText editText = getView().findViewById(R.id.edtSpecial);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                textView.setText(charSequence);


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        return view;
    }
}   // Main Class
