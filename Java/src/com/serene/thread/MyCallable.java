package com.serene.thread;

import java.util.concurrent.Callable;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/28
 */
public class MyCallable implements Callable<Boolean> {


    @Override
    public Boolean call() throws Exception {
        return true;
    }
}
