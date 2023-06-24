package com.example.buynothing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {

    EditText firstname, lastname, email_signup, pass_signup;
    Button button_signup;
    float v=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);

        firstname = root.findViewById(R.id.first_name);
        lastname = root.findViewById(R.id.last_name);
        email_signup = root.findViewById(R.id.email_signup);
        pass_signup = root.findViewById(R.id.pass_signup);
        button_signup = root.findViewById(R.id.button_signup);

        firstname.setTranslationX(800);
        lastname.setTranslationX(800);
        email_signup.setTranslationX(800);
        pass_signup.setTranslationX(800);
        button_signup.setTranslationX(800);

        firstname.setAlpha(v);
        lastname.setAlpha(v);
        email_signup.setAlpha(v);
        pass_signup.setAlpha(v);
        button_signup.setAlpha(v);

        firstname.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        lastname.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(400).start();
        email_signup.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        pass_signup.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(600).start();
        button_signup.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;
    }
}
