package jdbc.descriptionclasses;

public class MaxProjectsCount {
    private String name;
    private int project_count;

    public MaxProjectsCount(String name, int project_count) {
        this.name = name;
        this.project_count = project_count;
    }

    public String getName() {
        return name;
    }

    public int getProject_count() {
        return project_count;
    }
}