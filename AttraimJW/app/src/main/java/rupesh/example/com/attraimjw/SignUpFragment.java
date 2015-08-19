package rupesh.example.com.attraimjw;

/**
 * Created by rupesh on 02-Feb-15.
 */
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignUpFragment extends Fragment {

    EditText editTextName, editTextEmpId, editTextEmail, editTextPassword;
    Button btnRegister;
    Activity SignUpFragment = getActivity();
    public SignUpFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_signup, container, false);

        editTextEmpId = (EditText) rootView.findViewById(R.id.Emp_id);
        editTextName = (EditText) rootView.findViewById(R.id.reg_fullname);
        editTextEmail = (EditText) rootView.findViewById(R.id.reg_email);
        editTextPassword = (EditText) rootView.findViewById(R.id.reg_password);

        btnRegister = (Button) rootView.findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               DoRegistration();
               /* String empId = editTextEmpId.getText().toString();
                String userName = editTextName.getText().toString();
                String userEmail = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                signUp();


                // check if any of the fields are vacant
                if (empId.equals("") || userName.equals("") || userEmail.equals("") || password.equals(""))
                {
                    Toast.makeText(SignUpFragment, "All Fields are required... ", Toast.LENGTH_LONG).show();
                   // return;

                }
                else {
                    Toast.makeText(SignUpFragment, "Success! ", Toast.LENGTH_LONG).show();
                }*/
            }

        });

        return rootView;
    }

    protected void DoRegistration() {

    }
}

