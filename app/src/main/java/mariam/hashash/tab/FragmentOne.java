package mariam.hashash.tab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    TextView txt;
    public FragmentOne() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View v =  inflater.inflate(R.layout.fragment_fragment_one, container, false);
        txt=(TextView)v.findViewById(R.id.fra_One);
        txt.setText("Hello World In Fragment One");
        return  v;
    }

}
