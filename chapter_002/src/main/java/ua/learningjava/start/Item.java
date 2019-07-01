package ua.learningjava.start;

public class Item {
    private String name;
    private String id;
    private long time;
    private String desc;
    private String[] comments;

    public Item() {
    }

    public Item(String name, String desc, long time) {
        this.name = name;
        this.desc = desc;
        this.time = time;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

}
