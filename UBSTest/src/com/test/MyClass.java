package com.test;

class Solution {
    public int solution(String A, String B) {
        
        char[] aliceArray=A.toCharArray();
        char[] bobArray=B.toCharArray();
        
        int minLength = Math.min(aliceArray.length, bobArray.length);
        int countOfA=0;
        int countOfB=0;
        for(int i=0;i<minLength;i++){
        	char first= aliceArray[i];
        	char second= bobArray[i];
        	int rankOfA= checkRank(first);
        	int rankOfB=checkRank(second);
        	if(first!=second){
        		if(rankOfA>rankOfB){
        			countOfA++;
        		}else{
        			countOfB++;
        		}
        	}
        }
        if(countOfA>countOfB){
        	return countOfA;
        }else{
        	return countOfB;
        }
        	
    }
    private int checkRank(char ch){
    	char [] rankArray={'A','K','Q','J','T','9','8','7','6','5','4','3','2'};
    	int rank=0;
    	for(int i=0;i<rankArray.length;i++){
    		if(rankArray[i]==ch){
    			return i;
    		}
    	}
    	return rank;
    }
}
