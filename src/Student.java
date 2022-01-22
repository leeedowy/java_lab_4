public class Student implements StudentI {

    @Override
    public String EgzamResult(String effort) {
        return effort.equals("nice") ? "dobra" : "zła";
    }

    @Override
    public void sample(String sth) {
        System.out.println(String.format("%s - additional", sth));
    }

    @Override
    public void voice(int volume) {
        System.out.println(String.format("%d - volume", volume));
    }

    @Override
    public String doAction(String voice) {
        return "whatever";
    }

    @Override
    public int calculate(double value) {
        return (int) value;
    }

    @Override
    public String toString() {
        return "Student";
    }
}
