package com.sky;

import java.util.ArrayList;

public class ARDictionary<A,B> implements IDictionary<A,B>{

    private ArrayList<A> Keys = new ArrayList<A>();
    private ArrayList<B> Values = new ArrayList<B>();

    public static void HelloWorld(){
        System.out.println("Hello World!");
    }

    @Override
    public void Add(A key, B value) {
        this.Keys.add(key);
        this.Values.add(value);
    }

    @Override
    public B Get(A key) {
        for (int i = 0; i < this.Keys.size(); i++) {
            if (this.Keys.get(i).equals(key)) {
                return this.Values.get(i);
            }
        }
        return null;
        /*
        int index = Keys.indexOf(key);
        if (index == -1) return null;
        return Values.get(index);
         */
    }

    @Override
    public ArrayList<B> Values() {
        return this.Values;
    }

    @Override
    public ArrayList<A> Key() {
        return this.Keys;
    }
}
