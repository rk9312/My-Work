package rupesh.example.com.attraimjw;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by rupesh on 21-Jan-15.
 */
public class SigninFragment extends Fragment {

    EditText editTextUsername, editTextPassword;
    Button btnSignin;
    Activity SigninFragment = getActivity();

    public SigninFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_signin, container, false);

        editTextUsername = (EditText)rootView.findViewById(R.id.editTextUname);
        editTextPassword = (EditText)rootView.findViewById(R.id.editTextPasswd);

        btnSignin = (Button) rootView.findViewById(R.id.btnLogin);
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String Uname = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

               // Toast.makeText(SigninFragment, "All Fields are required... ", Toast.LENGTH_LONG).show();

                //signIn();

                if (Uname.equals("") || password.equals(""))
                {
                    Toast.makeText(SigninFragment, "Sorry! username or password doesn't match ", Toast.LENGTH_LONG).show();
                    //return;

                }
                else {
                    Toast.makeText(SigninFragment, "Success! ", Toast.LENGTH_LONG).show();
                }*/

                DoLogin();
            }

        });

        return rootView;
    }

    protected void DoLogin() {

    }

}
