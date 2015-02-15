import android.app.Activity;
import android.widget.TextView;

import com.thedevnotes.laundryassistant.LaundryAssistant;
import com.thedevnotes.laundryassistant.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by leonardelezi on 2/15/15.
 */
@RunWith(CustomRoboelectricRunner.class)
public class RoboelectricTest {

    @Test
    public void testIt(){
        Activity activity = Robolectric.setupActivity(LaundryAssistant.class);

        TextView results = (TextView) activity.findViewById(R.id.helloWorldTextView);
        String resultsText = results.getText().toString();

        assertThat(resultsText, equalTo("Hello world!"));
    }
}
