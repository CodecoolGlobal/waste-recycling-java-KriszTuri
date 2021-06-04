package com.codecool.wasterecycling;

public class Main {

        public static void main(String[] args) {
            Dustbin dustbin = new Dustbin();
            Garbage houseWaste = new Garbage();
            //garbage contents
            PaperGarbage paperGarbage = new PaperGarbage("sticky note", "paper");
            PlasticGarbage plasticGarbage = new PlasticGarbage("plastic fork", "plastic");

            dustbin.changeColor("Green");
            dustbin.throwoutGarbage(houseWaste.getName(), houseWaste.garbageType,true);
            System.out.println("Before cleaning and squeezing:");
            //before cleaning and squeezing
            dustbin.throwoutGarbage(paperGarbage.getName(), paperGarbage.garbageType, paperGarbage.isSqueezed());
            dustbin.throwoutGarbage(plasticGarbage.getName(), plasticGarbage.garbageType, plasticGarbage.isClean());
            System.out.println("------------");
            dustbin.displayContents();
            System.out.println("After cleaning and squeezing:");
            //after cleaning and squeezing
            paperGarbage.squeeze();
            plasticGarbage.clean();
            dustbin.throwoutGarbage(paperGarbage.getName(), paperGarbage.garbageType, paperGarbage.isSqueezed());
            dustbin.throwoutGarbage(plasticGarbage.getName(), plasticGarbage.garbageType, plasticGarbage.isClean());
            System.out.println("------------");
            dustbin.displayContents();

    }
}
