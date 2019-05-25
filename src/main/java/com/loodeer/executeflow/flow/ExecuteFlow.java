package com.loodeer.executeflow.flow;

/**
 * @author loodeer
 * @date 2019-05-26 02:03
 */
public interface ExecuteFlow<I, O> {
    O execute(I i);
}
