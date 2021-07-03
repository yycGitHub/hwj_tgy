package com.hwj.tgy.common.utils;

public class TgyEnum {
    /**
     * 导航类型
     */
    public enum NavigationMode {
        driving("driving",1),walking("walking",2),bicycling("bicycling",3),transit("transit",4);

        private String name;
        private int index;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        private NavigationMode(String name,int index) {
            this.name = name;
            this.index = index;
        }

        public static String getNameByIndex(Integer index) {
            for (NavigationMode navigationMode:NavigationMode.values() ) {
                if (navigationMode.getIndex() == index) {
                    return navigationMode.getName();
                }
            }
            return null;
        }

        public String ge() {
            return this.index + "-" + this.name;
        }

        @Override
        public String toString() {
            return this.index + "-" + this.name;
        }


    }
}
