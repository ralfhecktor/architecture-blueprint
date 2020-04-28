package de.ralfhecktor.architectureblueprint.common;

/**
 * This is just a marker annotation to better express the type of object according to domain driven design.
 *
 * An aggregate is a logical group of several {@link Entity entites} and {@link ValueObject value objects}. All
 * operations on the entities and value objects within that group MUST be performed via the aggregate root. The
 * aggregate root itself is an entity again but with the special purpose of serving functionality to the outside of
 * the aggregate.
 */
@Entity
public @interface AggregateRoot {
}
