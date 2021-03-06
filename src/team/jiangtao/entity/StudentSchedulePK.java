package team.jiangtao.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by lihuibo on 4/25/17.
 */
public class StudentSchedulePK implements Serializable {
    private String dpm;
    private String crs;
    private String tch;
    private String stu;

    @Column(name = "dpm")
    @Id
    public String getDpm() {
        return dpm;
    }

    public void setDpm(String dpm) {
        this.dpm = dpm;
    }

    @Column(name = "crs")
    @Id
    public String getCrs() {
        return crs;
    }

    public void setCrs(String crs) {
        this.crs = crs;
    }

    @Column(name = "tch")
    @Id
    public String getTch() {
        return tch;
    }

    public void setTch(String tch) {
        this.tch = tch;
    }

    @Column(name = "stu")
    @Id
    public String getStu() {
        return stu;
    }

    public void setStu(String stu) {
        this.stu = stu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentSchedulePK that = (StudentSchedulePK) o;

        if (dpm != null ? !dpm.equals(that.dpm) : that.dpm != null) return false;
        if (crs != null ? !crs.equals(that.crs) : that.crs != null) return false;
        if (tch != null ? !tch.equals(that.tch) : that.tch != null) return false;
        if (stu != null ? !stu.equals(that.stu) : that.stu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dpm != null ? dpm.hashCode() : 0;
        result = 31 * result + (crs != null ? crs.hashCode() : 0);
        result = 31 * result + (tch != null ? tch.hashCode() : 0);
        result = 31 * result + (stu != null ? stu.hashCode() : 0);
        return result;
    }
}
