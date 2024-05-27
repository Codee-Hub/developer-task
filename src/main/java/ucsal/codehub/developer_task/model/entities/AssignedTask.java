package ucsal.codehub.developer_task.model.entities;

import ucsal.codehub.developer_task.model.enums.AssignedTaskStatus;

public class AssignedTask {
    private static Integer idCount = 0;

    protected String name;
    protected Integer id;
    protected Person person;
    protected AssignedTaskStatus status;

    public AssignedTask() {}

    public AssignedTask(String name, Person person) {
        this.name = name;
        this.person = person;
        this.id = getNewId();
        this.status = AssignedTaskStatus.PENDING;
    }

    public AssignedTask(String name, Person person , Integer id) {
        this.name = name;
        this.person = person;
        this.id = id;
        this.status = AssignedTaskStatus.PENDING;
    }

    private Integer getNewId(){
        return idCount++;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AssignedTaskStatus getStatus() {
        return status;
    }

    public void setStatus(AssignedTaskStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AssignedTask{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", person=" + person +
                ", status=" + status +
                '}';
    }
}
