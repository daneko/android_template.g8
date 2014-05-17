package $package$

import android.widget.TextView
import org.robolectric.Robolectric
import org.robolectric.annotation.Config
import pl.polidea.robospock.RoboSpecification

@Config(manifest = "../app/src/main/AndroidManifest.xml")
class $mainActivity$Spec extends RoboSpecification{

    def "sample"(){
        given:
        def activity = Robolectric.buildActivity(MainActivity_).create().get()

        when:
        def text = activity.findViewById(R.id.text).asType(TextView).getText()

        then:
        text == "Hello world!"
    }

}
