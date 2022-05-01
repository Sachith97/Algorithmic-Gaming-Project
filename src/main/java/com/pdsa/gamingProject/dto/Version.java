package com.pdsa.gamingProject.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Sachith Harshamal
 */
public class Version implements Serializable {

    private static final long serialVersionUID = 1L;

    private String version;

    public Version(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Version version1 = (Version) o;
        return version.equals(version1.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version);
    }

    @Override
    public String toString() {
        return "Version{" +
                "version='" + version + '\'' +
                '}';
    }
}
