import org.example.MoodAnalyserProblem;
import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserProblemTest {
    @Test
    public void givenMessage_WhenValid_ThenReturnMood() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("I am in Happy Mood");
        String result = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy", result);
    }

    @Test
    public void givenMessage_WhenInvalid_ThenReturnMood() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("I am in Sad Mood");
        String result = moodAnalyser.analyseMood();
        Assert.assertEquals("Sad", result);
    }
}
