package com.serene.ZhangHao;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/24
 */
public class MMS_Homework_1 {
    public static void main(String[] args) {
        // 假定为矩阵
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            arr[i] = convert(sc.nextLine());
        }
        print(arr);

        int times = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < times - 1; i++) {
            arr = infect(arr);
            print(arr);
        }

        System.out.println(countZeros(arr));
    }

    public static int[][] infect(int[][] arr) {
        int[][] res = new int[arr.length][arr.length];

        for (int i = 0; i < res.length; i++) {
            System.arraycopy(arr[i], 0, res[i], 0, res[i].length);
        }

        int[] up = {0, 0};
        int[] down = {0, 0};
        int[] left = {0, 0};
        int[] right = {0, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == -1) {
                    up[0] = Math.max(i - 1, 0);
                    down[0] = Math.min(i + 1, arr.length - 1);
                    left[1] = Math.max(j - 1, 0);
                    right[1] = Math.min(j + 1, arr[i].length - 1);

                    up[1] = j;
                    down[1] = j;
                    left[0] = i;
                    right[0] = i;

                    if (res[up[0]][up[1]] != 0) {
                        res[up[0]][up[1]] = -1;
                    }

                    if (res[down[0]][down[1]] != 0) {
                        res[down[0]][down[1]] = -1;
                    }
                    if (res[left[0]][left[1]] != 0) {
                        res[left[0]][left[1]] = -1;
                    }
                    if (res[right[0]][right[1]] != 0) {
                        res[right[0]][right[1]] = -1;
                    }
                }
            }
        }

        return res;

    }

    public static int[] convert(String s) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int res = switch (ch) {
                case '.' -> 1;
                case '@' -> -1;
                // # 解析为空，输入数据无误，归为default分支
                default -> 0;
            };
            arr[i] = res;
        }
        return arr;
    }

    public static int countZeros(int[][] arr) {
        int count = 0;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == -1) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void print(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == -1) {
                    System.out.print(anInt + " ");
                } else {
                    System.out.print(" " + anInt + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
