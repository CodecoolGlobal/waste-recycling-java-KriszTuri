package com.codecool.wasterecycling;

import java.util.ArrayList;

public class PlasticGarbage extends Garbage {
        public boolean isClean = false;
        public PlasticGarbage(String name, String garbageType) {
                super(name, garbageType);
        }
        public PlasticGarbage(){

        }

        public boolean isClean(){
                return this.isClean;
        }

        public void clean(){
                this.isClean = true;
        }
}
