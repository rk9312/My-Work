package rupesh.example.com.attraimjw;

/**
 * Created by rupesh on 02-Feb-15.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CareersFragment extends Fragment {

    public CareersFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_careers, container, false);

        return rootView;
    }
}