package entity;

public class comt {
    private String name; //用户昵称
    private String content;//发布内容
    private String comment;//评论
    private int time;//发布时间
    private int comments;//评论数
    private int fabulous;//点赞数
    private int transmits;//转发数


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getFabulous() {
        return fabulous;
    }

    public void setFabulous(int fabulous) {
        this.fabulous = fabulous;
    }

    public int getTransmits() {
        return transmits;
    }

    public void setTransmits(int transmits) {
        this.transmits = transmits;
    }

    @Override
    public String toString() {
        return "comt{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", comment='" + comment + '\'' +
                ", time=" + time +
                ", comments=" + comments +
                ", fabulous=" + fabulous +
                ", transmits=" + transmits +
                '}';
    }
}
