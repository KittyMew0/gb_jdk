package geekbrains_course.jdk.lesson5.lecture.ex1;

public class Friend {
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void bow(Friend friend){
        System.out.println(name + ": " + friend.getName() + " ���������� ���");
        friend.bowBack(this);
    }

    private synchronized void bowBack(Friend friend){
        System.out.println(name + ": ��������� � ����� " + friend.getName());
    }
}