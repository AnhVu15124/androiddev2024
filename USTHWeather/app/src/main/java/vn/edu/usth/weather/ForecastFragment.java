package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_forecast2, container, false);
//        // Create a LinearLayout
//        LinearLayout layout = new LinearLayout(getContext());
//        layout.setOrientation(LinearLayout.VERTICAL);
//        // Set the background color
//        layout.setBackgroundColor(Color.parseColor("#20FF0000"));
//
////        LinearLayout forecastLayout = new LinearLayout(getContext());
////        forecastLayout.setOrientation(LinearLayout.VERTICAL);
////        // Set the blue forecast area
////        forecastLayout.setBackgroundColor(Color.parseColor("#200000FF"));
////        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
////                LinearLayout.LayoutParams.MATCH_PARENT,
////                LinearLayout.LayoutParams.WRAP_CONTENT
////        );
////        params.setMargins(50, 100, 50, 50);
////        forecastLayout.setLayoutParams(params);
////
////        LinearLayout thursdayLayout = createForcast("Thursday", R.drawable.icons8sun96, "Sunny\n24C-31C");
////        LinearLayout fridayLayout = createForcast("Friday", R.drawable.icons8partlycloudyday100, "Partly Cloudy\n22C-29C");
////        LinearLayout saturdayLayout = createForcast("Saturday", R.drawable.icons8clouds100, "Cloudy\n20C-27C");
////        LinearLayout sundayLayout = createForcast("Sunday", R.drawable.icons8rain96, "Rain\n18C-25C");
////        LinearLayout mondayLayout = createForcast("Monday", R.drawable.icons8heavyrain100, "Heavy Rain\n17C-23C");
////        LinearLayout tuesdayLayout = createForcast("Tuesday", R.drawable.icons8storm100, "Storm\n16C-22C");
////        LinearLayout wednesdayLayout = createForcast("Wednesday", R.drawable.icons8snow100, "Snow\n-2C-2C");
////        forecastLayout.addView(thursdayLayout);
////        forecastLayout.addView(fridayLayout);
////        forecastLayout.addView(saturdayLayout);
////        forecastLayout.addView(sundayLayout);
////        forecastLayout.addView(mondayLayout);
////        forecastLayout.addView(tuesdayLayout);
////        forecastLayout.addView(wednesdayLayout);
////        layout.addView(forecastLayout);
//        return layout;
    }
//    private LinearLayout createForcast(String day, int imageID, String forecastText) {
//        LinearLayout forecastLayout = new LinearLayout(getContext());
//        forecastLayout.setOrientation(LinearLayout.HORIZONTAL);
//
//        TextView textView1 = new TextView(getContext());
//        textView1.setText(day);
//        ImageView imageView1 = new ImageView(getContext());
//        imageView1.setImageResource(imageID);
//        TextView textView2 = new TextView(getContext());
//        textView2.setText(forecastText);
//        forecastLayout.addView(textView1);
//        forecastLayout.addView(imageView1);
//        forecastLayout.addView(textView2);
//
//        return forecastLayout;
//    }
}