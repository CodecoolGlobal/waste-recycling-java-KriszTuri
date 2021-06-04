package com.codecool.wasterecycling;

import java.util.ArrayList;

public class Garbage {
        private String name = "Garbage";
        public String garbageType = "householdWaste";

        protected final void setName(String garbageName){ this.name = garbageName; }
        public String getName(){ return this.name; }

        public Garbage(String name, String garbageType) {
                this.setName(name);
                this.garbageType = garbageType;
        }

        public Garbage(){
        }
}
