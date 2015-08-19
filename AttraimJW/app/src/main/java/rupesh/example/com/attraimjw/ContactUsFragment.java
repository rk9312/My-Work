package rupesh.example.com.attraimjw;

/**
 * Created by rupesh on 02-Feb-15.
 */
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class ContactUsFragment extends Fragment {

    Button sendfeedback;
    EditText sname,body;
    Spinner type;
    CheckBox cb1;
    Activity CommunityFragment = getActivity();
    public ContactUsFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_contact_us, container, false);

        sname = (EditText) rootView.findViewById(R.id.EditTextName);
        body = (EditText) rootView.findViewById(R.id.EditTextFeedbackBody);
        type = (Spinner) rootView.findViewById(R.id.SpinnerFeedbackType);
        cb1 = (CheckBox) rootView.findViewById(R.id.CheckBoxResponse);

        sendfeedback = (Button) rootView.findViewById(R.id.ButtonSendFeedback);
        sendfeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendFeedback();

                sname.setText("");
                //body.setText("");
            }
        });

        return rootView;

    }
    protected void SendFeedback() {

        Intent email = new Intent(Intent.ACTION_SEND, Uri.parse("mailto: "));

        // prompts email clients only

        email.setType("message/rfc822");


        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"rajnikantjha09@gmail.com"});

        email.putExtra(Intent.EXTRA_SUBJECT, type.getSelectedItem().toString());

        email.putExtra(Intent.EXTRA_TEXT, body.getText().toString());

        //email.putExtra(Intent.EXTRA_TEXT, cb1.getText().toString());

        try {

            // the user can choose the email client

            startActivity(Intent.createChooser(email, "Choose an email client from..."));


        } catch (android.content.ActivityNotFoundException ex) {

            Toast.makeText(CommunityFragment, "No email client installed.", Toast.LENGTH_LONG).show();

        }
    }
}

