package Collections_Stage_1.Q8;

public class Student {

    private int id;
    private int maths;
    private int physics;
    private int chemistry;

    public Student(int id, int maths, int physics, int chemistry) {
        this.id = id;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", maths=" + maths +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                '}';
    }


}
