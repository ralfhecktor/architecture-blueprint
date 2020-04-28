package de.ralfhecktor.architectureblueprint.common;

/**
 * This is just a marker annotation to better express the type of object according to domain driven design.
 *
 * An entity is an object, which has an own life cycle and has an identity. This means, it has an unique id by which is
 * can be identified. It exposes functionality upon the object which leads to mutations of its properties.
 */
public @interface Entity {
}
