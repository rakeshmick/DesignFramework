package Data;

import javax.xml.bind.annotation.*;

/**
 * Created by rakeshprabhakaran on 9/01/2016.
 */
@XmlRootElement
public class Tests {
    TestDatas testData;

    @XmlElement(name="test-data")
    public TestDatas getTestData() {
        return testData;
    }

    public void setTestData(TestDatas testData) {
        this.testData = testData;
    }
}
