package $package$;

import android.app.Activity;
import android.widget.Button;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
@OptionsMenu(R.menu.main)
public class $mainActivity$ extends Activity {

    @OptionsItem(R.id.action_settings)
    void settings(){
        Toast.makeText(this, "settings", Toast.LENGTH_LONG).show();
    }

    @ViewById(R.id.plus)
    Button mPlusButton;

    @Click(R.id.plus)
    void clickPlus(){
        PlusService s = PlusService.of(1,1);
        Integer result = s.plus();
        Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show();
    }
}
