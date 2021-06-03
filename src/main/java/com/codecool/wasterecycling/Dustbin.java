package com.codecool.wasterecycling;

import java.util.ArrayList;
import java.util.Locale;

public class Dustbin {
        private String color = "Default";

        protected final void changeColor(String newColor){
                this.color = newColor;
        }

        public String getColor(){
                return this.color;
        }


       public void throwOutGarbage(String garbageType, String Garbage, ArrayList<String> houseWaste, ArrayList<String> plasticWaste, ArrayList<String> paperWaste) {
               String[] acceptedGarbageTypes = {"plastic", "paper", "garbage"};
               String correctGarbageType = " ";
                for (String acceptedGarbageType : acceptedGarbageTypes) {
                        if (garbageType.toLowerCase().matches(acceptedGarbageType)) {
                                correctGarbageType = garbageType;
                                break;
                        }
                }
                switch(correctGarbageType) {
                        case "plastic":
                                plasticWaste.add(Garbage);
                                break;
                        case "paper":
                                paperWaste.add(Garbage);
                                break;
                        case "garbage":
                                houseWaste.add(Garbage);
                                break;
                }
       }

        public int getHouseWasteCount(ArrayList<String> houseWaste){
                return houseWaste.size();
        }

        public int getPaperCount(ArrayList<String> paperWaste){
                return paperWaste.size();
        }

        public int getPlasticCount(ArrayList<String> plasticWaste){
                return plasticWaste.size();
        }

        public void emptyContents(ArrayList<String> houseWaste, ArrayList<String> paperWaste, ArrayList<String> plasticWaste){
                houseWaste.clear();
                paperWaste.clear();
                plasticWaste.clear();
        }

        public void garbageBinContent(ArrayList<String> houseWaste, ArrayList<String> paperWaste, ArrayList<String> plasticWaste){
                String garbageBinColor = getColor();
                String houseWasteCount = String.valueOf(getHouseWasteCount(houseWaste));
                String paperCount = String.valueOf(getPaperCount(paperWaste));
                String plasticCount = String.valueOf(getPlasticCount(plasticWaste));

                System.out.printf("%s Dustbin! %n House waste content: %s item(s)", garbageBinColor, houseWasteCount);
                System.out.println();
                for (int index = 0; index < houseWaste.size(); index++){
                        System.out.printf("%s nr %d", houseWaste.get(index), index+1);
                        System.out.println();
                }
                System.out.printf("Paper content: %s item(s)", paperCount);
                for (int index = 0; index < paperWaste.size(); index++){
                        System.out.printf("%s nr %d", paperWaste.get(index), index+1);
                        System.out.println();
                }
                System.out.printf("Plastic content: %s item(s)", plasticCount);
                for (int index = 0; index < plasticWaste.size(); index++){
                        System.out.printf("%s nr %d", plasticWaste.get(index), index+1);
                        System.out.println();
                }
        }
}
