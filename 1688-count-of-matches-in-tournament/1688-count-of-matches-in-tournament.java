class Solution {
    public int numberOfMatches(int n) {
        int matches = 0, teamsAdvance = 0;
        int currentNum = n;
        while(currentNum != 1){
            if(currentNum % 2 == 0){
                matches = (currentNum / 2) + matches;
                teamsAdvance = currentNum / 2;
            }
            else{
                 matches = ((currentNum - 1) / 2) + matches;
                teamsAdvance = (currentNum - 1) / 2 + 1;
            }
            currentNum = teamsAdvance;
        }
        return matches;
    }
}