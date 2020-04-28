package de.ralfhecktor.architectureblueprint.common;

/**
 * This is just a marker annotation to better express the type of object according to domain driven design.
 *
 * A value object is an object, which is immutable once created. This is used, if the object has no own life cycle but
 * rather only store a set of static data. If an property of the object needs to be changed, a new instance of the
 * value object needs to be created. In contrast to {@link Entity entities} do value objects not have an identity.
 */
public @interface ValueObject {
}
