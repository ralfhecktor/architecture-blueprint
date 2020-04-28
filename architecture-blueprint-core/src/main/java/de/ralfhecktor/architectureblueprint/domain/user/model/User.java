package de.ralfhecktor.architectureblueprint.domain.user.model;

import org.springframework.util.Assert;

import de.ralfhecktor.architectureblueprint.common.Entity;

@Entity
public class User {

    private UserId id;
    private String name;

    public User(UserId id, String name) {
        Assert.notNull(id, "The attribute <id> must be present!");

        this.id = id;
        this.name = name;
    }

    public UserId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
