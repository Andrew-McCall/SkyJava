package com.sky;

import java.util.ArrayList;

public interface IDictionary<A,B> {

    public void Add(A key, B value);
    public B Get(A key);
    public ArrayList<B> Values();
    public ArrayList<A> Key();


}
