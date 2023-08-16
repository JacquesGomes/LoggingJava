package org.example.model;

public class NotePlain {

    private Long noteId;
    private String header = "";
    private String body = "";
    private String comment = "";

    public NotePlain(){
    }

    public NotePlain(Long noteId, String header, String body, String comment) {
        this.noteId = noteId;
        this.header = header;
        this.body = body;
        this.comment = comment;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getNoteInfo() {
        return "NotePlain:" +
                "noteId=" + noteId +
                ", header='" + header +
                ", body='" + body  +
                ", comment='" + comment;
    }
}
