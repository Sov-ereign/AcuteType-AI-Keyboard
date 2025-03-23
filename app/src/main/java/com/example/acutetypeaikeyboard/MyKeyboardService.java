

import android.inputmethodservice.InputMethodService;
import android.view.LayoutInflater;
import android.view.View;
import com.example.acutetypeaikeyboard.R;

import android.view.inputmethod.InputConnection;
import android.widget.Button;

public class MyKeyboardService extends InputMethodService {

    @Override
    public View onCreateInputView() {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.keyboard_layout, null);

        Button keyA = view.findViewById(R.id.key_a);
        keyA.setOnClickListener(v -> {
            InputConnection ic = getCurrentInputConnection();
            if (ic != null) {
                ic.commitText("A", 1);
            }
        });

        return view;
    }
} // ✅ Added closing brace for the class
