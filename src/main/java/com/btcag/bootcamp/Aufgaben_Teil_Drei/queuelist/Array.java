package com.btcag.bootcamp.Aufgaben_Teil_Drei.queuelist;

public interface Array {

    default int popFront(){
        return 0;
    }

    default int popLast(){
        return 0;
    }

    default int pushLast(int i){
        return 0;
    }

    default int pushFront(int i){
        return 0;
    }

    default int get(int i){
        return 0;
    }
}
