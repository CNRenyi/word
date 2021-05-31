package com.cm.word.model;

import java.util.Objects;

public class Seniorhighschool {
    private Long id;

    private String word;

    private String chinese;

    private Integer type;

    private String createtime;

    private String updatetime;

    private String example;

    private String picture;

    private String voice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seniorhighschool that = (Seniorhighschool) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(word, that.word) &&
                Objects.equals(chinese, that.chinese) &&
                Objects.equals(type, that.type) &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(updatetime, that.updatetime) &&
                Objects.equals(example, that.example) &&
                Objects.equals(picture, that.picture) &&
                Objects.equals(voice, that.voice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, word, chinese, type, createtime, updatetime, example, picture, voice);
    }

    @Override
    public String toString() {
        return "Seniorhighschool{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", chinese='" + chinese + '\'' +
                ", type=" + type +
                ", createtime='" + createtime + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", example='" + example + '\'' +
                ", picture='" + picture + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }
}