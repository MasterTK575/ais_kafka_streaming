package com.haw.hurtigruten.messaging.events;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@RegisterForReflection
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
// https://github.com/FasterXML/jackson-docs/wiki/JacksonPolymorphicDeserialization
public abstract class Event {
}
