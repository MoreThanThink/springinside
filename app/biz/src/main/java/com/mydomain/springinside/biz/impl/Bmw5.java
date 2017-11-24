package com.mydomain.springinside.biz.impl;

import com.mydomain.springinside.biz.Car;
import com.mydomain.springinside.biz.Engine;

/**
 * @author jyl25609
 * @version Id: Bmw5, v 0.1 2017-11-24 15:31:35 jyl25609 Exp $
 */
public class Bmw5 implements Car {

    private Engine engine;

    @Override
    public void run() {

    }

    @Override
    public void reviews() {
        engine.type();
    }

    /**
     * engine setter
     *
     * @param engine engine
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
