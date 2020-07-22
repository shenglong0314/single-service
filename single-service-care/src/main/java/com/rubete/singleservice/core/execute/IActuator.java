package com.rubete.singleservice.core.execute;

import com.rubete.singleservice.core.Parameter.ParameterActuator;

import java.util.function.Function;

public interface IActuator {
    Object action(IActuator actuator);
}
