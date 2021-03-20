package com.midterm;

// ---Everything in the interface uses abstract methods.

public interface Volume {
    double getVolume();
    void volume();
}

/*

Because not all classes use "volume", so I apply
the interface instead of abstract.

Instead of writing the "volume" method manually,
I decided to use an Interface to manage the code so it is reusable.

*/