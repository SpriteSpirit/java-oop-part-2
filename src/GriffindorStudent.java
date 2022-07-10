public class GriffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GriffindorStudent(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compareGriffindor(GriffindorStudent griffindorStudent) {
        int ability1 = ability();
        int ability2 = griffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s is better then student %s%n", getName(), griffindorStudent.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Student %s is better then student %s%n", griffindorStudent.getName(),getName());
        } else {
            System.out.printf("Student %s is like student %s%n", griffindorStudent.getName(),getName());
        }
    }
    @Override
    public int ability() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return String.format("%s; nobility: %d; honor: %d; bravery: %d",super.toString(), nobility, honor, bravery);
    }
}
