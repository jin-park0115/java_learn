package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Programmers_178871 {
    public String[] solution(String[] players, String[] callings) {
    	
       Map<String, Integer> rankingMap = new HashMap<>();
       //현재 등수 저장 
       for (int i = 0; i < players.length; i++) {
    	   rankingMap.put(players[i], i);
    	   
       }
       for (String calling: callings) {
    	   int currentRank = rankingMap.get(calling);
    	   
    	   int frontRank = currentRank - 1;
    	   String frontPlayer = players[frontRank];
    	   
    	   players[frontRank] = calling;
    	   players[currentRank] = frontPlayer;
    	   
    	   rankingMap.put(calling, frontRank);
    	   rankingMap.put(frontPlayer, currentRank);
       }
       return players;
    }
}
