package de.ralfhecktor.architectureblueprint.common;

import org.springframework.util.Assert;

@ValueObject
public abstract class Id<T> {

    private T value;

    public Id(T value) {
        Assert.notNull(value, "The attribute <value> must be present.");
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
