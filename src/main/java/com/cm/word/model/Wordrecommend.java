package com.cm.word.model;

import java.util.Objects;

public class Wordrecommend {
    private Long id;

    private String title;

    private String firstpicture;

    private String description;

    private String href;

    private String color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstpicture() {
        return firstpicture;
    }

    public void setFirstpicture(String firstpicture) {
        this.firstpicture = firstpicture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wordrecommend{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", firstpicture='" + firstpicture + '\'' +
                ", description='" + description + '\'' +
                ", href='" + href + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wordrecommend that = (Wordrecommend) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(firstpicture, that.firstpicture) &&
                Objects.equals(description, that.description) &&
                Objects.equals(href, that.href) &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, firstpicture, description, href, color);
    }
}