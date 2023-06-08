package leetcode75;
/*
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted
in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and
false otherwise.
*/

public class FlowerPlacement {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed.length > 1) {
                        if (flowerbed[i+1] == 0) {
                            n = n - 1;
                            flowerbed[i] = 1;
                        }
                    }
                    else {
                        n = n - 1;
                    }
                }

                else if (i == flowerbed.length - 1) {
                    if (flowerbed[i-1] == 0) {
                        n = n - 1;
                        flowerbed[i] = 1;
                    }
                }

                else {
                    if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                        n = n - 1;
                        flowerbed[i] = 1;
                    }
                }
            }

            if (n <= 0) {
                return true;
            }

        }
        return false;
    }
}
