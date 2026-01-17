import java.util.Objects;

public class StudentSingletone {

    private static StudentSingletone student;

    private StudentSingletone(){

    }

    public static StudentSingletone getObject(){
        if (Objects.isNull(student)){
            student = new StudentSingletone();
        }
        return student;
    }

}
