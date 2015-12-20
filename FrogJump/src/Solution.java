class Solution {
    public int frogJumpSol(int X, int Y, int D) {
     int jumps;  
    if (X == Y)
        jumps = 0;
    else if( ((Y-X) % D) == 0)
        jumps = (Y-X)/D;
    else
        jumps = ((Y-X)/D) + 1;
    return jumps;
    }
}