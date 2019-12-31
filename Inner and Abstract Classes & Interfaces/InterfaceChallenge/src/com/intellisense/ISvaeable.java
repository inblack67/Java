package com.intellisense;

import java.util.List;

interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);
//    Now this interface holds any type of list whatsoever, maximum flex
}
