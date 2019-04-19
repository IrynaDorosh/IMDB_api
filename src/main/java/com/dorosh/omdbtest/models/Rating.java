package com.dorosh.omdbtest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Rating {

    @JsonProperty("Source")
    private String source;
    @JsonProperty("Value")
    private String value;

    @JsonProperty("Source")
    public String getSource() {
        return source;
    }

    @JsonProperty("Source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("Value")
    public String getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("source", source).append("value", value).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(source).append(value).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Rating)) {
            return false;
        }
        Rating rhs = ((Rating) other);
        return new EqualsBuilder().append(source, rhs.source).append(value, rhs.value).isEquals();
    }
}
