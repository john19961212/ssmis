package action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by tose on 2017/4/12.
 */
public class TeacherAction extends ActionSupport {
//    private TeacherDAOInterface teacherDAOInterface;
//    private TeacherEntity teacherEntity;
    private String rsp;
    private Map<String,Object> session;

    public String teacherLogin(){

        return SUCCESS;
    }

    public String teahcerLogout(){

        return SUCCESS;

    }

    public String getTeacher(){

        return SUCCESS;

    }

    public String modifyTeacher(){

        return SUCCESS;

    }

    public String addCourses(){

        return SUCCESS;

    }

    public String addCourse(){

        return SUCCESS;

    }

    public String modifyCourses(){

        return SUCCESS;

    }

    public String modifyCourse(){

        return SUCCESS;

    }

    public String deleteCourses(){

        return SUCCESS;

    }

    public String deleteCourse(){

        return SUCCESS;
    }

    public String addExams(){

        return SUCCESS;
    }

    public String addExam(){

        return SUCCESS;
    }

    public String modifyExams(){

        return SUCCESS;
    }

    public String modifyExam(){

        return SUCCESS;
    }

}