package com.haw.producer.ais.exceptions;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = false)
public class NoAisStreamConnectionException extends Exception {}