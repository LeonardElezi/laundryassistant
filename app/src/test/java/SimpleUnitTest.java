import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by leonardelezi on 2/15/15.
 */
public class SimpleUnitTest {

    @Test
    public void checkJUnitWork(){
        assertThat(true, is(true));
    }
}
