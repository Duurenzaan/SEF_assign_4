package classes;
import java.util.List;

public class Course {
    private List<Assessment> assessments;
    public boolean createNewAssessment(
        String name, 
        String description, 
        int points,
        String submissionType, 
        boolean group, 
        String groupingName,
        String publishDateTime, 
        String dueDateTime,
        String hideDateTime
    ) {
        boolean valid = true;
        //TODO: Validate all the provided parameters.
        //if the assessment parameters meet the given conditions,
        // the function should create a new Assessment object,
        // add it in the assessments list and then return true.
        //else
        // the function should only return false.
        return valid;
    }
}