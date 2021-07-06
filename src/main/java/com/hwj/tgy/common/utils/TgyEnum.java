package com.hwj.tgy.common.utils;

public class TgyEnum {
    /**
     * 路线规划类型
     */
    public enum RoutePlanMode {
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

        private RoutePlanMode(String name,int index) {
            this.name = name;
            this.index = index;
        }

        public static String getNameByIndex(Integer index) {
            for (RoutePlanMode navigationMode:RoutePlanMode.values() ) {
                if (navigationMode.getIndex() == index) {
                    return navigationMode.getName();
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return this.index + "-" + this.name;
        }


    }

    /**
     * 路线规划类型
     */
    public enum NavigationType {
        routePlan("路线规划",1);

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

        private NavigationType(String name,int index) {
            this.name = name;
            this.index = index;
        }

        public static String getNameByIndex(Integer index) {
            for (RoutePlanMode navigationMode: RoutePlanMode.values() ) {
                if (navigationMode.getIndex() == index) {
                    return navigationMode.getName();
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return this.index + "-" + this.name;
        }


    }
}
