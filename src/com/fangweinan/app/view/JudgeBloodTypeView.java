package com.fangweinan.app.view;

import com.fangweinan.app.model.JudgeBloodTypeModel;
import com.fangweinan.app.ConsoleUtil;

public class JudgeBloodTypeView {
            public static void picture(){
            	//1.欢迎语
            	System.out.println("欢迎使用子女血型判断器V1.0");
            	//2.获取用户输入的父母血型
            	String fatherBloodType=getFatherBloodType();
            	String motherBloodType=getMotherBloodType();
            	//3.调用业务模型
            	String childBloodType=JudgeBloodTypeModel.childBloodType(fatherBloodType, motherBloodType);
            	//4.显示结果
            	System.out.println("您子女的血型可能为"+childBloodType);
            	System.out.println("欢迎下次使用!");
            }
            private static String getFatherBloodType() {
            	String fatherBloodType=null;
            	while(true) {
            		fatherBloodType=ConsoleUtil.readLine("请输入父亲的血型(A,B,O,AB)>A","A");
            		//必须在A，B，O，AB中选择一个
            		if(fatherBloodType.equals("A")||fatherBloodType.equals("B")||fatherBloodType.equals("O")||fatherBloodType.equals("AB")) {
            			break;
            		}else {
            			System.out.println("输入错误，请重新输入：");
            		}
            	}
            	return fatherBloodType;
            }
            private static String getMotherBloodType() {
            	String motherBloodType=null;
            	while(true) {
            		motherBloodType=ConsoleUtil.readLine("请输入母亲的血型(A,B,O,AB)>A","A");
            		//必须在A，B，O，AB中选择一个
            		if(motherBloodType.equals("A")||motherBloodType.equals("B")||motherBloodType.equals("O")||motherBloodType.equals("AB")) {
            			break;
            		}else {
            			System.out.println("输入错误，请重新输入!");
            		}
            	}
            	return motherBloodType;
            }
}
