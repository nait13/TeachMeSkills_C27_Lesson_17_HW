package com.teachmeskills.lesson17_hw.task_1;

/**
 * Functional interface with one method and no implementation
 */
@FunctionalInterface
public interface MyFunctionalInterface<T> {
    T doSomething(T obj);
}
