package com.zsd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 测试输入参数值.
 *
 * @author zhousd
 */

public class ArgsTest {

    public static void main(String[] args) {

        System.out.println("请选择你看过的动画片：\n"
                + "1、圣斗士\n"
                + "2、七龙珠\n"
                + "3、喜羊羊与灰太狼\n"
                + "4、聪明的一休\n");
        System.out.print("请输入你看过的动画片的数字编号>");
        int type;
        if (args.length >= 1) {
            type = new Integer(args[0]);
        } else {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                type = Integer.parseInt(br.readLine());
            } catch (Exception ex) {
                ex.printStackTrace();
                return;
            }
        }
        switch (type) {
            case 1:
                System.out.println("很好看！");
                break;
            case 2:
                System.out.println("很可爱！");
                break;
            case 3:
                System.out.println("90后？？");
                break;
            case 4:
                System.out.println("很聪明！");
                break;
            default:
                System.out.println("比较悲惨的童年！");
                break;
        }
    }

}
