import org.example.MoodAnalyserProblem;
import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserProblemTest {
    //TC-1.1
    @Test
    public void givenMessage_WhenValid_ThenReturnMood() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("I am in Happy Mood");
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Happy", result);
    }

    //TC-1.2
    @Test
    public void givenMessage_WhenInvalid_ThenReturnMood() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("I am in Sad Mood");
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Sad", result);
    }

    //TC -2.1 - Given Null Mood should Return Happy
    @Test
    public void givenMessage_WhenInvalid_ThenReturnThrowException() {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem(null);
        String result = moodAnalyser.analyzeMood();
        Assert.assertEquals("Happy", result);
    }
}
