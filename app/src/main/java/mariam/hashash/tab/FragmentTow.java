package mariam.hashash.tab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTow extends Fragment {

    TextView txt;
    public FragmentTow() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragment_tow, container, false);
        txt=(TextView)v.findViewById(R.id.fra_tow);
        txt.setText("Hello World In Fragment Tow");
        return  v;
    }

}
