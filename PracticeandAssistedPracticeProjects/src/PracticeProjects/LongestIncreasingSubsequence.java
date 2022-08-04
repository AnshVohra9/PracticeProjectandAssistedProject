package PracticeProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {
	
	class Card {
		final int i;
		final Card card; // could be null
		
		Card(int i, Card card) {
			this.i = i;
			this.card = card;
		}
		
		@Override
		public String toString() {
			return i + "";
		}
	}
	

	int binarySearchHostPileIdx(List<List<Card>> piles, int i) { 
        int l = 0; // left
        int r = piles.size() - 1; // right 
        int m = -1; // middle
        
        if (piles.isEmpty()) return -1;
        
        while (l <= r) { 
            /*
             * Pick the middle. Same as (l + r) / 2 but does not run the risk of integer overflow
             */
            m =  l + (r - l) / 2;
            
            List<Card> pile = piles.get(m);
            Card c = pile.get(pile.size()-1); // get the top card from this pile
  
            if (c.i == i) return m; // exact match 
  
            if (c.i < i) {
                l = m + 1; // ignore left half
            } else {
                r = m - 1; // ignore right half
            }
        } 
  
        if (l >= piles.size()) return -1;
        
        List<Card> lPile = piles.get(l);
		return lPile.get(lPile.size()-1).i >= i ? l : -1; 
    } 
	private int[] retrieveSeq(List<List<Card>> piles) {
		List<Card> rightPile = piles.get(piles.size()-1);
		Card c = rightPile.get(0);
		int[] seq = new int[piles.size()];
		int k = seq.length-1;

		while (c != null) {
			seq[k--] = c.i;
			c = c.card;
		}
		
		return seq;
	}
	
	public int[] run(int[] ar) {
		
		List<List<Card>> piles = new ArrayList<>();

		for (int k = 0; k < ar.length; k++) {
			int hostPileIdx = binarySearchHostPileIdx(piles, ar[k]);
			
			List<Card> hostPile;
			if (hostPileIdx < 0) { // start a new pile
				hostPile = new ArrayList<>();
				piles.add(hostPile);
				hostPileIdx = piles.size()-1;
			} else {
				hostPile = piles.get(hostPileIdx); // found a host
			}
			
			Card leftCard = null;
			if (hostPileIdx > 0) {
				// except for left most pile, link the card to the top card of the pile immediately on the left
				List<Card> leftPile = piles.get(hostPileIdx-1);
				leftCard = leftPile.get(leftPile.size()-1); // top most card of the pile immediately on the left
			}
			
			hostPile.add(new Card(ar[k], leftCard));
		}

		return retrieveSeq(piles);
	}
	
	public static void main(String[] args) {
		int[] ar = {10, 5, 8, 3, 9, 4, 12, 11};
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		System.out.println(Arrays.toString(lis.run(ar))); // [5, 8, 9, 12 or 11]
	}
}