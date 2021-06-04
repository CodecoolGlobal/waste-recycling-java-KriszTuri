package com.codecool.wasterecycling;

import java.util.ArrayList;

public class PaperGarbage extends Garbage {
        public boolean isSqueezed = false;

        public PaperGarbage(String name, String garbageType) {
                super(name, garbageType);
        }

        public PaperGarbage(){

        }

        public boolean isSqueezed(){
                return this.isSqueezed;
        }

        public void squeeze(){
                this.isSqueezed = true;
        }

}
