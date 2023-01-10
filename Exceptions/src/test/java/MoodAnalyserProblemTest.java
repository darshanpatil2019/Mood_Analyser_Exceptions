import org.example.MoodAnalyserProblem;
import org.example.MoodAnalysisException;
import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserProblemTest {
    //TC-1.1
    //TC-1.1
    @Test
    public void givenMessage_WhenValid_ThenReturnMood() throws MoodAnalysisException {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("I am in Happy mood");
        String result = moodAnalyser.analyseMood(null);
        Assert.assertEquals("Happy", result);
    }

    //TC-1.2
    @Test
    public void givenMessage_WhenInvalid_ThenReturnMood() throws MoodAnalysisException {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("I am in Sad Mood");
        String result = moodAnalyser.analyseMood(null);
        Assert.assertEquals("Sad", result);
    }

    //TC -2.1 - Given Null Mood should Return Happy
    @Test
    public void givenMessage_WhenInvalid_ThenReturnThrowException() throws MoodAnalysisException {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("I am in Happy Mood");
        String result = moodAnalyser.analyseMood(null);
        Assert.assertEquals("Happy", result);
    }

    //TC-3.1 Given Null Mood should throw MoodAnalysisException
    @Test
    public void givenNull_MoodShould_ThrowException() throws MoodAnalysisException {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem(null);
        try
        {
            moodAnalyser.analyseMood(null);
        }catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.MoodAnalysisCustomException.NULL,e.type);
        }
    }

    //TC-3.2 Given Empty Mood should throw MoodAnalysisException
    @Test
    public void givenEmpty_MoodShould_ThrowException() throws MoodAnalysisException {
        MoodAnalyserProblem moodAnalyser = new MoodAnalyserProblem("");

        try
        {
            moodAnalyser.analyseMood("");
        }catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.MoodAnalysisCustomException.EMPTY,e.type);
        }
    }
}
