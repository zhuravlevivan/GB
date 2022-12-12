package org.example;

public class Main {
    public static void main(String[] args) {
        HanoiTower();
    }
        public static void HanoiTower(String from, String to, String buf, Integer discCount) {
            if (discCount > 1) {
                HanoiTower(from, buf, to, discCount -1);
            }
            System.out.printf("%s -> %s\n", from, to);
            if (discCount > 1) {
                HanoiTower(buf, to, from, discCount -1);
            }
        }

        public static void HanoiTower() {
            HanoiTower("1", "3", "2", 3);
    }
}



