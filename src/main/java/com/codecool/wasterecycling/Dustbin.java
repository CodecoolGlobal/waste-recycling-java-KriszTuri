package com.codecool.wasterecycling;

import java.util.ArrayList;

public class Dustbin {
        private String color = "Default";

        protected final void changeColor(String newColor){
                this.color = newColor;
        }
        public ArrayList<String> houseWaste = new ArrayList<>();
        public ArrayList<String> paperWaste = new ArrayList<>();
        public ArrayList<String> plasticWaste = new ArrayList<>();
        public Dustbin(){

        }

        public String getColor(){
                return this.color;
        }
        public void throwoutGarbage(String Garbage, String garbageType, boolean isCleanOrSqueezed) {
                switch(garbageType){
                        case "plastic":
                                if (isCleanOrSqueezed) {
                                        plasticWaste.add(Garbage);
                                }
                                else {
                                        System.out.printf("%s is not clean!", Garbage);
                                        System.out.println(" ");
                                }
                                break;

                        case "paper":
                                if (isCleanOrSqueezed) {
                                        paperWaste.add(Garbage);
                                }
                                else {
                                        System.out.printf("%s is not clean!", Garbage);
                                        System.out.println(" ");
                                }
                                break;

                        case "householdWaste":
                                houseWaste.add(Garbage);
                                break;
                }
        }

        public int getHouseWasteCount(){
                        return houseWaste.size();
                }

        public int getPaperCount(){
                        return paperWaste.size();
                }

        public int getPlasticCount(){
                        return plasticWaste.size();
                }

        public void emptyContents(){
                houseWaste.clear();
                paperWaste.clear();
                plasticWaste.clear();
        }

        public void displayContents(){
                String garbageBinColor = getColor();
                String houseWasteCount = String.valueOf(getHouseWasteCount());
                String paperCount = String.valueOf(getPaperCount());
                String plasticCount = String.valueOf(getPlasticCount());

                System.out.printf("%s Dustbin! %n House waste content: %s item(s) ", garbageBinColor, houseWasteCount);
                for (int index = 0; index < houseWaste.size(); index++){
                        System.out.printf("%s nr %d", houseWaste.get(index), index+1);
                        System.out.println();
                        }
                System.out.printf("Paper content: %s item(s) ", paperCount);
                for (int index = 0; index < paperWaste.size(); index++){
                        System.out.printf("%s nr %d", paperWaste.get(index), index+1);
                        System.out.println();
                }
                System.out.printf("Plastic content: %s item(s) ", plasticCount);
                for (int index = 0; index < plasticWaste.size(); index++){
                        System.out.printf("%s nr %d", plasticWaste.get(index), index+1);
                        System.out.println();
                }
                System.out.println();
        }

}
