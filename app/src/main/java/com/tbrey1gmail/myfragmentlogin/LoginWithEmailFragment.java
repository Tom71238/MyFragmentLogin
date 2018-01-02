package com.tbrey1gmail.myfragmentlogin;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class LoginWithEmailFragment extends Fragment {
    private static EditText emailAddr;
    private static EditText password;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.loginwithemail, container, false);
        Log.d("LoginWithEmailFragment","onCreate");

        emailAddr = (EditText) view.findViewById(R.id.etEmailAddrID);
        password = (EditText) view.findViewById(R.id.etPasswordID);
        final Button button = (Button) view.findViewById(R.id.butLoginID);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnClickAction(v);
            }
        });
        
        return view;
    }

    public void mOnClickAction(View v) {
        Log.d("LoginWithEmailFragment","Button Clicked");
        Log.d("mOnClickAction", "email:" + emailAddr.getText().toString() + ", password:" + password.getText().toString() + ".");
    }
}
