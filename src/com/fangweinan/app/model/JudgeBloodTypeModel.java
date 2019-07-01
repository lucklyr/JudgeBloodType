package com.fangweinan.app.model;

public class JudgeBloodTypeModel {
/**
 * 输入父母的血型返回子女的血型
 * @param fatherBloodType 父亲的血型
 * @param motherBloodType 母亲的血型
 * @return 子女可能的血型
 */
	public static String childBloodType(String fatherBloodType,String motherBloodType) {
		//1.验证和清理参数
		//2.调用业务方法
		String finalresult=doJudgeChildBloodTypeByParents(fatherBloodType,motherBloodType);
		//3.返回结果
		return finalresult;
	}
    private static String doJudgeChildBloodTypeByParents(String fatherBloodType,String motherBloodType) {
    	String result = null;
    	if(fatherBloodType.equals("O")) {
    		result=fatherBloodTypeO(motherBloodType);
    	}else if(fatherBloodType.equals("A")) {
    		result=fatherBloodTypeA(motherBloodType);
    	}else if (fatherBloodType.equals("B")) {
    		result=fatherBloodTypeB(motherBloodType);
		}else if (fatherBloodType.equals("AB")) {
			result=fatherBloodTypeAB(motherBloodType);
		}
		return result;
    }
    private static String fatherBloodTypeO(String motherBloodType) {
    	String resultO=null;
    	if(motherBloodType.equals("O")) {
    	    	resultO="O";
    	  }else if(motherBloodType.equals("A")){
    	        resultO="A,O";
    	  }else if(motherBloodType.equals("B")){
    	        resultO="B,O";
    	  }else if(motherBloodType.equals("AB")) {
    	    	resultO="A,B";
    	    	}
    	return resultO;
    }
    private static String fatherBloodTypeA(String motherBloodType) {
    	String resultA=null;
    	if(motherBloodType.equals("O")) {
    	    	resultA="A,O";
    	  }else if(motherBloodType.equals("A")){
    	        resultA="A,O";
    	  }else if(motherBloodType.equals("B")){
    	        resultA="A,B,AB,O";
    	  }else if(motherBloodType.equals("AB")) {
    	    	resultA="A,B,AB";
    	    	}
    	return resultA;
    }
    private static String fatherBloodTypeB(String motherBloodType) {
    	String resultB=null;
    	if(motherBloodType.equals("O")) {
    	    	resultB="B,O";
    	  }else if(motherBloodType.equals("A")){
    	        resultB="A,B,AB,O";
    	  }else if(motherBloodType.equals("B")){
    	        resultB="B,O";
    	  }else if(motherBloodType.equals("AB")) {
    	    	resultB="A,B,AB";
    	    	}
    	return resultB;
    }
    private static String fatherBloodTypeAB(String motherBloodType) {
    	String resultAB=null;
    	if(motherBloodType.equals("O")) {
    		resultAB="A,B";
    	}else if(motherBloodType.equals("A")){
    		resultAB="A,B,AB";
    	}else if(motherBloodType.equals("B")){
    		resultAB="A,B,AB";
    	}else if(motherBloodType.equals("AB")) {
    		resultAB="A,B,AB";
    	}
		return resultAB;
    }
}
