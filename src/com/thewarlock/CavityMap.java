package com.thewarlock;

public class CavityMap {

    static String[] cavityMap(String[] grid) {
        StringBuffer str[] = new StringBuffer[grid.length];
        for (int i = 0; i < grid.length; i++) {
            str[i] = new StringBuffer(grid[i]);
        }


        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length() - 1; j++) {
                int current = Integer.parseInt(String.valueOf(grid[i].charAt(j)));
                int up = Integer.parseInt(String.valueOf(grid[i - 1].charAt(j)));
                int down = Integer.parseInt(String.valueOf(grid[i + 1].charAt(j)));
                int left = Integer.parseInt(String.valueOf(grid[i].charAt(j - 1)));
                int right = Integer.parseInt(String.valueOf(grid[i].charAt(j + 1)));
                if (current > up && current > down && current > left && current > right)
                    str[i].setCharAt(j, 'X');
            }
        }
        String[] result = new String[grid.length];
        for (int i = 0; i < grid.length; i++) {
            result[i] = new String(str[i]);
        }
        return result;
    }


    public static void main(String[] args) {
        String[] grid = {"1112",
                "1912",
                "1892",
                "1234"};
        String string[] = cavityMap(grid);
        for(int i=0;i<string.length;i++)
            System.out.println(string[i]);
    }
}
