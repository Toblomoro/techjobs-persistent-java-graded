package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    public static String description;

    public Skill() {
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Skill.description = description;
    }
}